package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
  @Autowired
  ProductRepo repo;

  public List<Product> getProduct() {
    return repo.findAll();
  }

  public Product getProductByAge(int carno) {

    return repo.findById(carno).orElse(new Product(carno, "not Found", "Not FOUND", null, null, null));
  }

  public void addProduct(List<Product> product) {
    repo.saveAll(product);
  }

}
