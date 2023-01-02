package com.bridgelabz.evenodd;
import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" First number to check even or odd: ");
		int num = sc.nextInt();
		
		if ( num%2 == 0 ) {
			System.out.println( num + " is even number");
		}
		else {
			System.out.println( num + " is odd number");
		}
	}
}
