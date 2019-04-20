package Comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerMain {


     public static <E> void printList(List<E> list){
        for(E element : list){
            System.out.println(element);
        }
    }


    public static void main(String[] args) {
        Player Tettey = new Player("Alexander", "Tettey", 33,1,0,28);
        Player Pukki = new Player("Teemu", "Pukki",29,26,9,38);
        Player Beundia = new Player("Emiliano", "Beundia", 22,8,11,35);
        Player Trybull = new Player("Tom", "Trybull", 26,1,0,28);
        Player Stieperman = new Player("Marco", "Stieperman", 28,7,6,38);
        Player Aarons = new Player("Maximillian", "Aarons", 19,2,6,36);
        Player Hanley = new Player("Grant", "Hanley", 27,1,0,8);




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
        printList(players);
        System.out.println();




        System.out.println("Printed after default sorting");
        System.out.println("Expected order - Aarons, Beundia, Hanley, Pukki, Stieperman, Tettey, Trybull");
        System.out.println();
        Collections.sort(players);
        printList(players);


        Comparator<Player> goalsDescending = new Comparator<Player>(){
            @Override
            public int compare(Player p1, Player p2){
                return p2.goals - p1.goals;
            }
        };

        System.out.println();
        System.out.println("Printed after sorting on goals");
        System.out.println("Expected order - Beundia, Pukki, Stieperman, Aarons, Hanley, Tettey, Trybull");
        System.out.println();
        Collections.sort(players,goalsDescending);
        printList(players);



        System.out.println();
        System.out.println("Printed after sorting on Assists");
        System.out.println("Expected order - Beundia, Pukki, Stieperman, Aarons, Hanley, Tettey, Trybull");
        System.out.println();
        Collections.sort(players, (p1, p2) -> p2.assists - p1.assists);
        printList(players);




        System.out.println();
        System.out.println("Printed after sorting on goals ratio");
        System.out.println("Expected order - Pukki, Beundia, Stieperman, Hanley, Aarons, Tettey, Trybull");
        System.out.println();
        Collections.sort(players, Collections.reverseOrder(Comparator.comparingDouble(p -> p.goalsToGameRatio)));
        printList(players);




    }

}
