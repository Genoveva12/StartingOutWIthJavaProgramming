package com.genoveva;

import java.util.Scanner;

public class IngredientAdjuster {

	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		final double cupsSugar = 0.03;
		final double cupsButter = 0.02;
		final double cupsFlour = 0.05;
		
		double sugarNeeded;
		double butterNeeded;
		double flourNeeded;
		double cookies;
		
		System.out.println("How many cookies do you want to make?");
		cookies = in.nextDouble();
		
		sugarNeeded = cupsSugar * cookies;
		butterNeeded = cupsButter * cookies;
		flourNeeded = cupsFlour * cookies;
		
		System.out.println("To make " + cookies + "cookies, you need: ");
		System.out.println(sugarNeeded + " cups of Sugar");
		System.out.println(butterNeeded + " cups of Butter");
		System.out.println(flourNeeded + " cups of Flour");

	}

}
