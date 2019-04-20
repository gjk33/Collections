package Generics;

public class Vehicle{

int topSpeed;
String name;


public Vehicle(int topSpeed, String name){
    this.topSpeed = topSpeed;
    this.name = name;
}

/**
 * @param topSpeed the topSpeed to set
 */
public void setTopSpeed(int topSpeed) {
    this.topSpeed = topSpeed;
}

/**
 * @return the topSpeed
 */
public int getTopSpeed() {
    return topSpeed;
}


/**
 * @param name the name to set
 */
public void setName(String name) {
    this.name = name;
}

/**
 * @return the name
 */
public String getName() {
    return name;
}


@Override
public String toString() {
    return this.name + " " + this.topSpeed;
}

}