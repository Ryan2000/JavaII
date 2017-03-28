package com.Rhoyda.Mammal;

import java.time.LocalDateTime;

public class Dog extends Mammal{
	
	
    public Dog(final int id, final String aName, final int age, final LocalDateTime lastDateCleaned) {
        super(id, aName, age, "biscuits", 2, lastDateCleaned);
    }
	
	//Can only be called by classes that extend Dog
    protected Dog(final int id, final String aName, final int age, final String food, final int cageCleaning, final LocalDateTime lastDateCleaned) {
        super(id, aName, age, food, cageCleaning, lastDateCleaned);
    }

}
