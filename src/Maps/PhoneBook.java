package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneBook {
    private SortedMap<Name, Integer> directory;
    public PhoneBook(ArrayList<Name> names, ArrayList<Integer> phones) {

        HashMap map = new HashMap();

        for(int i = 0; i < names.size(); i++){
            map.put(names.get(i), phones.get(i));
        }
        this.directory = new TreeMap<Name, Integer>(map);

    }
    public void print() {
           directory.forEach((k,v) -> System.out.println(k + " " + v));
    }

    public static void main(String[] args) {


        ArrayList<Name> names = new ArrayList<>();
        Name Greg = new Name("Kelly", "Gregory");
        Name Verity = new Name("Kelly", "Verity");
        Name James = new Name("Albert", "James");
        Name Alfie = new Name("Albert", "Alfie");

        names.add(Greg);
        names.add(Verity);
        names.add(James);
        names.add(Alfie);
        ArrayList<Integer> phones = new ArrayList<>();

        for(int i = 0; i < names.size(); i++){
            phones.add(i);
        }

        HashMap<Name, Integer> tester = new HashMap<>();

        for(int i = 0; i < names.size(); i++){
            tester.put(names.get(i), phones.get(i));
        }

        tester.forEach((k,v) -> System.out.println(k + " " + v));

        PhoneBook phonebook = new PhoneBook(names,phones);

      //  phonebook.print();

    }


}