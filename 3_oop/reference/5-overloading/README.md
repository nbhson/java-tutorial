# Overloading

## Java Method Overloading

Khi một lớp có hai hoặc nhiều phương thức cùng tên nhưng tham số khác nhau (kiểu dữ liệu khác nhau), tại thời điểm gọi dựa trên các tham số được truyền, phương thức tương ứng sẽ được gọi. Cơ chế này gọi là Overloading method

## Advantage of Method Overloading

- Method Overloading cải thiện khả năng đọc mã và giảm sự dư thừa mã. 
- Method Overloading cũng giúp đạt được đa hình thời gian biên dịch.

## Example of Method Overloading

Here we have created a class named Tester this class has two methods with same name (add) and return type, the only difference is the parameters they accept (one method accepts two integer variables and other accepts three integer variables).

```java
class Calculator{
   public static int add(int a, int b){
      return a + b;
   }
   public static int add(int a, int b, int c){
      return a + b + c;
   }
}
```

When you invoke the add() method based on the parameters you pass respective method body gets executed.

```java
int result = Calculator.add(1,2);  // returns 3;
result = Calculator.add(1,2,3);    // returns 6;
```

## Different Ways of Java Method Overloading

Method overloading can be achieved using following ways while having same name methods in a class.

> Use different number of arguments
> Use different type of arguments

## Invalid Ways of Java Method Overloading

Method overloading cannot be achieved using following ways while having same name methods in a class. Compiler will complain of duplicate method presence.

> Using different return type

```java
public static int add(int a, int b) {
  return a + b;
}

// error: duplicate method
public static double add(int a, int b) {
  return a + b;
}
```

> Using static and non-static methods (return void)

```java
class Example {
    static void method(int a) {
        // Phương thức static
        System.out.println("Static method: " + a);
    }

    // Invalid overload: cùng tên và cùng tham số
    void method(int a) {
        // Phương thức non-static
        System.out.println("Non-static method: " + a);
    }
}
```

## Example

### Method Overloading: Different Number of Arguments

You can implement method overloading based on the different number of arguments.

#### Different Number of Arguments (Static Methods)
 
```java
package com.tutorialspoint;

class Calculator{
   public static int add(int a, int b){
      return a + b;
   }
   public static int add(int a, int b, int c){
      return a + b + c;
   }
}

public class Tester {
   public static void main(String args[]){
      System.out.println(Calculator.add(20, 40));
      System.out.println(Calculator.add(40, 50, 60));
   }
}
```

#### Different Number of Arguments (Non Static Methods)
```java
package com.tutorialspoint;

class Calculator{
   public int add(int a, int b){
      return a + b;
   }
   public int add(int a, int b, int c){
      return a + b + c;
   }
}

public class Tester {
   public static void main(String args[]){
      Calculator calculator = new Calculator();   
      System.out.println(calculator.add(20, 40));
      System.out.println(calculator.add(40, 50, 60));
   }
}
```

### Method Overloading: Different Type of Arguments

#### Different Type of Arguments

```java
package com.tutorialspoint;

class Calculator{
   public int add(int a, int b){
      return a + b;
   }
   public double add(double a, double b){
      return a + b;
   }
}

public class Tester {
   public static void main(String args[]){
      Calculator calculator = new Calculator();   
      System.out.println(calculator.add(20, 40));
      System.out.println(calculator.add(20.0, 40.0));
   }
}
```