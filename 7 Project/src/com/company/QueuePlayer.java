package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePlayer implements Playable {
    private Queue<Integer> queue = new LinkedList<Integer>();
    private String originalDeck;

    public QueuePlayer(String deck){
        originalDeck = deck;
    }
    public static QueuePlayer MakeUserWithDeckReady(String deck){
        QueuePlayer player = new QueuePlayer(deck);
        player.convertStringToDeck();
        return player;
    }
    public void convertStringToDeck(){
        String[] parts = originalDeck.split(" ");
        for(int i = 0; i < 5; i++){

            queue.add(Integer.parseInt(parts[i]));
        }
    }
    public int getDeckSize(){
        return queue.size();
    }
    public void addCard(int item){
        queue.add(item);
    }
    public int showCard(){
        return queue.peek();
    }
    public int LoseCard(){
        int card = queue.peek();
        queue.remove();
        return card;
    }

}
