# Encapsulation

## Java Encapsulation 

`Encapsulation` là một trong bốn khái niệm OOP cơ bản. Ba khái niệm còn lại là kế thừa, đa hình và trừu tượng. 

- Encapsulation trong Java là một cơ chế đóng gói dữ liệu (biến) và mã tác động lên dữ liệu (phương thức) lại với nhau thành một đơn vị duy nhất. 
- Trong encapsulation, các biến của một lớp sẽ được ẩn khỏi các lớp khác và chỉ có thể truy cập thông qua các phương thức của lớp hiện tại của chúng. Do đó, nó còn được gọi là `data hiding`.

## Achieving Encapsulation in Java

To achieve encapsulation in Java −

- Declare the variables of a class as private.
- Provide public setter and getter methods to modify and view the variables values.

## Java Encapsulation Example

```java
/* File name : EncapTest.java */
public class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}
```

The public setXXX() and getXXX() methods are the access points of the instance variables of the EncapTest class.

Normally, these methods are referred as getters and setters. Therefore, any class that wants to access the variables should access them through these getters and setters.

The variables of the EncapTest class can be accessed using the following program −


```java
/* File name : RunEncap.java */
public class RunEncap {

   public static void main(String args[]) {
      EncapTest encap = new EncapTest();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}

public class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}
```

## Benefits of Encapsulation

- The fields of a class can be made read-only or write-only.
- Một lớp có thể kiểm soát toàn bộ những gì được lưu trữ trong các trường của lớp đó.

## Java Encapsulation: Read-Only Class

A read-only class can have only getter methods to get the values of the attributes, there should not be any setter method.

```java
// Class "Person"
class Person {
  private String name = "Robert";
  private int age = 21;

  // Getter methods
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}

public class Main {
  public static void main(String args[]) {
    // Object to Person class
    Person per = new Person();

    // Getting and printing the values
    System.out.println("Name of the person is: " + per.getName());
    System.out.println("Age of the person is: " + per.getAge());
  }
}
```

## Java Encapsulation: Write-Only Class

A write-only class can have only setter methods to set the values of the attributes, there should not be any getter method.

```java
// Class "Person"
class Person {
  private String name;
  private int age;

  // Setter Methods
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
}

public class Main {
  public static void main(String args[]) {
    // Object to Person class
    Person per = new Person();

    // Setting the values
    per.setName("Robert");
    per.setAge(21);
  }
}
```

## Example

```java
// Class "Employee"
class Employee {
  private String emp_name;
  private String emp_id;
  private double net_salary;

  // Constructor
  public Employee(String emp_name, String emp_id, double net_salary) {
    this.emp_name = emp_name;
    this.emp_id = emp_id;
    this.net_salary = net_salary;
  }

  // Getter methods
  public String getEmpName() {
    return emp_name;
  }

  public String getEmpId() {
    return emp_id;
  }

  public double getSalary() {
    return net_salary;
  }

  // Setter methods
  public void setEmpName(String emp_name) {
    this.emp_name = emp_name;
  }

  public void setEmpId(String emp_id) {
    this.emp_id = emp_id;
  }

  public void setSalary(double net_salary) {
    this.net_salary = net_salary;
  }
}

// The Main class to test encapsulated class "Employee"
public class Main {
  public static void main(String args[]) {
    // Objects to Employee class
    // First object - setting values using constructor
    Employee emp = new Employee("Robert", "EMP001", 75450.00);

    // Printing data
    System.out.println("Employee (Intial Values):");
    System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());

    // Updating values using setter methods
    emp.setEmpName("Riyan");
    emp.setEmpId("EMP002");
    emp.setSalary(90500.00);

    // Printing data
    System.out.println("Employee (Updated Values):");
    System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());
  }
}
```