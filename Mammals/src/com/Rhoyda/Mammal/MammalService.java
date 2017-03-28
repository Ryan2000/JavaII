package com.Rhoyda.Mammal;

import java.time.LocalDateTime;

public class MammalService {
	
	//Controls the animal ids
	private static int id;

	//Creates a Mammal object
    public Mammal create(final Class<? extends Mammal> species, final String aName, final int age, final LocalDateTime lastDateCleaned){
       
    	//Get next animal id
    	MammalService.id++;
    	
    	//Create Cat, Dog, or Wolf. Throw an exception for unsupported species
        if(species.equals(Cat.class)){
        	//System.out.println("MammalService is creating a cat");
            return new Cat(MammalService.id, aName, age, lastDateCleaned);
        } else if (species.equals(Dog.class)){
        	//System.out.println("MammalService is creating a dog");
            return new Dog(MammalService.id, aName, age, lastDateCleaned);
        } else if (species.equals(Wolf.class)){
        	//System.out.println("MammalService is creating a wolf");
            return new Wolf(MammalService.id, aName, age, lastDateCleaned);
        } else if (species.equals(Pug.class)){
            return new Pug(MammalService.id, aName, age, lastDateCleaned);
        } else if (species.equals(GreatDane.class)){
            return new GreatDane(MammalService.id, aName, age, lastDateCleaned);
        } else if (species.equals(Siamese.class)){
            return new Siamese(MammalService.id, aName, age, lastDateCleaned);
        } else if (species.equals(Bombay.class)){
            return new Bombay(MammalService.id, aName, age, lastDateCleaned);
        } else if (species.equals(ArcticWolf.class)){
            return new ArcticWolf(MammalService.id, aName, age, lastDateCleaned);
        } else {
            throw new IllegalArgumentException("No Mammal found for " + species.getName());
        }
    }
    
    public boolean needsCageCleaned(Mammal mammal){
        return mammal.getLastDateCleaned().plusDays(mammal.getCageCleaning()).isBefore(LocalDateTime.now());
    }
    
    public String getMammalReport(Mammal mammal){
    	//create new object StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        //appending Id to Stringbuilder - get mammal Id  //string += "Id: " + mammal.getId() + "\n";
        stringBuilder.append("Id: ").append(mammal.getId()).append('\n');
        stringBuilder.append("Name: ").append(mammal.getaName()).append('\n');
        stringBuilder.append("Age: ").append(mammal.getAge()).append('\n');
        stringBuilder.append("Species: ").append(mammal.getClass().getSimpleName()).append('\n');
        stringBuilder.append("Food: ").append(mammal.getFood()).append('\n');
        stringBuilder.append("Date of Last Cleaning: ").append(mammal.getLastDateCleaned().toString()).append('\n');

        if(needsCageCleaned(mammal)){
            stringBuilder.append("Animal needs it's cage cleaned").append('\n');
        }
        return stringBuilder.toString();
        
    }
    
    

}
