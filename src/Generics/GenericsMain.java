package Generics;

import Generics.Vehicle;

import java.util.*;

public class GenericsMain{


    public static void printValues(List<Vehicle> list){
        for(Vehicle v : list){
            System.out.println(v);
        }

    }

    public static void printValuesTwo(List<? extends Vehicle> list){
        for(Vehicle v : list){
            System.out.println(v);
        }
    }

    public static void printValuesThree(List<? super Bus> list){

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
     
    }

    public static void printName(Vehicle v){
        System.out.println(v.name);
    }

 

    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle(100,"vehicle1");
        Bus bus1 = new Bus(20,"bus1", 20, "company1");
        Car car1 = new Car(150, "car1", 3);


        ArrayList<Vehicle> firstList = new ArrayList();
        firstList.add(v1);
        firstList.add(bus1);
        firstList.add(car1);
        printValues(firstList);


    

        ArrayList<Car> secondList = new ArrayList();
        secondList.add(car1);
        // printValues(secondList);

        printValuesTwo(firstList);

        printValuesTwo(secondList);


        printValuesThree(firstList);
        // printValuesThree(secondList);






        System.out.println();
        System.out.println();


        firstList.stream()
        .sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
        .filter(o -> o.getTopSpeed() > 30)
        .forEach(o -> System.out.println(o))
        ;


    }



}