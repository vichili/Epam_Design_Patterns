package com.epam.designpatterns.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPatternCustomer {

	private static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {

		do {

			System.out.println("==========Food Menu==========");
			System.out.println("     1. Vegetarian Food.");
			System.out.println("     2. Non-Vegetarian Food");
			System.out.println("     3. Chineese Food");
			System.out.println("     4. Exit");
			System.out.println("Enter your choice: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());

			switch(choice) {

			case 1: 
				VegFood vf = new VegFood();
				System.out.println(vf.prepareFood());
				System.out.println(vf.foodPrice());
				break;
				
			case 2:
				Food f1 = new NonVegFood((Food) new VegFood());
				System.out.println(f1.prepareFood());
				System.out.println(f1.foodPrice());
				break;
				
			case 3:
				Food f2 = new ChineeseFood((Food) new VegFood());
				System.out.println(f2.prepareFood());
				System.out.println(f2.foodPrice());
				break;
				
			default:
				System.out.println("Other than these no food Available");
				return;

			}
		}while(choice != 4);

	}

}
