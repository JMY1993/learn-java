//用char类型进行字符串拼接
public class CharConcat {
    public static void main(String[] args) {
        char chr = 'n';
        System.out.println(chr);

        //可以直接用 “+” 进行字符串拼接
        String str = chr + "";
        System.out.println(str);

        char[] chrs = {chr, chr, chr};
        String str2 = new String(chrs);
        System.out.println(str2);
    }
}
