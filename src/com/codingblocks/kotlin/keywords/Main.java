package com.codingblocks.kotlin.keywords;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.when("angry").shout("What is happening?");
        p.when("happy").say("This is awesome !");

        p.setMood("angry");
        p.setMood("happy");
    }
}
