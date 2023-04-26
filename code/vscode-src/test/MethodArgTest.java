package test;

public class MethodArgTest {

    public int test = 0;
    public static void main(String[] args) {
        MethodArgTest testObj = new MethodArgTest();
        testObj.test = 10;
        testObj.test(testObj);

        System.out.println(testObj.test);
    }

    public void test(MethodArgTest obj) {
        obj.test = 100;
    }
}
