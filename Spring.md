# Spring
需要的jar
编写配置文件
Spring IOC容器：创建对象，给对象的属性赋值
IOC（控制反转）也可以称为DI（依赖注入）
｜ 控制反转：将创建对象、属性值的方式进行了反转，从new、setXxx()反转为了从SpringIOC容器GetBean()
｜ ​依赖注入：将属性值注入给了属性，将属性注入给了Bean，将bean注入给了IOC容器
｜ 
DI：依赖注入
    0
     底层是通过反射实现的
    依赖注入的三种方式：
    ｜ 1、set注入：通过setXxx()赋值
    ｜ 2、构造器注入：通过构造方法赋值
    ｜ 3、P命名空间：引入P命名空间
    注入各种集合数据类型：List、Set Map、properties
    value与<value>注入方式的区别
    赋值
    在ioc中定义bean的前提: 该bean的类必须提供了无参构造
    自动装配（ref类型）
     使用注解定义bean: 通过注解的形式将bean以及相应的属性值放入ioc容器
    ｜ @Component
    ｜ ​配置扫描器
    ｜ ​
使用注解实现事务（声明式事务）
    1.jar包
    2.配置
    ｜ 配置数据库相关
    ｜ ​
    ｜ 增加对事务的支持
    ｜ ​
    ｜ 配置事务管理器
    ｜ ​
     3.使用
    ｜ 将需要称为事务的方法前增加注解
    Transactional注解的属性
AOP：面向切面编程
    切入点：每次执行后自动执行
    通知
    前置通知实现步骤：
    ｜ 1.jar包
    ｜ 
    ｜ 2.配置
    ｜ 
    ｜ 3.编写
    ｜ AOP：每当执行某个方法之前，自动执行一个方法 
    ｜ addStudent()：业务方法（ IStudentService. java中的 addStudent ()
    ｜ before()：自动执行的通知，即aop前置通知
    ｜ ​
    后置通知和异常通知

