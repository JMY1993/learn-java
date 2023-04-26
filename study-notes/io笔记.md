### 两个基本IO类型：

InputStream -> 最小单位byte

OutputStream -> 最小单位byte

Reader -> 最小单位char

Writer -> 最小单位char

因为内存有“易失性”的特点，所以必须把处理后的数据以某种方式输出，例如，写入到文件。Output实际上就是把Java表示的数据格式，例如，`byte[]`，`String`等输出到某个地方。

`Reader`和`Writer`本质上是一个能自动编解码的`InputStream`和`OutputStream`。

### java.io提供的File对象

构造一个`File`对象，即使传入的文件或目录不存在，代码也不会出错，因为构造一个`File`对象，并不会导致任何磁盘操作。只有当我们调用`File`对象的某些方法的时候，才真正进行磁盘操作。

### 关闭流

InputStream和OutputSteam都是通过close方法关闭流的

outputstream需要flush

如果读取过程中发生了IO错误，就没有办法正确的关闭，造成资源没法及时释放。

在计算机中，类似文件、网络端口这些资源，都是由操作系统统一管理的。应用程序在运行的过程中，如果打开了一个文件进行读写，完成后要及时地关闭，以便让操作系统把资源释放掉，否则，应用程序占用的资源会越来越多，不但白白占用内存，还会影响其他应用程序的运行。#todo 什么叫打开？是new了io流对象就算打开还是说使用了方法才算打开？

#### try(resource = ... )语法

只要实现了java.lang.AutoCloseable接口的对象，就可以使用try(resource)写法，会自动加上finally语句并调用close()方法。

无论输入输出都可以

同时操作多个`AutoCloseable`资源时，在`try(resource) { ... }`语句中可以同时写出多个资源，用`;`隔开。例如，同时读写两个文件：

```java
// 读取input.txt，写入output.txt:
try (InputStream input = new FileInputStream("input.txt");
     OutputStream output = new FileOutputStream("output.txt"))
{
    input.transferTo(output); // transferTo的作用是?
}
```

### 装饰者Decorator模式 / Filter模式

通过一个“基础”组件再叠加各种“附加”功能组件的模式，称之为Filter模式（或者装饰器模式：Decorator）。它可以让我们通过少量的类来实现各种功能的组合

### Class对象的getResourceAsStream(name)方法

public InputStream getResourceAsStream(String name)

可能会返回null值，注意判空。

### 廖雪峰教程中涉及到的IO类

#### InputStream、OutputStream数据来源

FileInputStream / FileOutputStream

ServletInputStream

Socket.getInputStream()

#### InputStream、OutputStream包装类

BufferedInputStream / BufferedOutputStream

DataInputStream / DataOutputStream #todo 这是啥

ZipInputStream / ZipOutputStream

JarInputStream / JarOutputStream

ObjectInputStream/ObjectOutputStream

PrintStream 不会抛出IOException

* 可以编写自己的Filter，只要extends FilterInputStream

#### Reader、Writer字节数据流类、转换类

FileReader / FileWriter 需要指定编码StandardCharsets.UTF_8

InputStreamReader / OutputStreamReader 需要指定编码

#### 内存流类

ByteArrayInputStream / ByteArrayOutputStream 

CharArrayReader / CharArrayWriter

StringReader / StringWriter

#### File对象、Path对象

用来拿文件名、信息

File和Path对象可以转换

### Files工具类

Files.readAllBytes(Path)

Files.readString(Path, StandardCharsets)

List<String> Files.readAllLines(Path)

Files.write(Path, byte[])

Files.writeString(Path, String, StandardCharsets)

Files.write(Path, List<String>)

此外，`Files`工具类还有`copy()`、`delete()`、`exists()`、`move()`等快捷方法操作文件和目录。

特别注意的是，`Files`提供的读写方法，受内存限制，只能读写小文件，例如配置文件等，不可一次读入几个G的大文件。读写大型文件仍然要使用文件流，每次只读写一部分文件内容。
