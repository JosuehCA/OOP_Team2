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

   @GetMapping("/editar/{id}")
   public String editar(@PathVariable int id, Model model){
      Optional<Product>producto=service.listarID(id);
      model.addAttribute("Products", producto);
      return "form";
   }

   @GetMapping("/eliminar/{id}")
   public String delete(@PathVariable int id, Model model){
      service.delete(id);
      return "redirect:/";
   }

   @GetMapping("/lectura")
   public String procesarCodigo(@ModelAttribute("RFID") RFID rfidValue, Model model) {
      String code = rfidValue.getRfidValue();
      String message;

      if (code != null && !code.isEmpty()) {
         Optional<Product> optionalProduct = service.findByRfid_RfidValue(code);

         if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setQuantity(product.getQuantity() + 1);
            service.save(product);

            model.addAttribute("Product", product);
            message = "Successful reading. Product found.";
         } else {
            message = "Error: Product not found.";
         }
      } else {
         message = "Error: RFID code is empty or null.";
      }

      List<Product> products = service.listar();
      model.addAttribute("products", products);
      model.addAttribute("message", message);

      return "lectura";
   }


}
