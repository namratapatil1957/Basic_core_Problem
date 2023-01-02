package com.bridgelabz.largestofthree;
import java.util.*;
public class Largest_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter the First number: ");
		int num1 = sc.nextInt();
		
		System.out.println(" Enter the Second number: ");
		int num2 = sc.nextInt();
		
		System.out.println(" Enter the Third number: ");
		int num3 = sc.nextInt();
		
		if ( (num1 > num2) && ( num1 > num3)) {
			System.out.println( num1 +" is largest ");
		}
		else if ( num2 > num3 ) {
			System.out.println( num2 +" is largest");
		}
		else {
			System.out.println(num3 +" is largest");
		}
	}
}
