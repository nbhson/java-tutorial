# Static Binding

## Static Binding

Static binding còn được gọi là liên kết thời điểm biên dịch (compile-time binding) hoặc liên kết sớm. (early binding.)

## Đặc điểm của Java Static Binding 
- Liên kết − Liên kết giữa lệnh gọi phương thức và triển khai phương thức được giải quyết tại thời điểm biên dịch. 
- Cơ chế giải quyết − Static binding sử dụng kiểu của lớp và các trường để giải quyết binding. 
- Ví dụ − Quá tải phương thức là ví dụ về Static binding. 
- Kiểu phương thức − private, final và static và các biến sử dụng static binding.

## Example of Java Static Binding

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