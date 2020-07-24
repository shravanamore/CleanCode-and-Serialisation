package com.epam.CleanCodeAndSerialisation;

import java.util.Scanner;
class EstimateHouseCost implements InterfaceEstimateCost
{
   
	String materialStandard;  
    int totalArea;
    EstimateHouseCost(String material,int area)
    {
        materialStandard=material;
        totalArea=area;
    }

    
    public int Estimatingcost()
    {
    	int totalCost=0;
        if(materialStandard.compareToIgnoreCase("standard")==0)
	    {
	        totalCost+=1200*totalArea;
	        if(totalCost <= 99999)
	        	return 0;
	    }
	    else if(materialStandard.compareToIgnoreCase("above standard")==0)
	    {
	    	totalCost+=1500*totalArea;
	    }
	    else if(materialStandard.compareToIgnoreCase("high standard")==0)
	    {
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Do you need a fully automated one\nYes or No");
		     String choice = sc.next();
		     if(choice.equals("Yes")) totalCost+=2500*totalArea;           
		     else totalCost+= 1800*totalArea;        
		}
	    return totalCost;
    }   
}
