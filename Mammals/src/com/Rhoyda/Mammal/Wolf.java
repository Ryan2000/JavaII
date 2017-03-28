package com.Rhoyda.Mammal;

import java.time.LocalDateTime;

public class Wolf extends Mammal {
	
    public Wolf(final int id, final String aName, final int age, final LocalDateTime lastDateCleaned) {
        super(id, aName, age, "rabbits", 2, lastDateCleaned);
    }
    
    //Can only be called by classes that extend Wolf
    protected Wolf(final int id, final String aName, final int age, final String food, final int cageCleaning, final LocalDateTime lastDateCleaned) {
        super(id, aName, age, food, cageCleaning, lastDateCleaned);
    }

}
