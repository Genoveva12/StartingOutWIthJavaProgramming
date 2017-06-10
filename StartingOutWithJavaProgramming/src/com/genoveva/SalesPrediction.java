package com.genoveva;

public class SalesPrediction
{

	public static void main (String[] args)
	{
		double eastCoastDiv = 0.62;
		double totalSales = 4600000;
		double eastCoastDivSales;
		
		eastCoastDivSales = totalSales * eastCoastDiv;
		
		System.out.println(eastCoastDivSales);
	}
}
