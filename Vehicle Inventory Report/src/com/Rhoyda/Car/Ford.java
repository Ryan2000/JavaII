package com.Rhoyda.Car;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class Ford extends Car{
	
    public Ford() {
        super(0, "Ford", null, null, null, null, null, null, null);
    }

    public Ford(int inventoryId, String model, Year yearMade, LocalDate inventoryStartDate,
                LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice, Doors numDoors) {
        super(inventoryId, "Ford", model, yearMade, inventoryStartDate, soldDate, dealerCost, sellingPrice, numDoors);
    }

	
}
