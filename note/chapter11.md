#<center>  第11章 持有对象
Collection 容器类（集合类），用于保存对象  
List、Set、Queue、Map  
## 11.1 泛型和类型安全的容器
向上转型也可以作用于泛型  
## 11.2 基本概念
Java容器类的用途是“保存对象”（实际为对象的引用）  
1）Collection。一个独立元素的序列，这些元素都服从一条或多条规则。List必须按照插入的顺序保存元素，Set不能有重复元素，Queue按照排队规则来确定对象产生的顺序  
2）Map。一组成对的“键值对”对象，允许你使用键来查找值。
## 11.3 添加一组元素
## 11.4 容器的打印
Collection在每个槽中只能保存一个元素，List：以特定的顺序保存一组元素；Set：元素不能重复；Queue：只允许在容器的一端插入对象，并从另一端移除对象；Map在每个槽保存了两个对象（键和值）  
## 11.5 List
ArraryList：长于随机访问元素，但是在List的中间插入和移除元素时较慢  
LinkedList：优化的顺序访问，随机访问较慢  
## 11.6 迭代器
迭代器是一个对象，它的工作是遍历并选择序列中的对象  
```Iterator<Integer> it = list.iterator();```   
## 11.7 LinkedList
LinkedList在List中间插入和移除比ArrayList高效，随机访问差点  
LinkedList添加了使其用作栈、队列和双端队列的方法  
## 11.8 Stack
栈 后进先出 LIFO   
LinkedList具有能够直接实现栈的所有功能的方法，它可以直接当做栈使用  
```
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<>();  
	public void push(T v) {storage.addFirst(v);}
	public T peek(){return storage.getFirst();}
	public void pop() {return storage.removeFirst();}
	public boolean empty() {return storage.isEmpty();}
}```  
## 11.9 Set 
Set不保存重复的元素  
Set具有和Collection完全一样的接口，Set是基于对象的值来确定归属性的  
TreeSet 排序的  
## 11.10 Map
Map可以返回它的键的set，它的值的Collection，或者它的键值对的set  
## 11.11 Queue
队列 FIFO 先进先出  
队列在并发编程中特别重要  
LinkedList提供了方法以支持队列的行为，并且它实现了Queue的接口  
PriorityQueue  
## 11.12 Collection和Iterator
Collection是描述所有序列容器的共性的根接口
## 11.13 Foreach和迭代器
## 11.14 总结
Java提供了大量持有对象的方式：  
1）数组将数字与对象联系起来。它保存类型明确的对象，在查询对象时，不需要对结果做类型转换。它可以是多维的，可以保存基本类型的数据。但是，数组一旦生成，其容量就不能改变  
2）Collection保存单一的元素，而Map保存相关联的键值对。有了Java泛型，你就可以指定容器中存放的对象类型，因此就不会讲错误类型的对象放置到容器中，并且在从容器中获取元素时不必进行类型转换。各种Collection和各种Map都可以自动调整其尺寸。容器不能持有基本类型，但是自动包装机制会执行基本类型到容器中所持有的包装器类型之间的双向转换  
3）List也建立数字索引与对象的关联，数组和List都是排好序的容器。List可以自动扩容  
4）如果要进行大量的随机访问，就要ArrayList；若要经常从表中间插入或删除元素，使用LinkedList  
5）各种Queue和Stack的行为，由LinkedList提供  
6）Map是一种将对象（而非数字）与对象相关联的设计。HashMap设计用来快速访问；而TreeMap保持“键”始终处于排序状态，所以没有HashMap快。LinkedHashMap保持元素插入的顺序，但是也通过散列提供了快速访问能力  
7）Set不接受重复元素。HsahSet提供最快的查询速度，TreeSet保持元素处于排序状态。LinkedHashSet以插入顺序保存元素  
8）新程序不应该使用过时的Vector、Hashtable和Stack
9）Map、List、Set、Queue
