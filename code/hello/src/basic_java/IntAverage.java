package basic_java;

import java.util.Scanner;

public class IntAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int number = 0;
		
		while (number != -1) {
			sum += number;
			count += 1;
			number = in.nextInt();
		}
		if (count - 1 > 0) {
			System.out.println("平均数= "+(double)sum/(count-1));
		}
		
	}

}
