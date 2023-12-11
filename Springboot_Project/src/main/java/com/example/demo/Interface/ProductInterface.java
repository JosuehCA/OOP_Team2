package com.example.demo.Interface;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Product;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

public interface ProductInterface {
   public List<Product>listar();
   public Optional<Product>listarID(int id);
   public int save(Product p);
   public void delete(int id);

   Optional<Product> findByRfid_RfidValue(String rfid);

   Product processRFIDCode(String code);

   int update(Product product);

   byte[] generatePdfAsByteArray();


   List<Product> findProductsByExitDateTimeBetween();

   boolean areAllAttributesFilled(Product p);
}
