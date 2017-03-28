package com.Rhoyda.Truck;

import com.Rhoyda.Vehicles.Vehicle;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public abstract class Truck extends Vehicle {
	
	
    public enum Wheels {
        FOUR_WHEELS, SIX_WHEELS
    };

    private Wheels numWheels;


    public Truck(){

    }

    public Truck(int inventoryId, String carMake, String model, Year yearMade, LocalDate inventoryStartDate,
                 LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice, Wheels numWheels) {
        super(inventoryId, carMake, model, yearMade, inventoryStartDate, soldDate, dealerCost, sellingPrice);
        this.numWheels = numWheels;
    }

    public Wheels getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(Wheels numWheels) {
        this.numWheels = numWheels;
    }

}
