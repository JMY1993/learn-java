package basic_java;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double seed = Math.random(); // [0,1)
		int answer = (int)(seed*100+1); //[0,100) --> [1,100]
		
		System.out.println("Please enter a number within the range [1, 100]:");
		
		int guess;
		int count = 0;
		do {
			guess = in.nextInt();
			count++;
			if (guess > answer) {
				System.out.println("Too big!");
			} else if (guess < answer) {
				System.out.println("Too small!");
			}
		} while (guess != answer);
		System.out.println("Bingo! You have guessed "+count+" times!");
	}

}
