package com.ryanhoyda.serialize;

import java.io.*;
import java.util.Optional;

public class Main {

    public static void main(String [] args) throws IOException, ClassNotFoundException {
        Serializer serializer = new Serializer();
        Deserializer deserializer = new Deserializer();

        Optional<Product> productOptional = serializer.collectProductInput();
        while(!productOptional.isPresent()){
            productOptional = serializer.collectProductInput();
        }

        System.out.println("Serializing....");
        System.out.println(productOptional.get());
        serializer.Serialize(productOptional.get());

        System.out.println("Restoring...");
        Product p = deserializer.deserialize();
        System.out.println(p);
    }
}


