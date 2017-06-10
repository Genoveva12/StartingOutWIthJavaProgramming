package com.genoveva;

import java.util.Scanner;

public class RestaurantBill {

	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double mealCharge;
	    double tax;
		double tip;
		double totalBill;
		
		
		System.out.println("How much was your meal?");
		mealCharge = in.nextDouble();
		
		tax = mealCharge * 0.0675;
		tip = (mealCharge + tax) * 0.20;
		totalBill = mealCharge + tax + tip;
		
		System.out.println("Meal Charge     = " + mealCharge);
		System.out.println("Tax             = " + tax);
		System.out.println("Tip             = " + tip);
		System.out.println("Total           = " + totalBill);

	}

}
