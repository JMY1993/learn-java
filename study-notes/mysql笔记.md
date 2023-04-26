### 分页排序重复

现象描述：

项目在做分页查询的时候，用到了排序 order by ctime，由于是测试环境，ctime时间值都是一样的。在通过mybatis分页查询的时候，发现最后一页数据和第一页数据重复。后来就拿出sql进行测试，发现偶尔是重复的。

1.解决方案

增加一个二级排序【比如：主键，时间戳】，总之实现绝对排序即可

order ctime,id 即可。

2.原理

（1）mysql查询不指定排序规则时，会默认按照ID进行排序。

（2）一旦指定排序值，则按照排序值进行排序，排序值相同的记录，顺序则是随机的。

（3）在进行分页查询时，如果不进行绝对排序，则会出现分页中各页记录重复的现象。

（4）绝对排序：这是个自创概念，指按照指定排序规则排序后，记录顺序唯一。
————————————————
版权声明：本文为CSDN博主「li_zehao」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/QQ994406030/article/details/81079607

参考廖雪峰教程链接：https://www.liaoxuefeng.com/wiki/1177760294764384/1217864791925600#0

作者：香思人
链接：https://zhuanlan.zhihu.com/p/448727734
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

### where与having的区别

1.where是数据从磁盘读入内存的时候进行判断， 而having是磁盘读入内存后再判断。

像上面截图这种使用where的情况，就是先从磁盘读取数据如果数据的email = '0177@gmx.de'，那么这条数据就放人内存中，如果email不等于0177@gmx.de那么就直接忽略这条数据。

上面截图使用having的情况，数据库就会先将所有的数据先读入内存，然后才会在内存中判断条件是否符合，不符合条件的数据会被删除。

2.where不可以使用字段的别名，但是having可以。

 因为where是先判断数据是否符合条件，符合条件的数据再入内存中然后生成别名，所以别名是where判断条件后才生成的，这 也是where不能使用别名的原因。

having是先从磁盘中读取数据到内存中，然后才进行判断，这个时候别名已经生成了，所以having可以使用别名。

3.having能够使用聚合函数当做条件，但是where不能使用，where只能使用存在的列当做条件。

原因与区别二一样。

总结，能用where就用where,使用where比用having效率要高很多，这里有一个误区：就是不要错误的认为having和group by 必须配合使用

### 子查询

可以将子查询看作是一个字段或者一个临时表。

![img](/Users/jmy/Documents/learn-CS/learn-java/study-notes/pics/v2-697489436b948ce8de2cd91001675182_b.jpg)1.三种子查询对比

![img](/Users/jmy/Documents/learn-CS/learn-java/study-notes/pics/v2-efb349f450c0b9e323de8454f7c681b5_b.jpg)2.select之后的子查询使用

![img](/Users/jmy/Documents/learn-CS/learn-java/study-notes/pics/v2-4d1f4dc179b4e3ae70c127d378e1994e_b.jpg)3.from之后的子查询使用

![img](/Users/jmy/Documents/learn-CS/learn-java/study-notes/pics/v2-2bc969390187adbeae83d6811c749725_b.jpg)4.where之后的子查询使用

### count(*)的一个问题

看下面的代码

```mysql
SELECT c.cust_name, c.cust_id,
			 COUNT(o.order_num) AS num_ord
FROM customers AS c LEFT JOIN orders AS o
	ON c.cust_id = o.cust_id
GROUP BY c.cust_id;

SELECT c.cust_name, c.cust_id,
			 COUNT(*) AS num_ord
FROM customers AS c LEFT JOIN orders AS o
	ON c.cust_id = o.cust_id
GROUP BY c.cust_id;
```

result 1:

```ascii
+----------------+---------+---------+
| cust_name      | cust_id | num_ord |
+----------------+---------+---------+
| Coyote Inc.    |   10001 |       2 |
| Mouse House    |   10002 |       0 |
| Wascals        |   10003 |       1 |
| Yosemite Place |   10004 |       1 |
| E Fudd         |   10005 |       1 |
| J Jesse M Y    |   10006 |       1 |
+----------------+---------+---------+
```

result 2:

```ascii
+----------------+---------+---------+
| cust_name      | cust_id | num_ord |
+----------------+---------+---------+
| Coyote Inc.    |   10001 |       2 |
| Mouse House    |   10002 |       1 |
| Wascals        |   10003 |       1 |
| Yosemite Place |   10004 |       1 |
| E Fudd         |   10005 |       1 |
| J Jesse M Y    |   10006 |       1 |
+----------------+---------+---------+
```

这里Mouse House没有下订单，如果用count(*)统计连结的表格的话，属于customer的字段是有值的，属于order的字段是没有值的，这样会都被统计进去。为了正确表示出Mouse House的订单数，必须选取一列属于order的字段进行count。

### 如果别名是函数名，会有错误

```mysql
SELECT note_text,
MATCH(note_text) against('rabbit') as 'rank' #这里如果直接打上rank，会报错。因为rank()是mysql本身的函数
FROM productnotes
```

