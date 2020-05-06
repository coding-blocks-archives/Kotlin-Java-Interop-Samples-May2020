package com.codingblocks.kotlin.getset;

public class Creator {

    public static void main(String[] args) {
        System.out.println("And God Said, 'Let ther be light'");
        Man adam = new Man();
        Woman eve = new Woman();

        adam.name = "Adam";
        eve.name = "Eve";
    }
}
