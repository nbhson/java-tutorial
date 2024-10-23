# Class Methods

## Java Class Methods

Class Methods là phương thức được khai báo trong một lớp. Chúng thực hiện các hoạt động cụ thể và có thể truy cập, sửa đổi các thuộc tính lớp.

## Creating (Declaring) Java Class Methods

- Class methods declaration is similar to the user-defined methods declaration except that class methods are declared within a class.
- Các phương thức lớp được khai báo bằng cách chỉ định access modifier, followed by the return type, method_name, and parameters list.

Syntax:

- `modifier` − It defines the access type of the method and it is optional to use.
- `returnType` − The returns data type of the class method.
- `nameOfMethod` − This is the method name. The method signature consists of the method name and the parameter list.
- `Parameter` List − The list of parameters, it is the type, order, and number of parameters of a method. These are optional, method may contain zero parameters.
- `method` body − The method body defines what the method does with the statements.

```java
public class class_name {
  modifier returnType nameOfMethod(Parameter List) {
    // method body
  }
}

// 
class Util {
  public int minimum(int n1, int n2) {
    int min;
    if (n1 > n2)
      min = n2;
    else
      min = n1;

    return min;
  }
}
```

## Accessing Java Class Methods

- To access a class method (public class method), you need to create an object first, then by using the object you can access the class method (with the help of dot (.) operator).

Syntax

```java
object_name.method_name([parameters]);
```

Example

```java
package com.tutorialspoint;

class Util {
   public int minimum(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
}
public class Tester {
   
   public static void main(String[] args) {
      int a = 11;
      int b = 6;

      Util util = new Util();
	  
      int c = util.minimum(a, b);
      System.out.println("Minimum Value = " + c);
   }
}
```

