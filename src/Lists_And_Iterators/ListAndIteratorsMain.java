package Lists_And_Iterators;

import Comparisons.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListAndIteratorsMain {
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

        LinkedList<Player> playersLL = new LinkedList<>(players);

     Iterator playerIterator =   players.listIterator();

     while(playerIterator.hasNext()){
         System.out.println(playerIterator.next());
     }

     Iterator playerLLIterator = playersLL.listIterator();

     while(playerLLIterator.hasNext())
     {
         System.out.println(playerLLIterator.next());
     }


    }
}
