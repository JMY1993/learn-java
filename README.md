# learn-java
java学习的笔记和相关代码

#Tips

## 如何设置或更改 PATH 系统变量？
打开.bash_profile
添加：
```bash
export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0`
export PATH=$JAVA_HOME/bin:$PATH
export CLASS_PATH=$JAVA_HOME/lib
```
然后`source .bash_profile`即可

其它方式：
https://www.java.com/zh-CN/download/help/path.html

另一种方式：
https://blog.csdn.net/meifannao789456/article/details/87447489
