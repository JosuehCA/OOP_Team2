package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.example.demo.Interface.ProductInterface;
import com.example.demo.Model.Product;


import com.example.demo.Model.RFID;
import com.example.demo.Service.ProductService;
import com.itextpdf.text.DocumentException;
import org.apache.tomcat.util.codec.binary.Base64;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
      List<Product> expireProducts = service.findProductsByExitDateTimeBetween();
      if(!expireProducts.isEmpty()){
         model.addAttribute("alert", "You have products close to expiration");
      }
      return "home";
   }

   @GetMapping("/new")
   public String agregar(Model model) {
      model.addAttribute("Products", new Product());
      return "form";
   }

   @PostMapping("/save")
   public String save(@Validated Product p, Model model) {

      if (!service.areAllAttributesFilled(p)) {
         model.addAttribute("Error", "All attributes must be filled");
         model.addAttribute("Products", new Product());
         return "form";

      }
      service.save(p);
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
   public String actualizar(@ModelAttribute("product") Product product, Model model) {
      int respuesta = service.update(product);

      if (respuesta == 1) {
         return "redirect:/";
      } else {
         model.addAttribute("Error", "All attributes must be filled");
         model.addAttribute("Products", product);
         return "update-form";
      }
   }

   @GetMapping("/editar/{id}")
   public String editar(@PathVariable int id, Model model) {
      Optional<Product> producto = service.listarID(id);
      model.addAttribute("Products", producto);
      return "redirect:/actualizar/" + id;
   }

   @GetMapping("/eliminar/{id}")
   public String delete(@PathVariable int id, Model model) {
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

   @GetMapping("/pdf/generate")
   public String generateAndShowPdf(Model model) {
      byte[] pdfBytes = service.generatePdfAsByteArray();

      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_PDF);
      headers.setContentDispositionFormData("inline", "Report.pdf");

      // Agrega el PDF codificado a Base64 al modelo
      String pdfBase64 = Base64.encodeBase64String(pdfBytes);
      model.addAttribute("pdfBase64", pdfBase64);

      return "pdf/viewer";
   }

}
