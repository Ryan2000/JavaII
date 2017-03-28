package com.Rhoyda.Car;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class Other extends Car {

    public Other() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Other(int inventoryId, String carMake, String model, Year yearMade, LocalDate inventoryStartDate,
                 LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice, Doors numDoors) {
        super(inventoryId, carMake, model, yearMade, inventoryStartDate, soldDate, dealerCost, sellingPrice, numDoors);
        // TODO Auto-generated constructor stub
    }
	

}
