# Class & Object

## What are Java Classes?

- Một `class` là một bản thiết kế mà từ đó các đối tượng riêng lẻ được tạo ra (hoặc chúng ta có thể nói một lớp là một kiểu dữ liệu của một kiểu đối tượng).
- Trong Java, mọi thứ đều liên quan đến các lớp và đối tượng. Mỗi lớp có các `phương thức` và `thuộc tính` riêng có thể được truy cập và thao tác thông qua các đối tượng.

*For example, if you want to create a class for students. In that case, "Student" will be a class, and student records (like student1, student2, etc) will be objects.*

### Properties of Java Classes

- Một lớp không chiếm bất kỳ byte bộ nhớ nào. 
- Một lớp cũng giống như một thực thể trong thế giới thực, nhưng nó không phải là một thực thể trong thế giới thực. Nó là một bản thiết kế trong đó chúng ta chỉ định các chức năng. 
- Một lớp chủ yếu chứa hai thứ: Phương thức và Thành viên dữ liệu. 
- Một lớp cũng có thể là một lớp lồng nhau. Các lớp tuân theo tất cả các quy tắc của OOP như kế thừa, đóng gói, trừu tượng hóa, v.v.

### Types of Class Variables

- `Local variable` − Các biến được định nghĩa bên trong phương thức, hàm tạo hoặc khối được gọi là biến cục bộ. Biến sẽ được khai báo và khởi tạo bên trong phương thức và biến sẽ bị hủy khi phương thức hoàn tất. 
- `Instance variable`− Biến thể hiện là các biến bên trong một lớp nhưng bên ngoài bất kỳ phương thức nào. Các biến này được khởi tạo khi lớp được khởi tạo. Biến thể hiện có thể được truy cập từ bên trong bất kỳ phương thức, hàm tạo hoặc khối nào của lớp cụ thể đó. 
- `Class variable` − Biến lớp là các biến được khai báo bên trong một lớp, bên ngoài bất kỳ phương thức nào, với từ khóa static.

### Creating (Declaring) a Java Class

To create (declare) a class, you need to use `access modifiers` followed by `class` keyword and `class_name`

```java
access_modifier class class_name{
  data members;
  constructors;
  methods;
  ...;
}
```

Example of a Java Class

```java
// Creating a Java class
class Dog {
  // Declaring and initializing the attributes
  String breed;
  int age;
  String color;

  // methods to set breed, age, and color of the dog
  public void setBreed(String breed) {
    this.breed = breed;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setColor(String color) {
    this.color = color;
  }

  // method to print all three values
  public void printDetails() {
    System.out.println("Dog detials:");
    System.out.println(this.breed);
    System.out.println(this.age);
    System.out.println(this.color);
  }
}
```

## What are Java Objects?

- Đối tượng là một biến thuộc loại lớp, là thành phần cơ bản của hệ thống lập trình hướng đối tượng. Một lớp có các phương thức và thành viên dữ liệu (thuộc tính), các phương thức và thành viên dữ liệu này được truy cập thông qua một đối tượng. `Do đó, một đối tượng là một thể hiện của một lớp.` 
- Nếu chúng ta xem xét thế giới thực, chúng ta có thể tìm thấy nhiều đối tượng xung quanh chúng ta, ô tô, chó, con người, v.v. Tất cả các đối tượng này đều có trạng thái và hành vi. Nếu chúng ta xem xét một con chó, thì trạng thái của nó là : tên, giống và màu sắc, và hành vi là - sủa, vẫy đuôi và chạy. 

### Creating (Declaring) a Java Object

Như đã đề cập trước đó, một lớp cung cấp bản thiết kế cho các đối tượng. Về cơ bản, một đối tượng được tạo ra từ một lớp. Trong Java, từ khóa `new` được sử dụng để tạo các đối tượng mới.

There are three steps when creating an object from a class −

- Declaration − A variable declaration with a variable name with an object type.
- Instantiation − The 'new' keyword is used to create the object.
- Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.

Syntax to Create a Java Object

```java
Class_name object_name = new Class_name([parameters]);
```

Example to Create a Java Object

```java
public class Main {
  public static void main(String[] args) {
    // Creating an object of the class Dog
    Dog obj = new Dog();

    // setting the attributes
    obj.setBreed("Golden Retriever");
    obj.setAge(2);
    obj.setColor("Golden");

    // Printing values
    obj.printDetails();
  }
}
```
