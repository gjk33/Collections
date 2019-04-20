package Generics;

import Generics.Vehicle;

public class Car extends Vehicle implements Motorized {

    int noOfDoors;

    public Car(int topSpeed, String name, int noOfDoors){
        super(topSpeed,name);
        this.noOfDoors = noOfDoors;
    }


/**
 * @param noOfDoors the noOfDoors to set
 */
public void setNoOfDoors(int noOfDoors) {
    this.noOfDoors = noOfDoors;
}

/**
 * @return the noOfDoors
 */
public int getNoOfDoors() {
    return noOfDoors;
}

@Override
public String toString() {
    return super.toString() + " " + noOfDoors;
}

    @Override
    public int returnMPG() {
        return 0;
    }

    public static void main(String[] args) {
        Car Blah = new Car(100, "Blah", 2);
        System.out.println(Blah);

}
}