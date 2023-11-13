from django.contrib.auth import authenticate, login, logout
from django.db import IntegrityError
from django.http import HttpResponse, HttpResponseRedirect
from django.shortcuts import render
from django.urls import reverse
from django import forms

from . models import User, Product

class new_entry(forms.Form):
    Name = forms.CharField(max_length=45)  
    RFID = forms.CharField(max_length=45)
    WEIGHT = forms.FloatField()
    EXPIRY_DATE = forms.DateField(required=False)

# Create your views here.  Pseudo-controller
def index(request):
    if request.method == "POST":
        if request.POST["Delete"]:
            product_to_delete = Product.objects.get(pk=request.POST.get("product_id"))
            product_to_delete.delete()
        elif request.POST["Edit"]:
            product_to_edit = Product.objects.get(pk=request.POST.get("product_id"))
            return render(request, "FIFO/add.html", {
                "product" : product_to_edit
            })
        else:
            product = Product(
            name=request.POST["Name"],
            rfid = request.POST["RFID"],
            weight = request.POST["WEIGHT"],
            expiryDate = request.POST["EXPIRY_DATE"])

            product.save()
    return render(request, "FIFO/index.html", {
        "products": Product.objects.all()
    })

def login_view(request):
    if request.method == "POST":

        # Attempt to sign user in
        username = request.POST["username"]
        password = request.POST["password"]
        user = authenticate(request, username=username, password=password)

        # Check if authentication successful
        if user is not None:
            login(request, user)
            return HttpResponseRedirect(reverse("index"))
        else:
            return render(request, "FIFO/login.html", {
                "message": "Invalid username and/or password."
            })
    else:
        return render(request, "FIFO/login.html")


def logout_view(request):
    logout(request)
    return HttpResponseRedirect(reverse("index"))


def register(request):
    if request.method == "POST":
        username = request.POST["username"]
        email = request.POST["email"]

        # Ensure password matches confirmation
        password = request.POST["password"]
        confirmation = request.POST["confirmation"]
        if password != confirmation:
            return render(request, "FIFO/register.html", {
                "message": "Passwords must match."
            })

        # Attempt to create new user
        try:
            user = User.objects.create_user(username, email, password)
            user.save()
        except IntegrityError:
            return render(request, "FIFO/register.html", {
                "message": "Username already taken."
            })
        login(request, user)
        return HttpResponseRedirect(reverse("index"))
    else:
        return render(request, "FIFO/register.html")
    
def add(request):
    product = new_entry
    if request.method == "POST":

        return render(request, "FIFO/add.html", {

        })
    return render(request, "FIFO/add.html", {
        "new_product": product
    })