package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "rfid")
public class RFID {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rfid_value")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String rfidValue;

    @OneToOne(mappedBy = "rfid")
    private Product product;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRfidValue() {
        return rfidValue;
    }

    public void setRfidValue(String rfidValue) {
        this.rfidValue = rfidValue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

