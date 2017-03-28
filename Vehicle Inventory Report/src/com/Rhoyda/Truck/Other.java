package com.Rhoyda.Truck;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class Other extends Truck{

    public Other() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Other(int inventoryId, String carMake, String model, Year yearMade, LocalDate inventoryStartDate,
                 LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice, Wheels numWheels) {
        super(inventoryId, carMake, model, yearMade, inventoryStartDate, soldDate, dealerCost, sellingPrice, numWheels);
        // TODO Auto-generated constructor stub
    }

}
