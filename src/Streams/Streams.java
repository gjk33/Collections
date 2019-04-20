package Streams;

import Maps.Person;

import java.util.Arrays;

public class Streams {



    public static void main(String[] args) {

        System.out.println("Stream on a Int Array");
        int[] one = {10,20,30,40,50,100,101};
        Arrays.stream(one)
              .filter(element -> element % 2 != 0)
                .map(e -> e/10)
                .forEach(e -> System.out.println(e));



        Person[] peopleArray = new Person[5];

        Person Greg = new Person("Greg", 1);
        Person James = new Person("James", 2);
        Person Walter = new Person("Walter", 3);
        Person Sarah = new Person("Sarah", 4);
        Person Roger = new Person("Roger", 5);

        peopleArray[0] = Greg;
        peopleArray[1] = James;
        peopleArray[2] = Walter;
        peopleArray[3] = Sarah;
        peopleArray[4] = Roger;
        System.out.println();
        System.out.println("Stream on an array of Person");
        Arrays.stream(peopleArray)
                .filter(e -> e.name.length() <= 5)
                .sorted((o1, o2) -> o2.IDNumber - o1.IDNumber)
                .map(e -> e.name.substring(0,1))
                .forEach(e -> System.out.println(e));



    }

}
