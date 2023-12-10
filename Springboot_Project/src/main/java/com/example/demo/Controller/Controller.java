package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import com.example.demo.Interface.ProductInterface;
import com.example.demo.Model.Product;


import com.example.demo.Model.RFID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping()
public class Controller {
   
   @Autowired
   private ProductInterface service;

   @GetMapping("/")
   public String listar(Model model){
      List<Product>productos=service.listar();
      model.addAttribute("products", productos);
      return "home";
   }

   @GetMapping("/new")
   public String agregar(Model model){
      model.addAttribute("Products", new Product());
      return "form";
   }

   @PostMapping("/save")
   public String save(@Validated Product p,Model model){
      service.save(p);  // save() uses isNew() to check if entity's id's registered; if it is, calls em.merge(), otherwise it calls em.persist()
      return "redirect:/";
   }

   @GetMapping("/actualizar/{id}")
   public String actualizar(@PathVariable int id, Model model) {
      Optional<Product> producto = service.listarID(id);

      if (producto.isPresent()) {
         model.addAttribute("Products", producto.get());
         return "update-form";
      } else {
         return "redirect:/error";
      }
   }

   @PostMapping("/actualizar")
   public String actualizar(@ModelAttribute("product") Product product) {
      int respuesta = service.update(product);

      if (respuesta == 1) {
         return "redirect:/";
      } else {
         return "redirect:/error";
      }
   }

   @GetMapping("/editar/{id}")
   public String editar(@PathVariable int id, Model model){
      Optional<Product>producto=service.listarID(id);
      model.addAttribute("Products", producto);
      return "redirect:/actualizar/" + id;
   }

   @GetMapping("/eliminar/{id}")
   public String delete(@PathVariable int id, Model model){
      service.delete(id);
      return "redirect:/";
   }

   @GetMapping("/lectura")
   public String processingCode(@ModelAttribute("RFID") RFID rfidValue, Model model) {
      String code = rfidValue.getRfidValue();
      String message;
      Product product = service.processRFIDCode(code);

      if (product != null) {
         model.addAttribute("Product", product);
         message = "Successful reading. Product found.";
      } else {
         message = "Error: Product not found or RFID code is empty or null.";
      }

      List<Product> products = service.listar();
      model.addAttribute("products", products);
      model.addAttribute("message", message);

      return "lectura";
   }


}
