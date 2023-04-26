//空心金字塔
import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the levels you would like your pyramid to be:");

        int level = in.nextInt();
        in.close();

        for (int i = 1; i<=level; i+=2) {
            for (int j=1; j<=(level - i)/2; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                char sign = ' ';
                if (j==1 || j==i || i>=level-1) {
                    sign = '*';
                }
                System.out.print(sign);
            }
            System.out.print("\n");
        }
    }
}
