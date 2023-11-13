from django.contrib import admin

from .models import User, Product, Inventory


class available_products(admin.ModelAdmin):
    filter_horizontal = ("type",)

# Register your models here.
admin.site.register(User)
admin.site.register(Product)
admin.site.register(Inventory, available_products)