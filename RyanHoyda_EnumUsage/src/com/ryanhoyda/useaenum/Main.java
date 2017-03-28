package com.ryanhoyda.useaenum;

public class Main {

	   public static void main(String [] args){
	        for(JacketSize jacketSize : JacketSize.values()){
	            printJacketSize(jacketSize);
	            System.out.println("");
	        }
	    }

	    public static void printJacketSize(JacketSize jacketSize){
	        System.out.println("JacketSize.toString() = " + jacketSize.toString());
	        System.out.println("JacketSize.ordinal() = " + jacketSize.ordinal());
	        System.out.println("JacketSize.name() = " + jacketSize.name());
	        System.out.println("JacketSize.getSize() = " + jacketSize.getSize());
	        System.out.println("JacketSize.getChest_size() + " + jacketSize.getChest_size());
	    }
	}