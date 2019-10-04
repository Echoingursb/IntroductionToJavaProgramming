# 第19章 泛型

## 1.  图a和图b有编译错误吗？

![](https://raw.githubusercontent.com/Echoingursb/IntroductionToJavaProgramming/master/chapter19/src/echo/practice/19.1.png)

图a没有编译错误，图b有编译错误，因为`dates`的泛型为`Date`，所以只能存放`Date`类型不能存放`String`类型。

## 2. 图a中有什么错误？图b中的代码正确吗？

![](https://raw.githubusercontent.com/Echoingursb/IntroductionToJavaProgramming/master/chapter19/src/echo/practice/19.2.png)

图a有错误，需要强制转换成`Date`类型，图b正确。

## 3. 使用泛型类型的优势是什么？

使用泛型的主要优点是能够在编译时而不是在运行时检测出错误。

## 4. Java API中，java.lang.Comparable的泛型定义是什么？

public interface Comparable<T> {}

## 5. 既然使用new ArrayList<String>()创建了字符串的ArrayList的一个实例，那么应该将ArrayList类的构造方法定义为如下所示吗？

`public ArrayList<E>()`

不对，正确的定义是`public ArrayList()`

## 6. 泛型类可以拥有多个泛型参数吗？

可以，在这种情况下，应将所有参数一起放在尖括号中，并用逗号隔开，比如`<E1, E2, E3>`

## 7. 在类中如何声明一个泛型类型？

例如`public class ArrayList<E> {}`

## 8. 如何声明一个泛型方法？如何调用一个泛型方法？

为了声明泛型方法，要将泛型类型放在方法返回类型之前，例如`<E> void max (E O1, E o2)`

为了调用泛型方法，需要将实际类型放在尖括号内作为方法名的前缀，也可以省略。

## 9. 什么是受限泛型类型？

将泛型类型指定为另外一种类型的子类型，这样的泛型类型称为受限泛型类型。


