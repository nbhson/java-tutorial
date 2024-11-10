# Abstraction

> Trừu tượng là việc xử lý các ý tưởng hơn là các sự kiện. 

Ví dụ, khi bạn xem xét trường hợp của e-mail, các chi tiết phức tạp như những gì xảy ra ngay khi bạn gửi e-mail, **giao thức mà máy chủ e-mail của bạn sử dụng được ẩn khỏi người dùng.** Do đó, để gửi e-mail, bạn chỉ cần nhập nội dung, đề cập đến địa chỉ của người nhận và nhấp vào gửi.

## Java Abstraction

`Abstraction` là quá trình ẩn các chi tiết triển khai khỏi người dùng, chỉ cung cấp chức năng cho người dùng. Nói cách khác, người dùng sẽ có thông tin về những gì đối tượng thực hiện thay vì cách thức thực hiện. Trong lập trình Java,  abstraction is achieved using `Abstract classes` and `interfaces.`

## Java Abstract Classes

- Các lớp trừu tượng Java có thể chứa hoặc không chứa các phương thức trừu tượng, tức là các phương thức không có phần thân (public void get(); )
- Tuy nhiên, nếu một lớp có ít nhất một phương thức trừu tượng thì lớp đó **phải được khai báo là trừu tượng.**
- Nếu một lớp được khai báo là abstract, thì nó không thể được khởi tạo.
- Để sử dụng một abstract class, bạn phải kế thừa nó từ một lớp khác, cung cấp các implementations cho các phương thức trừu tượng trong đó.
- Nếu bạn kế thừa một lớp trừu tượng, bạn phải cung cấp các triển khai cho tất cả các phương thức trừu tượng trong đó.

## Example: Java Abstract Class

```java
/* File name : Employee.java */
public abstract class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   
   public double computePay() {
     System.out.println("Inside Employee computePay");
     return 0.0;
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

Bạn có thể thấy rằng ngoại trừ các phương thức trừu tượng, lớp Employee giống với lớp bình thường trong Java. Lớp này hiện là trừu tượng, nhưng vẫn có ba trường, bảy phương thức và một hàm tạo.

Now you can try to instantiate the Employee class in the following way −

```java
/* File name : AbstractDemo.java */
public class AbstractDemo {

   public static void main(String [] args) {
      /* Following is not allowed and would raise error */
      Employee e = new Employee("George W.", "Houston, TX", 43);
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}

abstract class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   
   public double computePay() {
     System.out.println("Inside Employee computePay");
     return 0.0;
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

When you compile the above class, it gives you the following error −

```bash
Employee.java:46: Employee is abstract; cannot be instantiated
      Employee e = new Employee("George W.", "Houston, TX", 43);
                   ^
1 error
```

## Inheriting the Java Abstract Class

We can inherit the properties of Employee class just like concrete class in the following way −

```java
/* File name : Salary.java */
public class Salary extends Employee {
   private double salary;   // Annual salary
   
   public Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      setSalary(salary);
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName() + " with salary " + salary);
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

Tại đây, bạn không thể khởi tạo lớp Employee, nhưng bạn có thể khởi tạo lớp Salary và sử dụng phiên bản này, bạn có thể truy cập tất cả ba trường và bảy phương thức của lớp Employee như được hiển thị bên dưới.

```java
/* File name : AbstractDemo.java */
public class AbstractDemo {

   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}
abstract class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   
   public double computePay() {
     System.out.println("Inside Employee computePay");
     return 0.0;
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
   private double salary;   // Annual salary
   
   public Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      setSalary(salary);
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName() + " with salary " + salary);
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

## Java Abstract Methods

Nếu bạn muốn một lớp chứa một phương thức cụ thể nhưng muốn việc triển khai thực tế của phương thức đó được xác định bởi các lớp con, bạn có thể khai báo phương thức đó trong lớp cha dưới dạng trừu tượng.

- abstract keyword is used to declare the method as abstract.
- Bạn phải đặt từ khóa abstract trước tên phương thức trong phần khai báo phương thức.
- Một phương thức trừu tượng chứa chữ ký phương thức nhưng không có thân phương thức
- Thay vì dấu ngoặc nhọn, phương thức trừu tượng sẽ có dấu chấm phẩy (;) ở cuối.

### Example 1: Implementing Abstract Method in Java

```java
public abstract class Employee {
   private String name;
   private String address;
   private int number;
   
   public abstract double computePay();
   // Remainder of class definition
}
```

Việc khai báo một phương thức là trừu tượng có hai hậu quả −

- Lớp chứa nó phải được khai báo là trừu tượng.
- Bất kỳ lớp nào kế thừa lớp hiện tại đều phải ghi đè phương thức trừu tượng hoặc tự khai báo là trừu tượng.

Lưu ý − Cuối cùng, lớp con phải triển khai phương thức trừu tượng; nếu không, bạn sẽ có một hệ thống phân cấp các lớp trừu tượng không thể khởi tạo được.


Giả sử lớp Salary kế thừa lớp Employee, thì nó phải triển khai phương thức computePay() như được hiển thị bên dưới −

```java
/* File name : Salary.java */
public class Salary extends Employee {
   private double salary;   // Annual salary
  
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
   // Remainder of class definition
}
```

### Example 2: Implementing Abstract Method in Java 

```java
/* File name : AbstractDemo.java */
public class AbstractDemo {
   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      System.out.println("salary: " + s.computePay());
   }
}
abstract class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }

   public abstract double computePay();
      // Remainder of class definition

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }
}
class Salary extends Employee {
   private double salary;   // Annual salary

   public Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      this.salary = salary;
   }

   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
   // Remainder of class definition
}
```