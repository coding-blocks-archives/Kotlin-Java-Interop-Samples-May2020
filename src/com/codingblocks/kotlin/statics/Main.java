package com.codingblocks.kotlin.statics;

public class Main {
    public static void main(String[] args) {

        System.out.println("For 10 people to travel 200 km we need");
        System.out.println(Automobile.createFor(10, 200.0F));

        System.out.println("For 2 people to travel 10 km we need");
        System.out.println(Automobile.createFor(2, 10F));
    }
}
