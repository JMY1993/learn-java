package basic_java;

import java.util.Scanner;

public class PrimeFactorizations {
	public static boolean isPrime(int n) {
		
		if ( n == 1 ) return false;
		if ( n == 2 ) return true;
		
		if ( n % 2 == 0 ) {
			return false;
		}
		
		for ( int i = 3; i <= (int)Math.sqrt(n); i+=2 ) {
			if ( n % i == 0 ) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int[] getPrimesLessThan(int n) {
		
		boolean[] marks = new boolean[n];
		//mark all numbers as primes
		
		//the index n of the array means the number (n+1)
		//so number m is represented by index m-1
		for ( int i = 2; i < n; i++ ) {
			marks[i] = true;
		}
		
		int numOfPrimes = n;
		
		for ( int i = 1; i < n; i++) {
			if ( marks[i] ) {
				for ( int m = 2; m*i < n ; m++ ) {
					marks[m*i] = false;
				}
			}
		}
		
		for ( int i = 0; i < n; i++) {
			if (!marks[i]) {
				numOfPrimes--;
			}
		}
		
		int[] results = new int[numOfPrimes];
		
		for ( int i = 0, currentIndex = 0; i < marks.length; i++ ) {
			if ( marks[i] ) {
				results[currentIndex] = i;
				currentIndex++;
			}
		}
		
		return results;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n =  in.nextInt();
		
		String result = n+"=";
		int[] primes = getPrimesLessThan(n);
		
		int number = n;
		
		Main_Loop:
		do {
			if ( isPrime(number) )
				//如果被除数本身就是质数，直接返回
			{
				if ( result.indexOf('=') == result.length()-1 ) {
					
					result+=number;
					
				} else {
					
					result += ("x" + number);
					
				}
				break;
			}
			else if ( number == 1 )
				//如果被除数已经在上一次循环中被一个质数除尽，并且结果是1，表明已经分解完成；
			{
				break;
			}
			else
				
			{
				for (  int i = 0; i < primes.length; i++ ) {
					if ( number % primes[i] == 0 ) 
						//如果被除数能被质数表中任何一个数整除，记录这个数，并把number变为其与这个数的商，重新开始主循环；
					{
						if ( result.indexOf('=') == result.length()-1 ) 
						{
						result+=primes[i];
						} 
						else 
						{
							result += ("x" + primes[i]);
						}
						number = number/primes[i];
						continue Main_Loop;
					}
				}
			}
		} while (true);
			
		System.out.println(result);
	}

}
