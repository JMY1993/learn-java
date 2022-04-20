package basic_java;

import java.util.Scanner;

public class OddEvenEigenvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		int count = 0;
		
		while (number != 0) {
			count++;
			int unitDigit = number%10;
			number /= 10;
			
			if (unitDigit%2 == count%2) {
				result += Math.pow(2, count-1);
			}
		}
		
		System.out.println(result);
		
	}

}
