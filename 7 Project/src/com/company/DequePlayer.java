package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequePlayer implements Playable{
    private Deque<Integer> deque = new ArrayDeque<Integer>();
    private String originalDeck;

    public DequePlayer(String deck){
        originalDeck = deck;
    }

    public static DequePlayer MakeUserWithDeckReady(String deck){
        DequePlayer player = new DequePlayer(deck);
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