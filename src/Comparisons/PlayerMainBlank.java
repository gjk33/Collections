package Comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerMainBlank {


    public static <E> void printArray(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        Player Tettey = new Player("Alexander", "Tettey", 33, 1, 0, 28);
        Player Pukki = new Player("Teemu", "Pukki", 29, 26, 9, 38);
        Player Beundia = new Player("Emiliano", "Beundia", 22, 8, 11, 35);
        Player Trybull = new Player("Tom", "Trybull", 26, 1, 0, 28);
        Player Stieperman = new Player("Marco", "Stieperman", 28, 7, 6, 38);
        Player Aarons = new Player("Maximillian", "Aarons", 19, 2, 6, 36);
        Player Hanley = new Player("Grant", "Hanley", 27, 1, 0, 8);


        ArrayList<Player> players = new ArrayList<>();
        players.add(Tettey);
        players.add(Pukki);
        players.add(Beundia);
        players.add(Trybull);
        players.add(Stieperman);
        players.add(Aarons);
        players.add(Hanley);


        System.out.println("Printed before sorting");
        System.out.println("Expected order - Tettey, Pukki, Beundia, Trybull, Stieperman, Aarons, Hanley");
        System.out.println();
        printArray(players);
        System.out.println();



        /*
        Using default way of sorting
         */
        System.out.println("Printed after default sorting");
        System.out.println("Expected order - Aarons, Beundia, Hanley, Pukki, Stieperman, Tettey, Trybull");
        System.out.println();
        /*
        XXXXXX - Sort here
         */
        printArray(players);



        /*
        Using a new comparator (non anon)

        Sort on goals in descending order

         */


        System.out.println();
        System.out.println("Printed after sorting on goals");
        System.out.println("Expected order - Beundia, Pukki, Stieperman, Aarons, Hanley, Tettey, Trybull");
        System.out.println();
        /*
        Collections.sort(players, XXXX);
        */
        printArray(players);



        /*
        Using a function comparator

        Sort on assists in descending order
         */
        System.out.println();
        System.out.println("Printed after sorting on Assists");
        System.out.println("Expected order - Beundia, Pukki, Stieperman, Aarons, Hanley, Tettey, Trybull");
        System.out.println();
        /*
        Collections.sort(players, XXXXXX );
        */
        printArray(players);


        /*
        Using a static comparator method to create a comparator

        Sort by goals to game ratio in descending order (Collections has a static method that is useful for doing this)
         */
        System.out.println();
        System.out.println("Printed after sorting on goals ratio");
        System.out.println("Expected order - Pukki, Beundia, Stieperman, Hanley, Aarons, Tettey, Trybull");
        System.out.println();
        /*
        Collections.sort(players, XXXX);
        */
        printArray(players);


    }

}
