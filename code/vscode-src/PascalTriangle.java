//杨辉三角/帕斯卡三角
import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number of the levels you would like your Pascal's triangle to be:");
        int level = in.nextInt();
        in.close();

        int[][] triangle = new int[level][];

        for (int i = 0; i < triangle.length; i++){
            triangle[i] = new int[i];
            for (int j = 0; j < triangle[i].length; j++){
                if (j==0 || j==triangle[i].length-1) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}