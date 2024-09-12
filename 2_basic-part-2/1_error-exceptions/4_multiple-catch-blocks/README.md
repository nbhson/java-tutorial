# Exceptions

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Multiple Catch Blocks in Java

Multiple catch blocks in Java are used to catch/handle multiple exceptions that may be thrown from a particular code section. A try block can have multiple catch blocks to handle multiple exceptions.

## Syntax: Multiple Catch Blocks

```java
try {
   // Protected code
} catch (ExceptionType1 e1) {
   // Catch block
} catch (ExceptionType2 e2) {
   // Catch block
} catch (ExceptionType3 e3) {
   // Catch block
}
```

## Points to Remember while using Multiple Catch Blocks

- Mỗi lần chỉ có thể xử lý một loại ngoại lệ. Trong chế độ được bảo vệ, chỉ một loại ngoại lệ sẽ được nêu ra, do đó nó sẽ chỉ được xử lý trong khối bắt có liên quan.
- Thứ tự của khối bắt là rất quan trọng. Thứ tự phải từ ngoại lệ cụ thể đến ngoại lệ chung. Trong trường hợp khối ngoại lệ cha xuất hiện trước khối ngoại lệ con, trình biên dịch sẽ khiếu nại và sẽ đưa ra lỗi thời gian biên dịch.

### Example of Java Multiple Catch Blocks

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         int b = 0;
         int c = 1/b;
         System.out.println("Access element three :" + a[3]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
      }catch (Exception e) {
          System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}
```

## Handling Multiple Exceptions Within A Single Catch Block

### Syntax 

```java
catch (IOException|FileNotFoundException ex) {
   logger.log(ex);
   throw ex;
```

## Example 

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         int b = 0;
         int c = 1/b;
         System.out.println("Access element three :" + a[3]);
      }
      catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}
```