package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
  @Autowired
  ProductService prodService;

  @RequestMapping("/products")
  public List<Product> getProduct() {
    return prodService.getProduct();
  }

  @GetMapping("/products/{carno}") // get mapping & request mapping are almost same..
  public Product getProductByAge(@PathVariable int carno) {
    return prodService.getProductByAge(carno);
  }

  @PostMapping("/products")
  public ResponseEntity<String> addProduct(@RequestBody List<Product> prod) {
    try {
      System.out.println("prod" + prod);
      prodService.addProduct(prod);
      return ResponseEntity.ok(" Product saved successfully!");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Failed to save product: " + e.getMessage());
    }
  }

}
