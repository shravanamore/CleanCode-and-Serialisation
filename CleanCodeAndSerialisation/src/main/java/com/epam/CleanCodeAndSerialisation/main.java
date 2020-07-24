package com.epam.CleanCodeAndSerialisation;

import java.util.*;
public class main 
{
	public static void main(String[] args) 
	{        
		Scanner sc = new Scanner(System.in);
	    while(true)
	    {
	    	System.out.println("1 ->Calculate Compound and Simple Interest");
	        System.out.println("2 -> Estimate Cost for House Construction");
	        System.out.println("3 -> Exit");           
	        switch(sc.nextInt())
	        {
	            case 1 :
	                SimpleCompound calculateSimpleCompound = new SimpleCompound();
	                calculateSimpleCompound.readInput();
	                float simpleInterest = calculateSimpleCompound.SimpleInterest();
	                System.out.println("Simple Interest is " + simpleInterest);               
	                double compoundInterest = calculateSimpleCompound.CompoundInterest();
	                System.out.println("Compound Interest is "+ compoundInterest);
	                break;
	            case 2:
	            	ReadInput inputReader = new ReadInput(); 
	                inputReader.readInput();
	                String standard = inputReader.getStandard();
	                int totaArea = inputReader.getTotalArea();
	                EstimateHouseCost estimateHouseCost = new EstimateHouseCost(standard, totaArea);
	                int estimatedCost = estimateHouseCost.Estimatingcost();
	                System.out.println("Estimated Cost of House is" + estimatedCost);
	                break;
	            case 3:
	                System.exit(0);
	            default:
	                break;        
	        }
	    }
	}
}	

