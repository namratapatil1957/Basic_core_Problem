package com.bridgelabz.powerof2;
import java.util.*;

public class powerof2 {
 
	public static void main(String[] args) {
		
		int n;
		int table = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number :" );
		int num = sc.nextInt();
	
		for ( n=1; n <= num; n++ ) {
			table= (int) Math.pow(2,num);
			
		}
		System.out.println(" Table:" +table);
	}
}
