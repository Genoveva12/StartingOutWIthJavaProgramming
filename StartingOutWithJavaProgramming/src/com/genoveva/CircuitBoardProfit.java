package com.genoveva;

import java.util.Scanner;

public class CircuitBoardProfit {

	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double retailPrice;
		double profit;
		
		System.out.println("How much is the circuit's retail price?");
		retailPrice = in.nextDouble();
		
		profit = retailPrice * 0.4;
		
		System.out.println("Your profit for the circuit is $" + profit);
         in.close();
	}

}
