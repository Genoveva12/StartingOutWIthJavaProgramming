package com.genoveva;

import java.util.Scanner;

public class CookieCalories {

	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		int cookiesEaten;
		int caloriesPerCookie = 75;
		int caloriesConsumed;
		
		System.out.println("How many cookies did you eat?");
		cookiesEaten = in.nextInt();
		
		caloriesConsumed = cookiesEaten * caloriesPerCookie;
		
		System.out.println("You consumed " + caloriesConsumed + " calories");
	}

}
