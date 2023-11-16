package com.example.springbootbackend;

import com.example.springbootbackend.model.Product;
import com.example.springbootbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }


    @Autowired
    private ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {
        //Product product = new Product();
        //product.setName("Mero");
        //product.setRFID("1234");
        //product.setWeight(15.6F);
        //productRepository.save(product);
    }
}
