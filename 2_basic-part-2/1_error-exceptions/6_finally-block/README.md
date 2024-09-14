# Exceptions

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Finally 

The finally block follows a try block or a catch block. `A finally block of code always executes,` irrespective of occurrence of an Exception.

```java 
try {
   // Protected code
} catch (ExceptionType1 e1) {
   // Catch block
} catch (ExceptionType2 e2) {
   // Catch block
} catch (ExceptionType3 e3) {
   // Catch block
} finally {
   // The finally block always executes.
}
```

# Points To Remember While Using Finally Block
- Không bắt buộc phải có mệnh đề cuối cùng bất cứ khi nào có khối thử/bắt.
- Khối `finally` không được thực thi trong trường hợp phương thức exit() được gọi trước khối cuối cùng hoặc xảy ra lỗi nghiêm trọng khi thực thi chương trình.
- `finally` block is executed even method returns a value before finally block.

# Why Java Finally Block Used?
- Java finally block can be used for clean-up (closing) the connections, files opened, streams, etc. those must be closed before exiting the program.
- It can also be used to print some final information.

## Example

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {
      int a[] = new int[2];
      try {
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }finally {
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
         System.out.println("The finally statement is executed");
      }
   }
}
```

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {     
      System.out.println(testFinallyBlock());
   }

   private static int testFinallyBlock() {
      int a[] = new int[2];
      try {
         return 1; 
      } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception thrown  :" + e);
      }finally {
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
         System.out.println("The finally statement is executed");
      }
      return 0;
   }
}
```