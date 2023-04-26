//空心菱形
import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the levels you would like your diamond to be:");

        int level = in.nextInt();
        in.close();

        int i = 1;
        for (; i<=level; i+=2) {
            for (int j=1; j<=(level - i)/2; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                char sign = ' ';
                if (j==1 || j==i) {
                    sign = '*';
                }
                System.out.print(sign);
            }
            System.out.print("\n");
        }

        i-=4;
        for (; i>=1; i-=2) {
            for (int j=1; j<=(level - i)/2; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                char sign = ' ';
                if (j==1 || j==i) {
                    sign = '*';
                }
                System.out.print(sign);
            }
            System.out.print("\n");
        }
    }
}
