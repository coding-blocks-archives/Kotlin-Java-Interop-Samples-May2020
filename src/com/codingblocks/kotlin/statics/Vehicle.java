package com.codingblocks.kotlin.statics;

public class Vehicle {
    String name;
    int wheels;
    int seats;
    float fuelTankCapacity;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", fuelTankCapacity=" + fuelTankCapacity +
                '}';
    }

    private Vehicle(String name, int wheels, int seats, float fuelTankCapacity) {
        this.name = name;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public static Vehicle createFor(int passengers, float distance) {
        if (passengers < 4) {
            if (distance < 40) return new Vehicle("Auto", 3, 3, 12.5F);
            else return new Vehicle("Car", 4, 4, 45.5F);
        } else {
            if (distance < 500) return new Vehicle("Tempo", 4, 20, 100.0F);
            else return new Vehicle("Volvo", 8, 54, 600.0F);
        }
    }
}
