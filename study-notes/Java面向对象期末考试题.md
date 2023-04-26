

1. 单选(2分)

‎以下哪句是错误的？

‎

- A.

  编译器在编译的时候得要能访问得到要import的类的编译结果文件

- B.

  编译器会搜索要import的类的编译结果文件而不是源文件

- C.

  import是把要import的类的源代码插入到import语句所在的地方

- D.

  import是告诉编译器要import的包的信息

2. 单选(2分)

‎试图编译和运行以下代码的结果是：

```java
class Base {   private Base() { System.out.println(0);}   public Base(int i) {System.out.println(i);} } public class Test extends Base {   public Test() {super(1);};   public static void main(String argv[]){     Test t = new Test();   } }
```

- A.

  因为构造器不能是private的所以不能编译

- B.

  通过编译，打印出1

- C.

  通过编译，打印出0

- D.

  由于Test的父类的构造器是私有的所以Test不能编译

3

单选(2分)

‏给定以下代码：

‏`public class Test {   private int i = f();   private int j = 10;   private int f() {     return j;   }   public static void main(String args[]) {     System.out.println((new Test()).i);   } }`

‏以下哪句是正确的？

‏

‏

‏

- A.

  通过编译，打印出10

- B.

  由于在main中访问了Test的私有的变量而不能编译

- C.

  由于成员变量定义初始化时的顺序错误而不能编译

- D.

  通过编译，打印出0

4

单选(2分)

‎有以下代码：

‎`class Value {   int i;   public boolean equals(Value v) {     return v.i == i;   } } public class Test {   public static void main(String[] args) {     HashSet<Value> set = new HashSet<Value>();     Value v1 = new Value();     Value v2 = new Value();     v1.i = v2.i = 39;     set.add(v1);     set.add(v2);     System.out.println(set.size());   } }`

‎以下哪句是正确的？

‎

‎

‎

- A.

  无法编译

- B.

  通过编译，但是运行的时候出错，说“set.add(v2);”这行试图加入一个已经存在的值

- C.

  通过编译，打印出2

- D.

  通过编译，打印出1

5

单选(2分)

‎试图编译和运行以下代码的时候会发生什么？

```
public class Q {   public static void main(String argv[]){     int anar[]=new int[5];     System.out.println(anar[0]);   } }
```

‎



- A.

  null

- B.

  0

- C.

  5

- D.

  错误：anar还没有初始化就用了

6

单选(2分)

‎对于以下代码：

```
class TestBed {   TestBed() {}   void f() { System.out.println("f()"); }   public static void main(String[] args) {     TestBed t = new TestBed();     t.f();   } } class TestDoor {   TestDoor() {}   void f() { System.out.println("f()"); }   public static void main(String[] args) {     TestDoor t = new TestDoor();     t.f();   } }
```

‎以下哪句是正确的?



‎



- A.

  无法编译，因为没有任何一个类是public的

- B.

  编译了，产生了两个.class文件

- C.

   无法编译，因为在一个文件里有两个main函数

- D.

  编译了，产生了一个.class文件，里面包含两个类

7

单选(2分)

‍有以下代码：

‎

‍String s1 = "Hello";

‎

‍String s2 = "Hello";

‎

‍String s3 = "Hellp";

‎

‍s3 = s3.replace('p', 'o');

‎

‍这里的s.replace('p', 'o')的功能是把所有的'p'都替换成'o'。以下哪句是正确的？

‎

‍

‎

- A.

  s1 == s2 是 false, s1 == s3 是 true

- B.

  s1 == s2 是 true, s1 == s3 是 false 

- C.

   s1 == s2 是 true, s1 == s3 是 true

- D.

  s1 == s2 是 false, s1 == s3 是 false 

8

单选(2分)

‌有下面的代码，要如何做，能调用Base的构造器来打印出出"base constructor"？

‌`class Base{   Base(int i){     System.out.println("base constructor");   }   Base(){} } public class BaseSup extends Base{   public static void main(String argv[]){     BaseSup s= new BaseSup();     //One   }   BaseSup(){     //Two   }   public void derived(){     //Three   } }`

‌

‌

- A.

   在//One后面放一句super(10);  

- B.

  在//One后面放一句Base(10);  

- C.

  在//Three后面放一句super(10);

- D.

  在//Two后面放一句super(10); 

9

单选(2分)

有以下代码：

‏`class Value {   int i; } public class Test {   public static void main(String[] argv) {     Integer v1 = 39;     Integer v2 = 39;     System.out.println(v1.equals(v2));   } }`



‏

以下哪句是正确的？

‏



‏

- A.

  由于第6、7行，赋值运算符两边的类型不一致而无法编译

- B.

  通过编译，打印出“true”

- C.

  通过编译，但是运行到第6行时出错，原因是类型不一致

- D.

  通过编译，打印出“false”

10

单选(2分)

‎试图编译和运行以下代码的结果是什么？D

‌`class Base {   private Base() { System.out.println(0);}   public Base(int i) {System.out.println(i);} } public class Test extends Base {   public Test() {super(1);};   public static void main(String argv[]){     Test t = new Test();   } }`

- A.

  编译通过，打印出1

- B.

  无法编译，因为构造器是private 的

- C.

  编译通过，打印出0

- D.

  无法编译，因为Test的父类的构造器是private的所以Test无法被构造出来

11

单选(2分)

‌试图编译和运行以下代码的结果是什么？

‏`class Base {   void f(int i) {System.out.println("int"); }   void f(double d) {System.out.println("double");} } public class Fin extends Base {   void f(String s) { System.out.println("String"); }   public static void main(String argv[]){     Fin a = new Fin();     a.f(10);   } }`

‌

‏

- A.

  无法编译，因为Fin里的f()和Base类的两个f()都无法构成override关系

- B.

  编译通过，打印出int

- C.

  无法编译，因为Fin里只有接受String的f()

- D.

  编译通过，打印出String

12

单选(2分)

‌有以下代码：

‎`public class Test {   String s;   static class Inner {     void testMethod() {       s = "Hello world.";     }   }   public static void main(String[] argv) {     Inner i = new Inner();     i.testMethod();     System.out.println(s);   } }`

‌以下哪句是正确的？

‎

- A.

  无法编译，因为Test类里的String s不是static的

- B.

  无法编译，因为Inner不能像这样在main中使用

- C.

  编译通过，打印出Hello world.

- D.

  编译通过，但是运行时刻出错，因为s没有被初始化

13

单选(2分)

‌有以下代码：

‍`interface I {   void setValue(int val);   int getValue(); }`

‌以下哪段代码能编译？

‍

‌

‍

- A.

  `class A extends I {   void increment(); }`

  

- B.

  `abstract class C implements I {   int value;   public void setValue(int val) { value = val; }   public int getValue() { return value; } }`

  

- C.

  `class A extends I {   int value;   void setValue(int val) { value = val; }   int getValue() { return value; } }`

- D.

  `interface A implements I {   void increment();   }`

14

单选(2分)

‏在以下代码中，下列哪句可以放在//Here处？

‍`class Base{   public Base(int i){} } public class MyOver extends Base{   public static void main(String arg[]){     MyOver m = new MyOver(10);   }   MyOver(int i){     super(i);   }   MyOver(String s, int i){     this(i);     //Here   } }`

‏

‍

- A.

  super(); 

- B.

  Base b = new Base(10);

- C.

  this("Hello",10);

- D.

  MyOver m = new MyOver();

15

单选(2分)

以下哪句正确描述了以下代码执行的情况？

```
public class FlowAp extends Frame{   public static void main(String argv[]){     FlowAp fa=new FlowAp();     fa.setSize(400,300);     fa.setVisible(true);   }   FlowAp(){     add(new Button("One"));     add(new Button("Two"));     add(new Button("Three"));     add(new Button("Four"));   }//End of constructor }//End of Application
```





- A.

  一个窗口，里面有四个按钮，依次标着One到Four，自顶向下依次排列

- B.

  运行时刻错误，说程序没有指定LayoutManager

- C.

  一个窗口，里面只有一个标着Four的按钮占据整个窗口

- D.

  一个窗口，里面有四个按钮，依次标着One到Four，放在窗口的四条边内

16

单选(2分)

‍有以下代码：

‏`void f(int port) {   return new Package(port) {     private int pt = port;     public getPort() { return pt; }   };   }`

‍以下哪句是正确的？

‏

- A.

  编译通过，但是运行到第3行出错

- B.

  因为第4行而编译失败

- C.

  正常编译和运行

- D.

  因为第2行而编译失败

17

单选(2分)

对于import java.util.Vector; 以下哪种说法是错误的？

‍

- A.

  Vector类放在java.util文件中

- B.

  Vector类属于java.util包

- C.

  Vector类是Java系统类库中的类

- D.

  Vector类放在..../java/util/目录下

18

单选(2分)

‍一个FirstClass.java文件如下：

‍`import java.*; public class FirstClass {} public interface Second {} abstract class SecondClass{}`

‍编译后会得到什么错误信息？

‍

‍

‍

- A.

  Class SecondClass may not be defined as abstract

- B.

  Public interface Second must be defined in a file called “Second.java”

- C.

  Package java not found in import

- D.

  没有错误

19

单选(2分)

‏有以下程序：

‌`class DataServer extends Server {   public String serverName;   public DataServer() {     serverName = “Customer Service”;     super(serverName);   } }`

‏以下论断哪句是正确的？

‌

- A.

  因为第五行的错误程序不能通过编译

- B.

  程序能通过编译

- C.

  因为第二行的错误程序不能通过编译

- D.

  程序能通过编译，但是试图制造DataServer类的对象时会出错

20

单选(2分)

‌有以下程序：

```
class TestServer {   public TestServer() { int users = 1; }   public void inc() { users++; }   public static void main(String[] args) {     TestServer ts = new TestServer();     ts.inc();     System.out.println(“Var users = “+ts.users);   } }
```

‌



- A.

  编译通过了，但是运行出错

- B.

  输出Var users = 2

- C.

  编译不能通过

- D.

  输出Var users = 1

21

判断(2分)

‎Java的char类型是8位的。



- A.
- B.

22

判断(2分)

‌protected的成员只能被子类成员存取

‎

- A.
- B.

23

判断(2分)

‎Java数组随时可以改变大小

‏

- A.
- B.

24

判断(2分)

在Java中，一个子类只能继承一个父类



- A.
- B.

25

判断(2分)

‍接口的本质就是完全抽象的类

‎

- A.
- B.

26

填空(4分)

‎写出以下程序的运行结果：

‍`public class Test {   public int t=4;   public static void main(String[] args) {     new Test().NumberPlay();   }   public void NumberPlay() {     int t=2;     t = t+5;     this.t = this.t-2;     t = t-this.t;     System.out.println(t+this.t+”ok”);   } }`

‎

‍

请输入答案

27

填空(4分)

写出以下标出行号的语句的执行顺序：

‍

‍`class A {   static int i = 0;//1   float f = 1.0;//2   A() {     str = “Hello”;//3   } } public class B extends A {   static int j=3;//4   bool isHi = true;//5   B(bool hi) {     isHi = hi;//6   }   public static void main(String[] args) {     B bb = new B(false);   } }`

‍

请连续书写数字，中间不留任何符号，如123456

‍

‍

‍

请输入答案

28

填空(4分)

写出程序运行结果：

```
class Letter {   char c; } public class PassObject {   static void f(Letter y) {     y.c = 'z';   }   public static void main(String[] args) {     Letter x = new Letter();     x.c = 'a';     f(x);     System.out.println(x.c);   } }
```





请输入答案

29

填空(4分)

‍写出程序运行结果：

‍`public class Equivalence {   public static void main(String[] args) {     Integer n1 = new Integer(47);     Integer n2 = new Integer(47);     System.out.println(n1 == n2);   } }`

‍

‍

请输入答案

30

填空(4分)

假设已编写好了类Class1: 



package Testpackage; 



public class Class1{ 



… … 



}



它存在于Class1.java 文件中。



现在main 方法所在的源程序MainPro.java 如 下： 



  import Testpackage;



  … …



  设Windows操作系统中的CLASSPATH 环境变量已被设成"."，而main方法所在的源程序MainPro.java 存在目录c:\Testdir 中，且当前工作目录为c:\Testdir， 那么Class1.class文件应存放在那个目录中呢？请从盘符开始书写目录名称。