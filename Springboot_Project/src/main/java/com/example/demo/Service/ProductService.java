package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Interface.ProductInterface;
import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductInterface {
   
   @Autowired
   private ProductsRepository dato;

   @Override
   public List<Product> listar() {
      return (List<Product>) dato.findAll();
   }

   @Override
   public Optional<Product> listarID(int id) {
      return dato.findById(id);
   }

   @Override
   public int save(Product p) {
      int respuesta = 0;
      Product product = dato.save(p);
      if (!product.equals(null)){
         respuesta = 1;
      }
      return respuesta;
   }

   public int update(Product p) {
      int respuesta = 0;

      Optional<Product> existingProduct = dato.findById(p.getId());

      if (existingProduct.isPresent()) {
         Product product = existingProduct.get();
         product.setClient(p.getClient());
         product.setName(p.getName());
         product.setQuantity(p.getQuantity());
         product.setWeight(p.getWeight());
         product.setRfid(p.getRfid());
         product.setExitDateTime(p.getExitDateTime());

         dato.save(product);
         respuesta = 1;
      }
      return respuesta;
   }

   @Override
   public void delete(int id) {
      dato.deleteById(id);
   }

   @Override
   public Optional<Product> findByRfid_RfidValue(String rfid) {
      return dato.findByRfid_RfidValue(rfid);
   }

   public Product processRFIDCode(String code) {
      if (code != null && !code.isEmpty()) {
         Optional<Product> optionalProduct = dato.findByRfid_RfidValue(code);

         if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setQuantity(product.getQuantity() + 1);
            save(product);
            return product;
         }
      }
      return null;
   }
}
