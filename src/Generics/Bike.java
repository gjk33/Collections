package Generics;

public class Bike extends Vehicle {

    int gears;

    public Bike(int topSpeed, String name, int gears) {
        super(topSpeed, name);
        this.gears = gears;
    }
}
