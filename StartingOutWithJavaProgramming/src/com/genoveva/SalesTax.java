package com.genoveva;

import java.util.Scanner;

public class SalesTax {

	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
        
		final double stateTax = 0.12;
		final double countyTax = 0.01;
		double purchaseAmount;
		double purchaseState;
		double purchaseCounty;
		double purchaseTotal;
		
		System.out.println("Please enter the amount of the purchase ");
		purchaseAmount = in.nextDouble();
		
		purchaseState = purchaseAmount * stateTax;
		purchaseCounty = purchaseAmount * countyTax;
		purchaseTotal = purchaseAmount + purchaseState + purchaseCounty;
		
		System.out.println("Purchase Amount =     " + purchaseAmount);
		System.out.println("State Tax       =     " + purchaseState);
		System.out.println("County Tax      =     " + purchaseCounty);
		System.out.println("Purchase Total  =     " + purchaseTotal);
		
		in.close();
	}

}
