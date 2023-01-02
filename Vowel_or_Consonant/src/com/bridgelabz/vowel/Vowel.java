package com.bridgelabz.vowel;
import java.util.*;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter the Alphabet: ");
		char p = sc.next().charAt(0);
		
		if ( p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u' ) {
			
			System.out.println( p + " is Vowel");
		}
		else {
			
			System.out.println( p + " is consonant");
		}
	}
}
