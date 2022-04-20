package basic_java;

import java.util.Scanner;

public class SumOfPrimesFromN2M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int result = 0;
		int counter = 0;
		int number = 2;
		
		outer:
		while(counter<m) {
			for(int i = 2; i < number; i++) {
				if (number%i==0) {
					number++;
					continue outer;
				}
			}
			counter++;
			if (counter>=n) {
				result += number;
			}
			number++;
		}
		
		System.out.println(result);
		
	}

}
