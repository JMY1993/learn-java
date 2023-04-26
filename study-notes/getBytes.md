新来的一同事（Java开发），需要完成这样一个功能：组装8位xml长度（不足8位补空格）+8位交易标识符+xml报文，通过socket发到特色服务器（该服务器是C语言），该服务器接收到该xml报文以后，根据传送过去的长度解析xml，发现总是少了几位（银行截取字符串是按照该同事报文头传过去的报文总长度计算的）。该同事通过比较，发现计算出来的长度人为+24，对方就能够解开，便问为什么socket传输过程中会丢长度？

我完全蒙蔽了，去看了一眼他的代码，发现计算xml长度，他用的是string.length()函数计算出来的长度，应该不会有错（此时没考虑中文），再看一眼xml报文，恰好有12个中文，这就不难解释为什么人为加24的长，银行端就能解开xml报文了。
```java
public static void main(String[] args) {
        String str = "仙剑奇侠传";
        System.err.println(str.length());
    }
```
对于上面代码中的中文，string.length()得出的长度是5，但是银行服务器端中文是按照byte流的长度来计算的，所以计算出来的长度是10，所以我就提醒他改用byte来计算总长度，就能避免中文长度计算失败了。

所以该同事改用这句代码来计算长度：
System.out.println(str.getBtyes().length);

String.length()：返回字符串的字符个数，一个中文算一个字符；
String.getBytes().length：返回字符串的字节长度，一个中文两个字节；

原本这样写也没有问题，但是他传过去的长度，又错了。String.getBytes().length方法是得到一个字串的字节数组，但是本方法将返回该操作系统默认的编码格式的字节数组，所以只用该方法的时候，需要制定编码格式：
```java
public static void main(String[] args) {
        String str = "仙剑奇侠传";
        System.err.println(str.length());
        try {
            System.err.println(str.getBytes().length);
            System.err.println("GBK=="+str.getBytes("GBK").length);
            System.err.println("UTF-8=="+str.getBytes("UTF-8").length);
            System.err.println("GB2312=="+str.getBytes("GB2312").length);
            System.err.println("ISO-8859-1=="+str.getBytes("ISO-8859-1").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
```
执行结果，如下图：



加了编码，问题解决！
————————————————
版权声明：本文为CSDN博主「南丘xf」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_39309402/article/details/98127000