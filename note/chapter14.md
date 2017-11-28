# 第14章 类型信息
运行时类型信息 Run-Time Type Information  
RTTI  
1. 传统的，假定我们在编译时已经知道了所有的类型  
2. “反射”，允许我们在运行时发现和使用类的信息 
## 14.1 为什么需要RTTI
在运行时，识别一个对象的类型  
## 14.2 Class对象
Class对象：包含了与类有关的信息  
每个类都有一个Class对象 .class文件  
类加载器  
只要你想在运行时使用类型信息，就必须首先获得对恰当的Class对象的引用。Class.forName()就是实现此功能的便捷途径，因为你不需要为了获得Class引用而持有该类型的对象。但是，若你已经拥有了一个感兴趣的类型的对象，可以通过调用getClass()方发来获取Class引用，这个方法属于根类Object的一部分，它将返回表示该对象的实际类型的Class引用  
## 14.3 类型转换前先做检查
instanceof
## 14.4 注册工厂
## 14.5 instanceof与Class的等价性
## 14.6 反射：运行时的类信息
Class类和java.lang.reflect类库一起对反射的概念进行了支持，该类库包含了Field、Method以及Constructor类  
## 14.7 动态
