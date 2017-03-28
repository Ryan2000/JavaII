package com.Rhoyda.Mammal;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class MammalDriver {

	public static void main(String[] args) {
		new MammalDriver();
	}
		
	    private MammalService mammalService = new MammalService();
	    private Scanner scanner = new Scanner(System.in);
	    
	    public MammalDriver(){
	    	Mammal[] animals = new Mammal[15];
	    	
	    	
	        //Create ten animals
	        animals[0] = mammalService.create(Cat.class, "Hummus", 1, LocalDateTime.now().minusDays(6));
	        animals[1] = mammalService.create(Cat.class, "Spike", 2, LocalDateTime.now().minusDays(5));
	        animals[2] = mammalService.create(Cat.class, "Bella", 4, LocalDateTime.now().minusDays(4));
	        animals[3] = mammalService.create(Dog.class, "Sims", 2, LocalDateTime.now().minusDays(2));
	        animals[4] = mammalService.create(Dog.class, "Max", 7, LocalDateTime.now().minusDays(1));
	        animals[5] = mammalService.create(Dog.class, "Angel", 3, LocalDateTime.now().minusDays(5));
	        animals[6] = mammalService.create(Dog.class, "Tank", 2, LocalDateTime.now().minusDays(2));
	        animals[7] = mammalService.create(Wolf.class, "Shianne", 4, LocalDateTime.now().minusDays(4));
	        animals[8] = mammalService.create(Wolf.class, "RunningWolf", 6, LocalDateTime.now().minusDays(3));
	        animals[9] = mammalService.create(Wolf.class, "Sky", 4, LocalDateTime.now().minusDays(6));
            animals[10] = mammalService.create(Pug.class, "Stella", 11, LocalDateTime.now().minusDays(1));
            animals[11] = mammalService.create(GreatDane.class, "Billix", 11, LocalDateTime.now().minusDays(4));
            animals[12] = mammalService.create(Siamese.class, "Kitty", 4, LocalDateTime.now().minusDays(4));
            animals[13] = mammalService.create(Bombay.class, "KitKat", 2, LocalDateTime.now().minusDays(4));
            animals[14] = mammalService.create(ArcticWolf.class, "Ghost", 2, LocalDateTime.now().minusDays(4));

            
	        int choice = getMenuChoice();

            switch (choice){
            case 1:
                //Sort by name, use compareTo method
                Arrays.sort(animals, (Mammal lhs, Mammal rhs) -> lhs.getaName().compareTo(rhs.getaName()));
                break;
            case 2:
                //Sort by age, use compare - int is primitive data type
                Arrays.sort(animals, (Mammal lhs, Mammal rhs) -> Integer.compare(lhs.getAge(), rhs.getAge()));
                break;
        }
	        
	        
	        //for loop
	        for(Mammal mammal : animals){
                System.out.println(mammalService.getMammalReport(mammal));
            }
	    
	}
	    
	    public int getMenuChoice(){
	        System.out.println("Welcome to the Humane Society");
	        System.out.println("1) Sort by name");
	        System.out.println("2) Sort by age");

	        while(true){
	        	//create an infinite loop that will run until we get the correct user input
	        	
	            while(scanner.hasNext()){
	            	//Get input from user
	                String input = scanner.next();
	                try {
	                    int choice = Integer.parseInt(input);
	                    //choice must be 1 or 2
	                    if(choice == 1 || choice == 2){
	                        return choice;
	                    } else {
	                    	//invalid, try again 
	                        System.out.println("Valid choices are 1 or 2");
	                    }
	                } catch (NumberFormatException nfe){
	                    //If we end up here, the user put in something other than
	                    //a number such as asdf
	                    System.out.println("Valid choices are 1 or 2");
	                    //keep trying until we receive correct input
	                }
	            }
	        }
	    }

}
