package com.example.demo.Interface;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Product;

public interface ProductInterface {
   public List<Product>listar();
   public Optional<Product>listarID(int id);
   public int save(Product p);
   public void delete(int id);
}
