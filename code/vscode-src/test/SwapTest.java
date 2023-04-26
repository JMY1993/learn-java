package test;

public class SwapTest {
    public int value;

    public static void main(String[] args) {
        SwapTest a = new SwapTest();
        SwapTest b = new SwapTest();
        a.value = 1;
        b.value = 2;

        a.swap(a, b);
        
        System.out.println(a.value + " " + b.value);
    }

    public void swap(SwapTest a, SwapTest b){

        System.out.println(a.value + " " + b.value);

        SwapTest temp = a;
        a = b;
        b = temp;

        System.out.println(a.value + " " + b.value);
    }
}
