package Maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIteration {
    public static void main(String[] args) {
        HashMap<Person, Integer> accounts = new HashMap<>();
        Person one = new Person("Aidan", 5 );
        Person two = new Person("George", 4);
        Person three = new Person ("Tom",1 );

        accounts.put(one, 100);
        accounts.put(two,300);
        accounts.put(three,500);

        System.out.println("Using entry set");
        System.out.println();
        //Entry set
        for(Map.Entry<Person, Integer> entry : accounts.entrySet()){
            System.out.println(entry.getKey() + " has a balance of "  + entry.getValue());
        }
        System.out.println();
        System.out.println("Using a stream");
        System.out.println();
        //Using a stream
        accounts.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " has a balance of " + e.getValue()));




        TreeMap<Person,Integer> sortedMap = new TreeMap(accounts);

        System.out.println();
        System.out.println("Custom Comparator in a Stream");

        sortedMap.entrySet().stream()
                .sorted(
                        Comparator.comparingInt(o -> o.getKey().IDNumber)
                )
                .forEach(e -> System.out.println(e.getKey() + " has a balance of " + e.getValue()));

        }


    }

