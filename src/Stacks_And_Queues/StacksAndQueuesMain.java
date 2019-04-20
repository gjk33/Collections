package Stacks_And_Queues;

import Comparisons.Player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class StacksAndQueuesMain {


    public static void main(String[] args) {
        Player Tettey = new Player("Alexander", "Tettey", 33,1,0,28);
        Player Pukki = new Player("Teemu", "Pukki",29,26,9,38);
        Player Beundia = new Player("Emiliano", "Beundia", 22,8,11,35);
        Player Trybull = new Player("Tom", "Trybull", 26,1,0,28);
        Player Stieperman = new Player("Marco", "Stieperman", 28,7,6,38);
        Player Aarons = new Player("Maximillian", "Aarons", 19,2,6,36);
        Player Hanley = new Player("Grant", "Hanley", 27,1,0,8);


        System.out.println("Stack Implementation ");
        Stack<Player> playerStack = new Stack<>();
        playerStack.add(Tettey);
        System.out.println("Top of Stack");
        System.out.println(playerStack.peek());
        System.out.println();
        System.out.println("Pukki added");
        playerStack.add(Pukki);
        System.out.println("Element popped - Top of Stack returned");
        System.out.println(playerStack.pop());
        System.out.println();
        System.out.println("Top of Stack");
        System.out.println(playerStack.peek());
        System.out.println();
        System.out.println();


        System.out.println("Queue Implementation - Using a Linked List");
        Queue<Player> playerQueue = new LinkedList<>();
        playerQueue.add(Tettey);
        System.out.println("Front of Queue");
        System.out.println(playerQueue.peek());
        System.out.println();
        System.out.println("Pukki added");
        playerQueue.add(Pukki);
        System.out.println("Front of Queue");
        System.out.println(playerQueue.peek());
        System.out.println("Element polled - Front of Queue returned");
        System.out.println(playerQueue.poll());
        System.out.println();
        System.out.println("Front of Queue");
        System.out.println(playerQueue.peek());

        System.out.println();
        System.out.println();

        System.out.println("Priority Queue");
    }
}
