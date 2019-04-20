package Streams;

import Comparisons.Player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PlayersStreamMain {

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



        /*
        1-
        Use a stream to find the number of players with a first name with 5 or less characters
         */
        long shortName = players.stream()
                .filter(e -> e.getFirstname().length() <= 5)
                .count();


        /*
        2-
        Use a stream to find the average number of goals per player
         */
        double averageGoals = players.stream()
                .mapToDouble( e -> e.getGoals())
                /*
                Average returns an optional double. This is because the stream could not contain any values.
                Instead of offering a default return in this case we must define an orElse which will be used if no value is returned
                 */
                .average().orElse(0.0);

        /*
        3-
        Use a stream to return an ArrayList of players who scored more than the average number of goals
        In the stream sort these players by age

        The collectors class has static methods that are helpful here
         */
        ArrayList<Player> betterThanAVG = players.stream()
                .filter(p -> p.getGoals() > averageGoals)
                .sorted((p1,p2) -> p1.getAge() - p2.getAge())
                .collect(Collectors.toCollection(ArrayList::new));







        System.out.println("1 - There are " + shortName + " players with short first names ");
        System.out.println("2 - The average goals is " + String.format("%.2f",averageGoals));
        System.out.println("3 - The players who have scored more than the average of " + String.format("%.2f", averageGoals)+" are -");
        printList(betterThanAVG);




    }



    }

