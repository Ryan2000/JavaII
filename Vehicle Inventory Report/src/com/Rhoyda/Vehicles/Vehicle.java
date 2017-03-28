package com.Rhoyda.Vehicles;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.time.LocalDateTime;

public abstract class Vehicle implements Serializable {
	
    private int inventoryId;
    private String carMake;
    private String model;
    private Year yearMade;
    private LocalDate inventoryStartDate;
    private LocalDate soldDate;
    private BigDecimal dealerCost;
    private BigDecimal sellingPrice;

    public Vehicle(){	}

    public Vehicle(int inventoryId, String carMake, String model, Year yearMade, LocalDate inventoryStartDate,
                   LocalDate soldDate, BigDecimal dealerCost, BigDecimal sellingPrice) {
        super();
        this.inventoryId = inventoryId;
        this.carMake = carMake;
        this.model = model;
        this.yearMade = yearMade;
        this.inventoryStartDate = inventoryStartDate;
        this.soldDate = soldDate;
        this.dealerCost = dealerCost;
        this.sellingPrice = sellingPrice;
    }


    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYearMade() {
        return yearMade;
    }

    public void setYearMade(Year yearMade) {
        this.yearMade = yearMade;
    }

    public LocalDate getInventoryStartDate() {
        return inventoryStartDate;
    }

    public void setInventoryStartDate(LocalDate inventoryStartDate) {
        this.inventoryStartDate = inventoryStartDate;
    }

    public LocalDate getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(LocalDate soldDate) {
        this.soldDate = soldDate;
    }

    public BigDecimal getDealerCost() {
        return dealerCost;
    }

    public void setDealerCost(BigDecimal dealerCost) {
        this.dealerCost = dealerCost;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}


	


