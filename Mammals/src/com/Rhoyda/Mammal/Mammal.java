package com.Rhoyda.Mammal;

import java.time.LocalDateTime;

public abstract class Mammal {

    private int id;
    private String aName;
    private int age;
    private String food;
    private int cageCleaning;
    
    private LocalDateTime lastDateCleaned;

	public Mammal(int id, String aName, int age, String food, int cageCleaning, LocalDateTime lastDateCleaned) {
		super();
		this.id = id;
		this.aName = aName;
		this.age = age;
		this.food = food;
		this.cageCleaning = cageCleaning;
		this.lastDateCleaned = lastDateCleaned;
	}

	
	public int getId() {
		return id;
	}

	public String getaName() {
		return aName;
	}

	public int getAge() {
		return age;
	}

	public String getFood() {
		return food;
	}

	public int getCageCleaning() {
		return cageCleaning;
	}

	public LocalDateTime getLastDateCleaned() {
		return lastDateCleaned;
	}


	@Override
    public String toString() {
        return "Mammal{" +
                "id=" + id +
                ", aName='" + aName + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                ", cageCleaning=" + cageCleaning +
                ", lastDateCleaned=" + lastDateCleaned +
                '}';
    }
    
    
    

}
