package com.Rhoyda.Car;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class Dodge extends Car{
	
    public Dodge() {
        super(0, "Dodge", null, null, null, null, null, null, null);

    }

    public Dodge(int inventoryId, String model, Year yearMade, LocalDate inventoryStartDate,
                 LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice, Doors numDoors) {
        super(inventoryId, "Dodge", model, yearMade, inventoryStartDate, soldDate, dealerCost, sellingPrice, numDoors);
    }


}
