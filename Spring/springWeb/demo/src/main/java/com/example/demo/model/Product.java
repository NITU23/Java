package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Component
@NoArgsConstructor
@Entity
public class Product {
  @Id
  private int carno;
  private String car;
  private String model;
  private String description;
  private String features;
  private String color;
  @Override
  public String toString() {
    return "Product [carno=" + carno + ", car=" + car + ", model=" + model + ", description=" + description
        + ", features=" + features + ", color=" + color + "]";
  }
  
 
}
