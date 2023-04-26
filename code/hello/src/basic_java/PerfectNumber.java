package basic_java;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfect(int n) {
		
		int sumOfFactors = 0;
				
		for ( int i = 1; i < n; i++ ) {
			if ( n % i ==0 ) {
				sumOfFactors += i;
			}
		}
		
		return n == sumOfFactors;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int cnt = 0;
		for (int i = n; i <= m; i++) {
			if ( isPerfect(i) ) {
				if ( cnt != 0) {
					System.out.print(" ");
				}
				System.out.print(i);
				cnt++;
			}
		}
		
		if ( cnt==0 ) {
			System.out.println("\n一个也没有");
		}
	}

}
