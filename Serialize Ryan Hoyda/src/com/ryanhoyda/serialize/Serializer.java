package com.ryanhoyda.serialize;

import java.io.*;
import java.util.Optional;
import javax.swing.*;

public class Serializer {
	
	public static final File FILE = new File("product.ser");
	
    public Optional<Product> collectProductInput(){
        try {
            int productId = Integer.parseInt(JOptionPane.showInputDialog(this, "Please enter the product ID"));
            String description = JOptionPane.showInputDialog(null, "Please enter the product description");
            String manufacturer = JOptionPane.showInputDialog(null, "Please enter the manufacturer");
            double price = Double.parseDouble(JOptionPane.showInputDialog(this, "Please enter the price"));
            
            Product product = new Product();
            product.setProductId(productId);
            product.setDescription(description);
            product.setManufacturer(manufacturer);
            product.setPrice(price);
            
            return Optional.of(product);
        } catch (NumberFormatException nfe){
            return Optional.empty();
        }
    }
    
    public void Serialize(Serializable serializable) throws IOException {
        //This is a try-with-resources block. It will make sure our file is closed no matter what happens
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE))){
            objectOutputStream.writeObject(serializable);
        }
    }

}
