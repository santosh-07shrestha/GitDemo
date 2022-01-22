package com.test;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		int input;
		do {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number: ");
			input = scan.nextInt();
			if(input ==0)
			{
				System.out.println("Invalid entry");
				break;
			}
			if (input % 3 == 0 && input % 5 == 0)
				System.out.println(input + " is divisible by 3 and 5");
			else if (input % 3 == 0)
				System.out.println(input + " is only divisible by 3 but NOT by 5");
			else if (input % 5 == 0)
				System.out.println(input + " is NOT divisible by 3 but by 5");
			else
				System.out.println(input + " is NOT divisible by 3 and 5");
		} while (input != 0);
		System.out.println("Program Terminated");
	}

}
