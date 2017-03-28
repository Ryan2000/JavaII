package com.ryanhoyda.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
	
    public Product deserialize() throws IOException, ClassNotFoundException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(Serializer.FILE))){
            return (Product) objectInputStream.readObject();
        }
    }

}
