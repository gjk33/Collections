package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericsMainTwo {


    public static <T extends Vehicle> T getQuickest(List<T> list) {
        Collections.sort(list, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return v2.getTopSpeed() - v1.getTopSpeed();
            }

            ;
        });
        T vehicle = list.get(0);
        return vehicle;
    }

    public static Vehicle getQuickestTwo(List<? extends Vehicle> list) {
        Collections.sort(list, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return v2.getTopSpeed() - v1.getTopSpeed();
            }
        });
        return list.get(0);
    }

    public static Vehicle returnVehicle(Vehicle v){
        return v;
    }

    public static Car returnCar(Car c){
        return c;
    }

    public static Motorized refuel(Motorized v){
        return v;
    }

    public  static <T extends Motorized>  T refuelTwo(T v){
        return v;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(100,"vehicle1");
        Bus bus1 = new Bus(20,"bus1", 20, "company1");
        Car car1 = new Car(150, "car1", 3);


        ArrayList<Vehicle> vehicleArrayList = new ArrayList();
        vehicleArrayList.add(v1);
        vehicleArrayList.add(bus1);
        vehicleArrayList.add(car1);
        vehicleArrayList.forEach( e -> System.out.println(e));

        System.out.println("First Implementation");
        Vehicle fastest = getQuickest(vehicleArrayList);
        System.out.println(fastest.getClass());
        System.out.println(getQuickest(vehicleArrayList).getClass());


        System.out.println();
        System.out.println("Second Implementation");
        Vehicle fastest2 = getQuickestTwo(vehicleArrayList);
        System.out.println(fastest2.getClass());
        System.out.println(getQuickestTwo(vehicleArrayList).getClass());




        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(returnVehicle(bus1).getClass());

        System.out.println();
//        Car c1  = refuel(car1);
        Car c2 = refuelTwo(car1);
        // Bus b1 = refuelTwo(car1);
        Bus b2 = refuelTwo(bus1);

    }



}