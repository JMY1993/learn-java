package test;
//switch语句测试
public class SwitchTest{
    public static void main(String[] args) {
        final char STANDARD = 'c';
        char c = 'c';

        switch(c) {
            case STANDARD :
                System.out.println("This varable is STANDARD!");
                break;
            case 'a':
                System.out.println(c);
                break;
            default:
                System.out.println(c);
        }
    }
}