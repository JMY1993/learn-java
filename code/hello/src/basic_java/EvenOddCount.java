package basic_java;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int evenCount = 0;
		int oddCount = 0;
		int number = in.nextInt();
		while (number != -1){
			if (number%2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			number = in.nextInt();
		}
		System.out.println(oddCount+" "+evenCount);
	}

}
