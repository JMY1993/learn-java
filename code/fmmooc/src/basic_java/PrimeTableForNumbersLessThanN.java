package basic_java;

import java.util.Scanner;

public class PrimeTableForNumbersLessThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number, under which the program will generate all the prime numbers");
		int n = in.nextInt();
		
		boolean[] marks = new boolean[n];
		//mark all numbers as primes
		
		//the index n of the array means the number (n+1)
		//so number m is represented by index m-1
		for ( int i = 1; i < n; i++ ) {
			marks[i] = true;
		}
		
		for ( int i = 1; i < n; i++) {
			if (marks[i]) {
				for ( int m = 2; m*(i+1)-1 < n ; m++ ) {
					marks[m*(i+1)-1] = false;
				}
			}
		}
		
		for ( int i = 0; i < n; i++ ) {
			if (marks[i]) {
				System.out.print(i+1+" ");
			}
		}
	}

}
