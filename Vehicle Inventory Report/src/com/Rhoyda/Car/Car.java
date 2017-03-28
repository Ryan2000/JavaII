package com.Rhoyda.Car;

import com.Rhoyda.Vehicles.Vehicle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public abstract class Car extends Vehicle{
	
    public enum Doors {
        TWO_DOORS, FOUR_DOORS
    };

    private Doors numDoors;

    public Car(){

    }

    public Car(int inventoryId, String carMake, String model, Year yearMade, LocalDate inventoryStartDate,
               LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice, Doors numDoors) {
        super(inventoryId, carMake, model, yearMade, inventoryStartDate, soldDate, dealerCost, sellingPrice);
        this.numDoors = numDoors;
    }

    public Doors getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(Doors numDoors) {
        this.numDoors = numDoors;
    }

}
