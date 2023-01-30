# 工程简介

# 延伸阅读

## 分表

### 水平分表

#### 概念
>一张表变成多张表，多张表字段一致，以某些字段以某个规则将数据分摊到多张表

#### **rule**
* tableName = user
* subTables = user_1,user_2
* luaExpression = user_(${id}%2+1)
#### **sql**

>select * from user

_解析结果_

* 1.select * from user_1
* 2.select * from user_2
----
>select * from user where id = 2

_解析结果_

* select * from user_1
----
> select * from user where name = 2

_解析结果_

* select * from user_1 where name = 2
* select * from user_2 where name = 2
----
> select * from user where id in (1,3,5,7,9)

_解析结果_

* select * from user_2 where id in (1,3,5,7,9)

**总结**

- 水平分表下，查询的字段可以不考虑，因为多张表字段是一致的，需要考虑的条件字段
- 当条件字段指定了值，那么可以迅速定位到哪张表。没有指定那么只能每张表都查一遍
### 垂直分表
#### 概念
>将一张表内的冷门使用或热点使用字段拆分出去，用单独的表在存储，并以某个字段与主表的ID关联

####**Rule**
* tableName = user
* mainTable = user
* subTablesAndCols = {"user_1",["age","height"],"user_2",["personality","weight"]}
* relateKeyMap = {"user_1","userId","user_2","userId"}
* relateKey = "userId"
####**SQL**
> select * from user

__解析结果__

1. select * from user_1
1. select * from user_2
----
> select age from user

_解析结果_

1.select age from user_1 

----
>select * from user where height='180cm'

_解析结果_

>select * from user a
>inner join user_1 b on b.user_id = a.id 
>inner join user_2 c on c.user_id = a.id
>where a.height = '180cm'

----

> select weight from user where height = '180cm'

_解析结果_

>select * from user_2 a
>inner join user_1 b on a.user_id = b.user_id
>where b.height = '180cm'

**总结**
- 垂直分表下，查询字段和条件字段都需要考虑在内
- 需要用关联查询获取需要的查询字段值
## 分表
*postgresql需要dblink或者Foreign Table才可以跨库查询，具体参阅[dblink](http://www.postgres.cn/docs/12/dblink.html) 和 [postgres-fdw](http://www.postgres.cn/docs/12/postgres-fdw.html)*
### 水平分库

#### 概念
>将同一张表的数据按照某种规则分到不同的库里面，表名一致，字段一致

#### **Rule**
* mode = 1
* mainDataBase = db
* subDataBasesAndTables = {"db1":["table1","table2"],"db2":["table3","table4"]}
#### **SQL**
>select * from table1

_解析结果_
* 切换当前库到db1
* select * from table1
* 切换当前库到db







