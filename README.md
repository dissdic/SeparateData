# 工程简介

# 延伸阅读

# 例子

## 分表

### 水平分表

#### **rule**
* tableName = user
* subTables = user_1,user_2
* luaExpression = user_(${id}%2+1)
#### **sql**

>select * from user

_解析结果_

> select * from user_1,select * from user_2
----
>select * from user where id = 2

_解析结果_

> select * from user_1
----
> select * from user where name = 2

_解析结果_

> select * from user_1 where name = 2,select * from user_2 where name = 2
----


