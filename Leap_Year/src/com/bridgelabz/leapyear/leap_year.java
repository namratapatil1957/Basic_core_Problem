package com.bridgelabz.leapyear;

import java.util.*;

public class leap_year {

	public static void main(String[] args) {
		
		int year;
		
		Scanner sc= new Scanner (System.in);

		System.out.println(" Enter the year in yyyy format:" );
		year = sc.nextInt();
		
		if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0))
		{
			System.out.println("Year is leap year ");
		}
		else {
			System.out.println(" Year is not leap year ");
		}
	}
}
