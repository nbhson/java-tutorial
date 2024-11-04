# Java Polymorphism

> Polymorphism là khả năng của một đối tượng có thể có nhiều hình dạng. Đa hình là một tính năng quan trọng của khái niệm Java OOP và nó cho phép chúng ta thực hiện nhiều thao tác bằng cách sử dụng tên duy nhất của bất kỳ phương thức nào (interface).

## Use of Polymorphism in Java

Ứng dụng phổ biến nhất của đa hình trong OOP là khi tham chiếu lớp cha được sử dụng để tham chiếu đến đối tượng lớp con.

## Java Polymorphism Example

```java
public interface Vegetarian{}
public class Animal{}
public class Deer extends Animal implements Vegetarian{}
```

Now, the Deer class is considered to be polymorphic since this has multiple inheritance. Following are true for the above examples −

- A Deer IS-A Animal
- A Deer IS-A Vegetarian
- A Deer IS-A Deer
- A Deer IS-A Object

Khi chúng ta áp dụng biến tham chiếu facts vào tham chiếu đối tượng Deer, các khai báo sau đây là hợp lệ −

```java
Deer d = new Deer();
Animal a = d;
Vegetarian v = d;
Object o = d;
```

Tất cả các biến tham chiếu d, a, v, o đều tham chiếu đến cùng một đối tượng Deer trong heap.

## Java Polymorphism Implementation

```java
interface Vegetarian{}
class Animal{}
public class Deer extends Animal implements Vegetarian{
	public static void main(String[] args) {
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
		Object o = d;
		
		System.out.println(d instanceof Deer); // true
		System.out.println(a instanceof Deer); // true
		System.out.println(v instanceof Deer); // true
		System.out.println(o instanceof Deer); // true
	}	
}
```

## Types of Java Polymorphism

- Compile Time Polymorphism (đa hình thời gian biên dịch)
- Run Time Polymorphism (đa hình thời gian chạy)

### Compile Time Polymorphism in Java

Đa hình thời gian biên dịch còn được gọi là `static Polymorphism` và được triển khai bằng cách `overloading method`.

Example: Compile Time Polymorphism

```java
// Java Example: Compile Time Polymorphism
public class Main {
  // method to add two integers
  public int addition(int x, int y) {
    return x + y;
  }

  // method to add three integers
  public int addition(int x, int y, int z) {
    return x + y + z;
  }

  // method to add two doubles
  public double addition(double x, double y) {
    return x + y;
  }

  // Main method
  public static void main(String[] args) {
    // Creating an object of the Main method
    Main number = new Main();

    // calling the overloaded methods
    int res1 = number.addition(444, 555);
    System.out.println("Addition of two integers: " + res1);
    // Addition of two integers: 999

    int res2 = number.addition(333, 444, 555);
    System.out.println("Addition of three integers: " + res2);
    // Addition of three integers: 1332

    double res3 = number.addition(10.15, 20.22);
    System.out.println("Addition of two doubles: " + res3);
    // Addition of two doubles: 30.369999999999997
  }
}
```

> This example has multiple methods having the same name to achieve the concept of compile-time polymorphism in Java.

### Run Time Polymorphism in Java

Đa hình thời gian chạy còn được gọi là phân phối phương thức động và được triển khai bằng cách `method overriding`

```java
// Java Example: Run Time Polymorphism
class Vehicle {
  public void displayInfo() {
    System.out.println("Some vehicles are there.");
  }
}

class Car extends Vehicle {
  // Method overriding
  @Override
  public void displayInfo() {
    System.out.println("I have a Car.");
  }
}

class Bike extends Vehicle {
  // Method overriding
  @Override
  public void displayInfo() {
    System.out.println("I have a Bike.");
  }
}

public class Main {
  public static void main(String[] args) {
    Vehicle v1 = new Car(); // Upcasting
    Vehicle v2 = new Bike(); // Upcasting

    // Calling the overridden displayInfo() method of Car class
    v1.displayInfo(); // I have a Car.

    // Calling the overridden displayInfo() method of Bike class
    v2.displayInfo(); // I have a Bike.
  }
}
```

## Virtual Method and Run Time Polymorphism in Java

- Trong phần này, tôi sẽ chỉ cho bạn cách hành vi của các phương thức ghi đè trong Java cho phép bạn tận dụng tính đa hình khi thiết kế các lớp của mình.
- We already have discussed method overriding, where a child class can override a method in its parent. An overridden method is essentially hidden in the parent class, and is not invoked unless the child class uses the super keyword within the overriding method.

Example: Implementation of Run Time Polymorphism with Virtual Methods

```java
/* File name : Employee.java */
public class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }

   public void mailCheck() {
      System.out.println("Mailing a check to " + this.name + " " + this.address);
   }

   public String toString() {
      return name + " " + address + " " + number;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String newAddress) {
      address = newAddress;
   }

   public int getNumber() {
      return number;
   }
}
```

Bây giờ giả sử chúng ta mở rộng lớp Employee như sau −

```java
/* File name : Salary.java */
public class Salary extends Employee {
   private double salary; // Annual salary
   
   public Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      setSalary(salary);
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName()
      + " with salary " + salary);
   }
   
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double newSalary) {
      if(newSalary >= 0.0) {
         salary = newSalary;
      }
   }
   
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}
```

Now, you study the following program carefully and try to determine its output −

```java
/* File name : VirtualDemo.java */
public class VirtualDemo {

   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      System.out.println("Call mailCheck using Salary reference --");   
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}

class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }

   public void mailCheck() {
      System.out.println("Mailing a check to " + this.name + " " + this.address);
   }

   public String toString() {
      return name + " " + address + " " + number;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String newAddress) {
      address = newAddress;
   }

   public int getNumber() {
      return number;
   }
}

class Salary extends Employee {
   private double salary; // Annual salary
   
   public Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      setSalary(salary);
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName()
      + " with salary " + salary);
   }
   
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double newSalary) {
      if(newSalary >= 0.0) {
         salary = newSalary;
      }
   }
   
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}
```