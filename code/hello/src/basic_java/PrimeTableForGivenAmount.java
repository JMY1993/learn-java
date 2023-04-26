package basic_java;

import java.util.Scanner;

public class PrimeTableForGivenAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number X, and this program will generate X primes:");
		int number = in.nextInt();
		
		int[] primes = new int[number];
		primes[0] = 2;
		int count = 1; // count means 1) how many primes are there in the array
					// 2) the index where next prime number generated should be placed
		MAIN_LOOP:
		for ( int i = 3; count < number; i++) {
			for ( int j = 0; j < count; j++ ) {
				if ( i % primes[j] == 0 ) {
					continue MAIN_LOOP;
				}
			}
			primes[count++] = i;
		}
		
		for ( int prime : primes) {
			System.out.print(prime+" ");
		}
		
	}

}
