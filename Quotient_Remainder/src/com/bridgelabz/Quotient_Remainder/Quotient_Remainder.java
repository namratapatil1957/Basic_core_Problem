package com.bridgelabz.Quotient_Remainder;
import java.util.*;

public class Quotient_Remainder {

	public static void main(String[] args) {
		
		double quotient, remainder;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter the Dividend: ");
		double dividend = sc.nextInt();
	
		System.out.println(" Enter the Divisor: ");
		double divisor = sc.nextInt();
		
		quotient = dividend / divisor ;
		remainder = dividend % divisor ;
		
		System.out.println(" Quotient: " + quotient);
		System.out.println(" Remainder: " + remainder);
	}
}
