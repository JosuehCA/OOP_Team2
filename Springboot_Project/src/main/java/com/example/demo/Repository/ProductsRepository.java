package com.example.demo.Repository;

import com.example.demo.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Integer>{

    Optional<Product> findByRfid_RfidValue(String rfid);
    List<Product> findProductsByExitDateTimeBetween(LocalDateTime exitDate, LocalDateTime interval);
}
