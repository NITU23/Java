package com.example;

public class Dev {

    // private Laptop laptop; // the commented code for laptop now we are implementing computer
    private int age;
    private Computer com;

    public Dev(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build() {
        System.out.println("Dev Working");
        //laptop.build(); 
        com.build();
    }
    // public Laptop getLaptop() {
    //     return laptop;
    // }
    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }
}
