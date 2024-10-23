
## Public Vs. Static Class Methods
```java
public class Main {
  // Creating a static method
  static void fun1() {
    System.out.println("fun1: This is a static method.");
  }

  // Creating a public method
  public void fun2() {
    System.out.println("fun2: This is a public method.");
  }

  // The main() method
  public static void main(String[] args) {
    // Accessing static method through the class
    fun1();

    // Creating an object of the Main class
    Main obj = new Main();
    // Accessing public method through the object
    obj.fun2();
  }
}
```