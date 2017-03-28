package com.rhoyda.stopwatch;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.*;


public class Stopwatch {

    private JLabel aJLabel;
    private long start;
    private List<Double> pauses = new ArrayList<>();
    private JFrame jFrame;
    private JButton startButton;
    private JButton stopButton;
    private JButton pauseButton;

    public Stopwatch() {
        jFrame = new JFrame("My Stopwatch");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(300, 80);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(al -> stopButtonAction());

        pauseButton = new JButton("Pause");
        pauseButton.addActionListener(al -> pauseButtonAction());

        startButton = new JButton("Start");
        startButton.addActionListener(al -> startButtonAction());

        aJLabel = new JLabel("Press Start");

        jFrame.getContentPane().add(startButton);
        jFrame.getContentPane().add(pauseButton);
        jFrame.getContentPane().add(stopButton);
        jFrame.getContentPane().add(aJLabel);

        jFrame.setVisible(true);
    }

    private void pauseButtonAction() {
        pauses.add((double) (Calendar.getInstance().getTimeInMillis() - start) / 1000);
        pauseButton.setEnabled(false);
        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        aJLabel.setText("Timer is paused");
    }

    private void startButtonAction(){
        start = Calendar.getInstance().getTimeInMillis();
        aJLabel.setText("Timer is running");
        pauseButton.setEnabled(true);
        stopButton.setEnabled(true);
        startButton.setEnabled(false);
        jFrame.pack();
    }

    private void stopButtonAction(){
        double time = (double) (Calendar.getInstance().getTimeInMillis() - start) / 1000;
        for(double pause : pauses){
            time += pause;
        }
        pauses.clear();
        aJLabel.setText("Elapsed time is " + time);
        stopButton.setEnabled(false);
        pauseButton.setEnabled(false);
        startButton.setEnabled(true);
        jFrame.pack();
    }
    
}
    
    

