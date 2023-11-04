from django.contrib.auth.models import AbstractUser
from django.db import models
#from django.utils import timezone

# Create your models here.
class User(AbstractUser):
    pass

class Product(models.Model):
    Name = models.CharField(max_length=45)
    RFID = models.CharField(max_length=30) # Subject to change
    Weight = models.FloatField()
    Entry_date = models.DateTimeField(auto_now_add=True)
    #Exit_date
    Expiry_date = models.DateField()

    def __str__(self):
        return f"{self.Name}"
    
class Inventory(models.Model):
    type = models.ManyToManyField(Product, related_name="relation")

    def __str__(self):
        return f"Inventory #TBA"