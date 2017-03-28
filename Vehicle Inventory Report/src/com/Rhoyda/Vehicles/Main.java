package com.Rhoyda.Vehicles;

import com.Rhoyda.Car.Car;
import com.Rhoyda.Car.Ford;
import com.Rhoyda.Truck.Truck;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.function.Consumer;

public class Main implements Serializable{

    public static void main(String [] args){
        File file = new File("samsautos.ser");
        Main main;
        
        if(!file.exists()){
            createMain();
        }
        
        main = restoreMain();
        main.printMonthlyReport();
    }

    private static void createMain() {
        //Make a default main object first
        Main main = new Main();
        
        main.vehicles.add(new com.Rhoyda.Car.Ford(1, "Crown Victoria", Year.of(2010), LocalDate.of(2012, 7, 3), LocalDate.of(2012, 7, 23),
                BigDecimal.valueOf(8_900), BigDecimal.valueOf(14_000), Car.Doors.FOUR_DOORS));
        main.vehicles.add(new com.Rhoyda.Car.Other(2, "Toyota", "Camry", Year.of(2009), LocalDate.of(2012, 7, 23), LocalDate.of(2012, 7, 27), 
        		BigDecimal.valueOf(7_600), BigDecimal.valueOf(17_500), Car.Doors.FOUR_DOORS));
        main.vehicles.add(new com.Rhoyda.Truck.Ford(3, "F-150", Year.of(2010), LocalDate.of(2012, 7, 21), LocalDate.of(2012, 7, 29), 
        		BigDecimal.valueOf(17_600), BigDecimal.valueOf(27_500), Truck.Wheels.FOUR_WHEELS));
        main.vehicles.add(new com.Rhoyda.Truck.Ford(7, "F-450", Year.of(2010), LocalDate.of(2012, 7, 14), LocalDate.of(2012, 7, 30), 
        		BigDecimal.valueOf(17_600), BigDecimal.valueOf(39_500), Truck.Wheels.SIX_WHEELS));
        main.vehicles.add(new com.Rhoyda.Truck.Other(4, "GMC", "Sierra 1500", Year.of(2009), LocalDate.of(2012, 7, 02), LocalDate.of(2012, 7, 24), 
        		BigDecimal.valueOf(11_600), BigDecimal.valueOf(19_500), Truck.Wheels.FOUR_WHEELS));
        main.vehicles.add(new com.Rhoyda.Car.Dodge(5, "Caravan", Year.of(2009), LocalDate.of(2012, 7, 07), LocalDate.of(2012, 7, 18), 
        		BigDecimal.valueOf(2_600), BigDecimal.valueOf(9_500), Car.Doors.FOUR_DOORS));
        main.vehicles.add(new com.Rhoyda.Car.Ford(6, "Mustang", Year.of(2009), LocalDate.of(2012, 7, 14), LocalDate.of(2012, 8, 23), 
        		BigDecimal.valueOf(12_600), BigDecimal.valueOf(25_600), Car.Doors.TWO_DOORS));
        
        //Then serialize it to a file. The object will get restored in restoreMain
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("samsautos.ser")))){
            objectOutputStream.writeObject(main);
        }catch (Exception e){
        	throw new RuntimeException(e);
        }
        
    }
    
    private static Main restoreMain() {
    	try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("samsautos.ser")))){
    		return (Main) objectInputStream.readObject();
        }catch (Exception e){
        	throw new RuntimeException(e);
        }
    }

    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    private void printMonthlyReport() {
    	
    	//First report generated on August 1st. 
        //All vehicles in the system (July 1 - July 31) *Should reflect all vehicles
        //Summary of total cars sold during the period (July 1 - July 31)  *Mustang is not sold in July
        //Number of Ford cars sold (July 1 - July 31) *Mustang should not be included
        //Number of Total Trucks sold (July 1 - July 31) *Should reflect all trucks
        //Total sales of all vehicles (July 1 - July 31) *Total Sales of all minus Mustang
        //Net Profit (July 1 - July 31) *Profit all of vehicles sold minus Mustang 
    	
    	
    	
        //Get the vehicles in inventory
        Collection<Vehicle> currentInventory = vehicles.stream().filter(p -> p.getInventoryStartDate().isBefore(LocalDate.of(2012, Month.JULY, 31)) && p.getSoldDate().getYear() == 2012)
                .collect(Collectors.toList());
    	
        //Get the vehicles sold during july
        Collection<Vehicle> julySales = vehicles.stream().filter(p -> p.getSoldDate().getMonth().equals(Month.JULY) && p.getSoldDate().getYear() == 2012)
                .collect(Collectors.toList());

        
        //First thing to do is create a report of all vehicles in the system during (July 1 - 31)
        final String headerString = "%-2s %-15s %-15s %-4s %-7s %-7s %-6s %-6s\n";
        final String tableString = "%-2d %-15s %-15s %-4d %-4d/%-2d %-4d/%-2d $%-5d $%-5d\n";

        System.out.printf(headerString, "ID", "Make", "Model", "Year", "Bought", "Sold", "Cost", "Sold");
        
        //Make a reusable consumer that let's us print the tables in the
        //report consistently
        final Consumer<Vehicle> tableRowConsumer = (vehicle) -> System.out.format(tableString, vehicle.getInventoryId(),
                vehicle.getCarMake(),
                vehicle.getModel(),
                vehicle.getYearMade().getValue(),
                vehicle.getInventoryStartDate().getYear(),
                vehicle.getInventoryStartDate().getMonth().getValue(),
                vehicle.getSoldDate().getYear(),
                vehicle.getSoldDate().getMonth().getValue(),
                vehicle.getDealerCost().intValue(),
                vehicle.getSellingPrice().intValue());

        
        System.out.println("Total Inventory");
        System.out.printf(headerString, "ID", "Make", "Model", "Year", "Bought", "Sold", "Cost", "Sold");
        currentInventory.forEach(tableRowConsumer);
        System.out.println("Total Vehicles: " + currentInventory.size());
        
        System.out.println("");
        System.out.println("Total July Sales");
        System.out.printf(headerString, "ID", "Make", "Model", "Year", "Bought", "Sold", "Cost", "Sold");
        julySales.forEach(tableRowConsumer);
        System.out.println("Total Vehicles: " + julySales.size());

        //Get the Ford Cars
        Collection<Vehicle> fordCars = julySales.stream().filter(vehicle -> vehicle instanceof com.Rhoyda.Car.Ford).collect(Collectors.toList());
        System.out.println("");
        System.out.println("Ford Cars Sold in July");
        System.out.printf(headerString, "ID", "Make", "Model", "Year", "Bought", "Sold", "Cost", "Sold");
        fordCars.forEach(tableRowConsumer);

        //Get the Trucks
        Collection<Vehicle> trucks = julySales.stream().filter(vehicle -> vehicle instanceof Truck).collect(Collectors.toList());
        System.out.println("");
        System.out.println("Trucks Sold In July");
        System.out.printf(headerString, "ID", "Make", "Model", "Year", "Bought", "Sold", "Cost", "Sold");
        trucks.forEach(tableRowConsumer);

        //Get the totals
        BigDecimal totalSales = BigDecimal.ZERO;
        BigDecimal costBasis = BigDecimal.ZERO;
        for(Vehicle vehicle : julySales){
            totalSales = totalSales.add(vehicle.getSellingPrice());
            costBasis = costBasis.add(vehicle.getDealerCost());
        }
        //Print the summary
        System.out.println("");
        System.out.println("Total Sales July: $" + totalSales.intValue());
        System.out.println("Net Profit July: $" + (totalSales.subtract(costBasis).intValue()));
        
    }
        
}
