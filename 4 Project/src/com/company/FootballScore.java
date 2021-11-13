package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FootballScore extends JFrame
{
    JButton madrid = new JButton("Real Madrid");
    JButton milan = new JButton("AC Milan");
    JLabel result = new JLabel("Result", SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("LastScorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    Font sansUnderTale = new Font("Comic Sans MS", Font.PLAIN, 60);
    int madridCounter = 0;
    int milanCounter = 0;
    protected void processWindowEvent(WindowEvent e){
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }
    public FootballScore()
    {
        int height = 1000, width = 1000;

        setLayout(null);
        madrid.setBounds(0,height/2, width/4,height/2);
        milan.setBounds(width/4 * 3,height/2, width/4,height/2);
        madrid.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                madridCounter++;
                result.setText("Result: " + madridCounter + " X " + milanCounter);
                lastScorer.setText("Last Scorer: Real Madrid");

                if(milanCounter > madridCounter){
                    winner.setText("Winner: AC Milan");
                }
                else if(milanCounter == madridCounter){
                    winner.setText("Winner: DRAW");
                }
                else{
                    winner.setText("Winner: Real Madrid");
                }
            }

        });
        milan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                milanCounter++;
                result.setText("Result: " + madridCounter + " X " + milanCounter);
                lastScorer.setText("Last Scorer: AC Milan");
                if(milanCounter > madridCounter){
                    winner.setText("Winner: AC Milan");
                }
                else if(milanCounter == madridCounter){
                    winner.setText("Winner: DRAW");
                }
                else{
                    winner.setText("Winner: Real Madrid");
                }
            }

        });
        add(milan);
        add(madrid);
        int resultSize = 50;
        result.setBounds(0,0,width,60);
        result.setFont(sansUnderTale);
        result.setText("Result: " + madridCounter + " X " + milanCounter);
        add(result);

        lastScorer.setBounds(0,70, width, 60);
        lastScorer.setFont(sansUnderTale);
        add(lastScorer);

        winner.setBounds(0, 140, width, 60);
        winner.setFont(sansUnderTale);
        add(winner);
        setSize(1000,1000);

        setVisible(true);
    }
}