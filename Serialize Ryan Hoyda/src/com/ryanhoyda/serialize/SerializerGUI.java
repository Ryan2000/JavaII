package com.ryanhoyda.serialize;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SerializerGUI extends JFrame {
	
	public static void main(String [] args){
		new SerializerGUI();
	}
	
	//text field for product ID.  2 represents number of columns
    private JTextField productIdTextField = new JTextField(2);
    private JTextField priceTextField = new JTextField(6);
    private JTextField manufacturerTextField = new JTextField(25);
    private JTextArea descriptionTextArea = new JTextArea(10, 10); //10 rows and 100 columns
	
    public SerializerGUI() {
        super("Serializer");//set's the window's title bar
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //main window utilizes border layout
        super.setLayout(new BorderLayout());
        super.add(getNorthPanel(), BorderLayout.NORTH);  //plug panel into window
        super.add(getCenterPanel(), BorderLayout.CENTER); //plug in center panel
        super.add(getSouthPanel(), BorderLayout.SOUTH); //plug in south panel
        
        super.pack(); //sizes everything
        
        super.setVisible(true);
        
    }

	public JTextField getProductIdTextField() {
		return productIdTextField;
	}

	public JTextField getPriceTextField() {
		return priceTextField;
	}

	public JTextField getManufacturerTextField() {
		return manufacturerTextField;
	}

	public JTextArea getDescriptionTextArea() {
		return descriptionTextArea;
	}

    private JPanel getNorthPanel(){
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(4, 2));
        
        jpanel.add(new JLabel("Price:"));
        jpanel.add(getPriceTextField());
        
        jpanel.add(new JLabel("ProductID:"));
        jpanel.add(getProductIdTextField());
        
        jpanel.add(new JLabel("Manufacturer:"));
        jpanel.add(getManufacturerTextField());
        
        return jpanel;
    }

    private JPanel getCenterPanel(){
        JPanel jpanel = new JPanel(new GridLayout(1, 2));
        jpanel.add(new JLabel("Description:"));
        jpanel.add(getDescriptionTextArea());
        return jpanel;
    }
    
    private JPanel getSouthPanel(){
        JPanel jpanel = new JPanel(new FlowLayout());
    	//3 buttons
        JButton serializeButton = new JButton("Serialize");
        serializeButton.addActionListener(al -> serializeEvent());  //lambda expression
        
        JButton deserializeButton = new JButton("Deserialize");
        deserializeButton.addActionListener(al -> deserializeEvent()); //lambda expression
        
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(al -> exitEvent()); //lambda expression 
        
        jpanel.add(serializeButton);
        jpanel.add(deserializeButton);
        jpanel.add(exitButton);
        
        return jpanel;
        
    }
    
    private void exitEvent(){
    	System.exit(0);
    }
    
    private void serializeEvent(){
    	try {
            Product p = new Product();
            p.setProductId(Integer.parseInt(getProductIdTextField().getText()));
    		p.setPrice(Double.parseDouble(getPriceTextField().getText()));
    		p.setDescription(getDescriptionTextArea().getText());
    		p.setManufacturer(getManufacturerTextField().getText());
    		new Serializer().Serialize(p);
    		
    	} catch (NumberFormatException nfe) {
    		JOptionPane.showMessageDialog(this, "Double check your input", "Error", JOptionPane.ERROR_MESSAGE);
    	} catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Unable to serialize object", "Error", JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void deserializeEvent(){
    	try {
    	    Deserializer deserializer = new Deserializer();
    	    Product p = deserializer.deserialize();
    	    
    	    getPriceTextField().setText(Double.toString(p.getPrice()));
    	    getProductIdTextField().setText(Integer.toString(p.getProductId()));
    	    getDescriptionTextArea().setText(p.getDescription());
    	    getManufacturerTextField().setText(p.getManufacturer());
    	    
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(this, "Unable to restore object", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	}
    }


