package com.genoveva;

import java.util.Scanner;

public class StringManipulator 
{

	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String city;
		
		System.out.println("Enter your favorite City");
		city = in.nextLine();
		
		System.out.println(city + " is " + city.length() + " letters long");
		System.out.println("The first letter in " + city + " is " + city.charAt(0));
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		in.close();
	}

}
