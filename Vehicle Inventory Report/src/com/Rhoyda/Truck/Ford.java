package com.Rhoyda.Truck;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.LocalDate;

public class Ford extends Truck{
	
    public Ford(){
        super(0, "Ford", null, null, null, null, null, null, null);

    }

    public Ford(int inventoryId, String model, Year yearMade, LocalDate inventoryStartDate,
                LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice, Wheels numWheels) {
        super(inventoryId, "Ford", model, yearMade, inventoryStartDate, soldDate, dealerCost, sellingPrice, numWheels);
    }

}
