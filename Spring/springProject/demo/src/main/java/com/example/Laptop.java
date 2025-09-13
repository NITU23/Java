package com.example;

public class Laptop implements Computer {

    public Laptop() {
        System.out.println("I am constructor of Laptop");
    }

    @Override
    public void build() {
        System.out.println("I am a build method of laptop");
    }

}
