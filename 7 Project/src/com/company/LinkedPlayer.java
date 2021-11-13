package com.company;

import java.util.LinkedList;


public class LinkedPlayer implements Playable{
    private LinkedList<Integer> deque = new LinkedList<Integer>();
    private String originalDeck;

    public LinkedPlayer(String deck){
        originalDeck = deck;
    }
    public static LinkedPlayer MakeUserWithDeckReady(String deck){
        LinkedPlayer player = new LinkedPlayer(deck);
        player.convertStringToDeck();
        return player;
    }
    @Override
    public void convertStringToDeck() {
        String[] parts = originalDeck.split(" ");
        for(int i = 0; i < 5; i++){
            deque.add(Integer.parseInt(parts[i]));
        }
    }

    @Override
    public int getDeckSize() {
        return deque.size();
    }

    @Override
    public void addCard(int item) {
        deque.add(item);
    }

    @Override
    public int showCard() {
        return deque.peek();
    }

    @Override
    public int LoseCard() {
        int card = deque.peek();
        deque.remove();
        return card;
    }
}