import java.util.Arrays;

public class ArrayAssignTest{
    public static void main(String[] args){
        int[] firstArray = { 2, 3, 5, 7, 11, 13 };
        System.out.println("初始声明并赋值 firstArray" + Arrays.toString(firstArray));
        int[] secondArray = new int[] { 17, 19, 23, 29, 31, 37 };
        System.out.println("匿名数组语法 secondArray" + Arrays.toString(secondArray));
        int[] thirdArray;
        //thirdArray = { 17, 19, 23, 29, 31, 37 }; //不通过，数组常量只能用在初始化表达式中
        thirdArray = new int[]{ 17, 19, 23, 29, 31, 37 };
        System.out.println("简写 thirdArray" + Arrays.toString(thirdArray));
    }
}