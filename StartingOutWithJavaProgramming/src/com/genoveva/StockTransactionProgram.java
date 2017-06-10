package com.genoveva;

public class StockTransactionProgram {

	
	public static void main(String[] args) 
	{
		
     double profit;
     double totalPaid;
     double allSharesPrice;
     double allSharesCost;
     double brokerFirstCommission;
     double brokerSecondCommission;
     
     
     allSharesCost = 32.87 * 1000;     
     brokerFirstCommission = allSharesCost* 0.02;
     allSharesPrice = 33.92 * 1000;
     brokerSecondCommission = allSharesPrice * 0.02;
     
     totalPaid = brokerFirstCommission + brokerSecondCommission + allSharesCost;
     profit = allSharesPrice - totalPaid;
     
     System.out.println("Joe paid " + allSharesCost + " for the stocks.");
     System.out.println("Joe paid his broker " + brokerFirstCommission + " for the first transaction.");
     System.out.println("Joe sold the stocks for " + allSharesPrice);
     System.out.println("Joe paid his broker " + brokerSecondCommission + " for the second transaction");
     System.out.println("The total of Joe's transactions is " + profit);
     System.out.println("Joe lost money!");
     
	}

}
