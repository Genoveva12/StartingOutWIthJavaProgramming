package com.genoveva;

public class EnergyDrinkConsumption {

	
	public static void main(String[] args)
	{
		final int totalCustomers = 12467;
		double weeklyBuyers;
		double citrusPreference;
		
		weeklyBuyers = totalCustomers * 0.14;
		citrusPreference = totalCustomers * 0.64;
		
		System.out.println(weeklyBuyers + " buy energy drinks weekly and " + citrusPreference + " prefer citrus flavored drinks.");

	}

}
