# this 

## this Keyword in Java Class Methods

`this` is a keyword in Java which is used as a reference to the object of the current class, with in an instance method or a constructor. Using `this` you can refer the members of a class such as constructors, variables and methods.

> Note − The keyword this is used only within instance methods or constructors

In general, the keyword this is used to:
- Phân biệt các biến thể hiện với các biến cục bộ nếu chúng có cùng tên, trong một hàm tạo hoặc một phương thức.

```java
class Student {
   int age;   
   Student(int age) {
      this.age = age;	
   }
}
```
- Gọi một kiểu constructor (constructor có tham số hoặc default) from other in a class. Nó được gọi là lệnh gọi constructor rõ ràng.
```java
class Student {
   int age
   Student() {
      this(20);
   }
   
   Student(int age) {
      this.age = age;	
   }
}
```

Example: Using this Keyword in Java Class Methods

```java
package com.tutorialspoint;

public class Tester {
   // Instance variable num
   int num = 10;
	
   Tester() {
      System.out.println("This is an example program on keyword this");	
   }

   Tester(int num) {
      // Invoking the default constructor
      this();
      
      // Assigning the local variable num to the instance variable num
      this.num = num;	   
   }
   
   public void greet() {
      System.out.println("Hi Welcome to Tutorialspoint");
   }
      
   public void print() {
      // Local variable num
      int num = 20;
      
      // Printing the local variable
      System.out.println("value of local variable num is : "+num);
      
      // Printing the instance variable
      System.out.println("value of instance variable num is : "+this.num);
      
      // Invoking the greet method of a class
      this.greet();     
   }
   
   public static void main(String[] args) {
      // Instantiating the class
      Tester obj1 = new Tester();
      
      // Invoking the print method
      obj1.print();
	  
      // Passing a new value to the num variable through parametrized constructor
      Tester obj2 = new Tester(30);
      
      // Invoking the print method again
      obj2.print(); 
   }
}
```