package com.Rhoyda.Mammal;

import java.time.LocalDateTime;


public class Pug extends Dog{
	
    public Pug(final int id, final String aName, final int age, final LocalDateTime lastDateCleaned) {
        super(id, aName, age, "Cheese Curds", 5, lastDateCleaned);
    }

}
