package com.genoveva;

import java.util.Scanner;

public class MilesPerGalon {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mpg;
		double milesDriven;
		double gallonsUsed;
		
		System.out.println("How many miles did you drive?");
		milesDriven = in.nextDouble();
		
		System.out.println("How many gallons of gas did your car consume?");
		gallonsUsed = in.nextDouble();
		
		mpg = milesDriven / gallonsUsed;
		
		System.out.println("Your car's MPG  is "+ mpg);
		
		in.close();
	}

}
