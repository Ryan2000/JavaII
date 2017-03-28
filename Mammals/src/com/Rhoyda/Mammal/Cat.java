package com.Rhoyda.Mammal;

import java.time.LocalDateTime;

public class Cat extends Mammal{
	
    public Cat(final int id, final String aName, final int age, final LocalDateTime lastDateCleaned) {
        super(id, aName, age, "fish", 7, lastDateCleaned);
    }

    //Can only be called by classes that extend Cat
    protected Cat(final int id, final String aName, final int age, final String food, final int cageCleaning, final LocalDateTime lastDateCleaned) {
        super(id, aName, age, food, cageCleaning, lastDateCleaned);
    }
    
}
