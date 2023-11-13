from django.contrib.auth.models import AbstractUser
from django.db import models

#from django.utils import timezone

# Create your models here.
class User(AbstractUser):
    # Has Username, FirstName, LastName, Email, Date_Joined, Last_Login and password by default
    pass

class Admin(User):  # Inherits from User
    position = models.CharField(max_length=20)

    def __str__(self):
        return f"{self.Position}"

class Employee(User):       # Inherits from User
    position = models.CharField(max_length=20)

    def __str__(self):
        return f"{self.Position}"

    
class Product(models.Model):
    name = models.CharField(max_length=45)  
    rfid = models.CharField(max_length=45)
    weight = models.FloatField()    
    entryDate = models.DateTimeField(auto_now_add=True)
    #Exit_date
    expiryDate = models.DateField()

    def __str__(self):
        return f"{self.name}"
    
class Inventory(models.Model):
    capacity = models.PositiveIntegerField()
    type = models.ManyToManyField(Product, related_name="relation")

    def __str__(self):
        return f"Inventory #TBA"
    

class Client(models.Model):
    name = models.CharField(max_length=50)
    email = models.CharField(max_length=40) #datosContacto
    #pastOrders

    def __str__(self):
        return f"{self.name}"

class Order(models.Model):
    client = models.ForeignKey(Client,on_delete=models.PROTECT, related_name="related_client")  # on_delete must be modified
    products = models.ManyToManyField(Product, through="OrderProducts") # Join table between Order and Product

    def __str__(self):
        return f"#{self.id} from {self.client}"
    
class OrderProducts(models.Model):  # Many-to-many table between orders and products
    order = models.ForeignKey(Order, on_delete=models.CASCADE)
    product = models.ForeignKey(Product, on_delete=models.CASCADE)
    quantity = models.PositiveIntegerField()

    def __str__(self):
        return f"{self.quantity} x {self.product.name} in order # {self.order.id}"