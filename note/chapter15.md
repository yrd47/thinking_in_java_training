# 第15章 泛型
## 15.1 与C++比较
## 15.2 简单泛型
***容器类***  
泛型的主要目的是用来指定容器要持有什么类型的对象，而且由编译器来保证类型的正确性  
类型参数，用尖括号括住，放在类名的后面，然后在使用这个类的时候用实际的类型替换此类型参数  
## 15.3 泛型接口
## 15.4 泛型方法
要定义泛型方法，只需将泛型参数置于列表返回值之前  
```public <T> void f(T x){}```  