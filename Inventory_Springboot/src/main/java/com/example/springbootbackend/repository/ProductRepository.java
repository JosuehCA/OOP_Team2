package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //All CRUD Database Methods

}
