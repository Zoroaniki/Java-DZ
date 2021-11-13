package com.company;

public class Game {
    Playable p1;
    Playable p2;
    public Game(Playable p1, Playable p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play(){
        int counter = 0;
        while(p1.getDeckSize() != 0 && p2.getDeckSize() != 0){
            counter++;
            if(p1.showCard() == 0){
                p1.addCard(p1.LoseCard());
                p1.addCard(p2.LoseCard());
                continue;
            }
            if(p2.showCard() == 0){
                p2.addCard(p2.LoseCard());
                p2.addCard(p1.LoseCard());
                continue;
            }
            if(p1.showCard() > p2.showCard()){
                p1.addCard(p1.LoseCard());
                p1.addCard(p2.LoseCard());
            }
            else{
                p2.addCard(p2.LoseCard());
                p2.addCard(p1.LoseCard());
            }

            if(counter == 106){
                System.out.println("botva");
                return;
            }
        }
        if(p1.getDeckSize() == 0){
            System.out.println("Second Player");
            System.out.println(counter);
        }
        else{
            System.out.println("First Player");
            System.out.println(counter);
        }

    }
}