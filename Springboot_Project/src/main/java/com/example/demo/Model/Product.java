package com.example.demo.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "items")

public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   @Column(name = "name")
   private String name;
   @Column(name = "weight")
   private float weight;
   @Column(name = "Quantity")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int quantity;

   @Column(name = "Client")
   private String client;

   @Column(name= "entry_date")
   @CreationTimestamp      // Sets the field value to the current timestamp when the entity is first saved
   @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
   private LocalDateTime entryDateTime;
   @Column(name= "exit_date")
   @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
   private LocalDateTime exitDateTime;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "rfid", referencedColumnName = "id")
   private RFID rfid;

   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }

   public RFID getRfid() {
      return rfid;
   }
   public void setRfid(RFID rfid) {
      this.rfid = rfid;
   }

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public float getWeight() {
      return weight;
   }
   public void setWeight(float weight) {
      this.weight = weight;
   }
   public int getQuantity() {
      return quantity;
   }
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public String getClient() {
      return client;
   }
   public void setClient(String client) {
      this.client = client;
   }
   public LocalDateTime getEntryDateTime() {
      return entryDateTime;
   }
   public void setEntryDateTime(LocalDateTime entryDateTime) {
      this.entryDateTime = entryDateTime;
   }
   public void setExitDateTime(LocalDateTime exitDateTime) {
      this.exitDateTime = exitDateTime;
   }
   public LocalDateTime getExitDateTime() {
      return exitDateTime;
   }

}