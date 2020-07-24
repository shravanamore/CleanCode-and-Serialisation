package com.epam.CleanCodeAndSerialisation;

import java.util.*;
public class SimpleCompound implements InterfaceCompoundandSimple
{
	Scanner sc;
	int principle;
	int Rate;
	int termOfLoan;

	SimpleCompound()
    {
        sc = null;
        principle = 0;
        Rate = 0;
        termOfLoan = 0;
    }

   
    public float SimpleInterest() 
    {
         float simpleInterest = (principle*((float)Rate/100)*termOfLoan)/100;
         return simpleInterest;
    }
    
    public double CompoundInterest()
    {
        double compoundInterest = (double)(principle * (Math.pow((1+(double)Rate/100),termOfLoan)))-principle;
        return compoundInterest;        
    }
       
    public void readInput()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount ");
        principle = sc.nextInt();
        System.out.println("Enter the Interest Rate ");
        Rate = sc.nextInt();
        System.out.println("Enter the Term of Loan");
        termOfLoan = sc.nextInt();
    }        
}
