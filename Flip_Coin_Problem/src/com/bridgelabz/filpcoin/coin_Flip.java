 
package com.bridgelabz.filpcoin;

import java.util.*;

public class coin_Flip {

	
	public static void main(String[] args) {
		
		int head = 0;
		int tail=0;
		int count;
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("How many time do you want to flip the coin: " );
		int coin = sc.nextInt();
		
		for ( count=1; count <= coin; count++ ) {
			int flip = (int) ( Math.floor( Math.random()*10 ) %2 );      // 1 is head and 0 is tail
			System.out.println(flip);
			
				if ( flip == 1 ) {
					
					head ++;
				}
				else {
					tail ++;
			}
		}
		
		// Calculation for head percentage
		double perc_head = (double) head/coin*100 ;
		System.out.println(" Percentage of head: " + perc_head);
		
		// Calculation for tail percentage
		double perc_tail = (double)tail/coin*100 ;
		System.out.println(" Percentage of head: " + perc_tail);
	}
}
