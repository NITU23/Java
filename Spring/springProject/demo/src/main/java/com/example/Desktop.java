package com.example;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("I am constructor of Desktop");
    }

    @Override
    public void build() {
        System.out.println("I am a build method of desktop");
    }

}
