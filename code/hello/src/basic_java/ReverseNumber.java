package basic_java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		int reverse_number = 0;
		while (number!=0) {
			int unit_digit = number%10;
			number = number/10;
			reverse_number = reverse_number*10+unit_digit;
		}
		System.out.println(reverse_number);
	}

}
