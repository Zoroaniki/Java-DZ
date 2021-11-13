package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LabExample extends JFrame
{
    JButton madrid = new JButton("Real Madrid");
    JButton milan = new JButton("AC Milan");
    JLabel result = new JLabel();
    JLabel lastScorer = new JLabel();
    Label winnerr = new Label();
    protected void processWindowEvent(WindowEvent e){
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }
    public LabExample()
    {
        int heght = 1000, width = 1000;
        int madridCounter = 0;
        int milanCounter = 0;


        setSize(1000,1000);

        setVisible(true);
    }
}