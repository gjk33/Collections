package Maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MapIterationLambda {
    public static void main(String[] args) {
        HashMap<Person, Integer> accounts = new HashMap<>();
        Person one = new Person("Aidan", 5 );
        Person two = new Person("George", 4);
        Person three = new Person ("Tom",1 );

        accounts.put(one, 100);
        accounts.put(two,300);
        accounts.put(three,500);

        System.out.println("Unsorted");
        System.out.println();
       accounts.forEach((k,v) ->{
           System.out.println(k + " has a balance of " + v );

       });


        TreeMap<Person, Integer> accountSorted = new TreeMap(accounts);
        System.out.println();
        System.out.println("Sorted");
        System.out.println();
        accountSorted.forEach((k,v) ->{
            System.out.println(k + " has a balance of " + v );

        });
        System.out.println();
        System.out.println("Sorted using custom comparator");

        TreeMap<Person, Integer> accountSortedOnID = new TreeMap<>(
                new Comparator<Person>(){
                   @Override
                   public int compare(Person p1, Person p2){
                       return  p1.IDNumber - p2.IDNumber;
                   }
                }
        );

        accountSortedOnID.putAll(accountSorted);
        System.out.println();


        accountSortedOnID.forEach((k,v) ->{
            System.out.println(k + " has a balance of " + v );

        });







    }
}
