package basic_java;

import java.util.Scanner;

public class AdditionOfPolynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[] poly = new int[100];
		
		int highest = 0;
		int n = 0;
		
		String polynomial = "";
		
		while( n != 2 ) {
			int p = in.nextInt();
			int f = in.nextInt();
			
			poly[p] += f;
//			if ( p == 0 && f == 0) continue;
			if ( p == 0 ) n++;
			if ( highest == 0 || highest < p ) highest = p;
		}
		
		for ( int i = 0; i <= highest; i++ ) {
			if (poly[i]==0) continue;
			
			String mark = "";
			String x = "x";
			String fNumber = ""+i;
			
			
			if (poly[i]>0) mark = "+";
			if (i==highest) mark = "";
			
			
			if (i==0) {
				 x = "";
				 fNumber = "";
			}
			
			
			if (i==1) fNumber = "";
			
			polynomial = mark+poly[i]+x+fNumber+polynomial;
		}
		System.out.println(polynomial);
	}

}
