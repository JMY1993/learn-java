## 如何设置或更改Java相关系统变量？

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

---

## 修改git remote为ssh（而非https）

因为网络问题，github的https协议连接无法push，会报错443。并且github在22年起不支持用户名密码登陆，所以配置ssh证书后改为ssh连接

```bash
# 首先清除原来的https连接
git remote remove origin
# 然后添加新的ssh连接
git remote add origin git@github.com:JMY1993/learn-java.git
# 然后push
git push
# 新项目要先-u
git push -u origin main
```

另外受政治正确影响，原来的master分支改为了main分支