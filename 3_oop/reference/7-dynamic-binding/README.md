# Dynamic Binding

## Dynamic Binding

Dynamic binding cũng được gọi là đa hình thời gian chạy (run-time polymorphism) hoặc liên kết muộn (late binding). Liên kết động sử dụng các đối tượng để giải quyết liên kết.

## Đặc điểm của Java Dynamic Binding

- Linking - Liên kết giữa method call và việc triển khai phương thức được giải quyết tại thời điểm chạy.
- Resolve mechanism − Dynamic binding uses object type to resolve binding.
- Example − Method overriding is the example of Dynamic binding.
- Type of Methods − Virtual methods use dynamic binding.


```java
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      super.move();   // invokes the super class method
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal b = new Dog();   // Animal reference but Dog object
      b.move();   // runs the method in Dog class
   }
}
```