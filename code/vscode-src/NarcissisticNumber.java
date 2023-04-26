//水仙花数
import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number with 3 digits:");

        int num = in.nextInt();
        in.close();

        if (num>=100 && num <=999){

            int a = num/100;
            int b = (num%100)/10;
            int c = num%10;
            if (a*a*a + b*b*b + c*c*c == num) {
                System.out.println("You've entered a narcissistic number!");
            } else {
                System.out.println("You've entered a non-narcissistic number!");
            }
        } else {
            System.out.println("The number should be a 3-digit number!");
        }
    }
}
