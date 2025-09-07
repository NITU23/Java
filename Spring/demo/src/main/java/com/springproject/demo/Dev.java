package com.springproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // @Autowired // field injection..... dependency injection--- autowired injection
    private Laptop laptop;

    // public Dev(Laptop laptop) { // constructor injection... without autowired injection..
    //     this.laptop = laptop;
    // }
    @Autowired // for using the setter method we have to use autowired
    @Qualifier("laptop") // use this if more than one component .
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code() {
        laptop.compiler();
        System.out.println("I am code method");
    }
}
