//嵌套if
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int month = 0;
        int age = 0;

        System.out.println("请输入月份：");
        month = in.nextInt();

        System.out.println("请输入年龄：");
        age = in.nextInt();
        in.close();

        if (month >= 4 && month <= 10) {
            System.out.println("旺季票----------------");
            if (age >= 18 && age <= 60){
                System.out.println("票价：60（成人全票）");
            } else if (age >= 1 && age < 18) {
                System.out.println("票价：30（儿童半价）");
            } else if (age > 60 && age <=99) {
                System.out.println("票价：20（老人1/3价）");
            } else if (age > 99) {
                System.out.println("票价：0（百岁老人免费）");
            } else {
                System.out.println("年龄不能为负数！");
            }

        } else if (month >= 1 || month <= 12) {

            System.out.println("淡季票----------------");

            if (age >= 18 && age <= 60){
                System.out.println("票价：40（成人全票）");
            } else if (age > 99) {
                System.out.println("票价：0（百岁老人免费）");
            } else if (age > 0) {
                System.out.println("票价：20（非成人票）");
            } else {
                System.out.println("年龄不能为负数！");
            }

        } else {
            System.out.println("输入月份有误！");
        }

    }
}
