package com.example.demo.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.example.demo.Interface.ProductInterface;
import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductsRepository;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
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

   public byte[] generatePdfAsByteArray() {
      try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
         Document document = new Document();
         PdfWriter.getInstance(document, baos);

         document.open();

         Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
         Paragraph title = new Paragraph("SeaFood Inventory", titleFont);
         title.setAlignment(Element.ALIGN_CENTER);
         document.add(title);

         document.add(new Paragraph("\n\n"));

         PdfPTable table = new PdfPTable(8);
         table.setWidthPercentage(100);

         Stream.of("ID", "RFID", "Client", "Name", "Quantity", "Weight", "Entry Date", "Exit Date")
                 .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                 });

         Iterable<Product> products = dato.findAll();

         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

         for (Product product : products) {
            table.addCell(String.valueOf(product.getId()));
            table.addCell(product.getRfid().getRfidValue());
            table.addCell(product.getClient());
            table.addCell(product.getName());
            table.addCell(String.valueOf(product.getQuantity()));
            table.addCell(String.valueOf(product.getWeight()));

            // LocalDateTime to Date
            Date entryDate = java.sql.Timestamp.valueOf(product.getEntryDateTime());
            Date exitDate = java.sql.Timestamp.valueOf(product.getExitDateTime());

            table.addCell(dateFormat.format(entryDate));
            table.addCell(dateFormat.format(exitDate));
         }

         document.add(table);

         document.close();

         return baos.toByteArray();
      } catch (IOException | DocumentException e) {
         throw new RuntimeException("Error generating PDF", e);
      }
   }



}
