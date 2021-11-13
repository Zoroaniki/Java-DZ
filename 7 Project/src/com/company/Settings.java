package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Settings {
    private Playable player1;
    private Playable player2;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public void start() throws IOException {
        int answer = 1;
        while(answer != 0){
            System.out.println("1 - Выбор первого игрока\n2 - Выбор второго игрока\n3 - Начать игру\n0 - Выход");
            answer = Integer.parseInt(br.readLine());
            switch (answer){
                case 1:
                    player1 = choosePlayer();
                    break;
                case 2:
                    player2 = choosePlayer();
                    break;
                case 3:
                    Game game = new Game(player1, player2);
                    game.play();
                    break;
                case 0:
                    return;
            }
        }
    }
    private Playable choosePlayer() throws IOException {
        System.out.println("1 - QueuePlayer\n2 - DequePlayer\n3 - LinkedListPlayer");
        int answer2 = Integer.parseInt(br.readLine());
        if(answer2 == 1){
            System.out.println("Введите 5 карт (через пробел)");
            String deck = br.readLine();
            return QueuePlayer.MakeUserWithDeckReady(deck);
        }
        else if(answer2 == 2){
            System.out.println("Введите 5 карт (через пробел)");
            String deck = br.readLine();
            return DequePlayer.MakeUserWithDeckReady(deck);
        }
        else if(answer2 == 3){
            System.out.println("Введите 5 карт (через пробел)");
            String deck = br.readLine();
            return LinkedPlayer.MakeUserWithDeckReady(deck);
        }
        else{
            return null;
        }
    }

}