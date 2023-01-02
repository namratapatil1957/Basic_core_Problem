package com.bridgelabz.harmonicnumber;

import java.util.*;

public class harmonic_number {

	public static void main(String[] args) {
		
		double number=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n harmonic number: ");
		double num = sc.nextInt();
		
		while (num != 0 ) {
			
			number = number + 1/num;
			System.out.println(number + "");
			num--;
			
		}
	}
}
