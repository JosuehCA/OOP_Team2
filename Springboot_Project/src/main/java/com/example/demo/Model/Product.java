package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "items")

public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Column(name = "RFID")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long RFID;
   @Column(name = "name")
   private String name;
   @Column(name = "weight")
   private float weight;
   @Column(name= "entry_date")
   @CreationTimestamp
   @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
   private LocalDateTime entryDateTime;
   @Column(name= "exit_date")
   @UpdateTimestamp
   @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
   private LocalDateTime exitDateTime;

   public long getId() {
      return id;
   }
   public void setId(long id) {
      this.id = id;
   }
   public long getRFID() {
      return RFID;
   }
   public void setRFID(long RFID) {
      this.RFID = RFID;
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
   public LocalDateTime getEntryDateTime() {
      return entryDateTime;
   }
   public void setEntryDateTime(LocalDateTime entryDateTime) {
      this.entryDateTime = entryDateTime;
   }
   public void setExitDateTime(LocalDateTime exitDateTime) {
      this.exitDateTime = LocalDateTime.now();
   }
   public LocalDateTime getExitDateTime() {
      return exitDateTime;
   }
}