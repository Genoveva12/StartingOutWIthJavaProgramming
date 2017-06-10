package com.genoveva;

import java.util.Scanner;

public class WordGame {

	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Name");
		String name = in.nextLine();
		System.out.println("Enter a number");
		String age = in.nextLine();
		System.out.println("Enter a City");
		String city = in.nextLine();
		System.out.println("Enter a College");
		String college = in.nextLine();
		System.out.println("Enter a Profession");
		String profession = in.nextLine();
		System.out.println("Enter an animal");
		String animal = in.nextLine();
		System.out.println("Enter a pet name");
		String petname = in.nextLine();
		
		System.out.println("The once was a person named " + name + " who lived in " + city + ". " );
		System.out.println("At the age of " + age + " went to college at " + college + ".");
		System.out.println(name + " graduated and went to work as a/an " + profession + ". ");
		System.out.println("Then, " + name + " adopted a/an " + animal + " named " + petname + ". ");
		System.out.println("They both lived happily ever after!");
		
	}

}
