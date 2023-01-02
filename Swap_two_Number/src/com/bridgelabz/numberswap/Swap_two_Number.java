package com.bridgelabz.numberswap;
import java.util.*;
public class Swap_two_Number {

	public static void main(String[] args) {
		
		double first_num, second_num;
		double temp;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter the First number: ");
		first_num = sc.nextInt();
	
		System.out.println(" Enter the Second number: ");
		second_num = sc.nextInt();

		System.out.println(" First number before swap: " +first_num);
		System.out.println(" second number before swap: " +second_num);
		System.out.println("");
		
		temp = first_num;
		first_num = second_num;
		second_num = temp;
		
		// Swapping of number
		System.out.println(" First number after swap: " +first_num);
		System.out.println(" second number after swap: " +second_num);
	}
}
