package com.ryanhoyda.saymyname;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import javax.swing.*;
import java.io.File;


public class SayMyName extends JFrame {
	
	private static final String PROPERTIES_FILE = "saymyname.prop";
	
    public static void main(String [] args){
        new SayMyName();
    }
    
    private JTextField jTextField;
    public SayMyName() throws HeadlessException {
        super("Say my name"); //Set's the window's title bar
        //This is a layout manager
        setLayout(new FlowLayout());
        //This is a label control. It holds text and can be styled with HTML
        add(new JLabel("What's my name? Say my name!"));
        //This is a textbox. It can accept a number of columns/characters. I used 25
        jTextField = new JTextField(25);
        add(jTextField);
        //This is an action button. The constructor sets the button's text
        JButton jButton = new JButton("Say Name!");
        //This is a lambda expression that tells the button what to do when it's clicked
        //Click the button will call the sayName() method defined below
        jButton.addActionListener(al -> sayName());  //lambda expression
        add(jButton);
        
        JButton jButton1 = new JButton("Exit!");
        jButton1.addActionListener(al -> exit());  //lambda expression
        add(jButton1);
        
        //Sizes everything to it's preferred size
        pack();
        //This tells it what to do when the user click's on the x button in the upper right hand corner
        //We want to exit our program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
      //Handle the window opening event and the window closing event. We can't do everything with
        //Lambda's so we have to use the Java 1.5 - 1.7 event pattern. This is called an anonymous inner class
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(final WindowEvent e) {
                handleWindowOpened();
            }

            @Override
            public void windowClosed(final WindowEvent e) {
                handleWindowClosed();
            }
        });
        
        
        //show the window
        setVisible(true);
    }
    
    //This is called when the window closes
    private void handleWindowClosed() {
        Properties properties = new Properties();
        properties.put("Last Name", jTextField.getText());
        try {
            //Write the properties to disk
            properties.store(new FileWriter(new File(PROPERTIES_FILE)), "");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //This is called when the window opens
    private void handleWindowOpened() {
        File file = new File(PROPERTIES_FILE);
        if(file.exists()){
            //Create a properties object
            Properties properties = new Properties();


            try {
                //Load the properties file. Note that properties handles closing the file for us so we don't need to worry about it
                properties.load(new FileInputStream(file));

                //Set the textbox to the last name used
                jTextField.setText(properties.getProperty("Last Name"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    //This get's called when the jButton is clicked
    private void sayName() {
    	String name = jTextField.getText();

        if(name.equals("")){
            //Show a dialog box saying that there is no name
            JOptionPane.showMessageDialog(this, "You didn't say my name!!!", "No Name", JOptionPane.WARNING_MESSAGE);
        } else {
            //Show a dialog box with the name
            JOptionPane.showMessageDialog(this, "Your name is " + name, name, JOptionPane.INFORMATION_MESSAGE);
        }

        //clear our text field
        jTextField.setText("");
    }
    
    //Add an exit method here
    private void exit(){
        dispose(); //Close the window
        System.exit(0); //Exit the program
    }
}

