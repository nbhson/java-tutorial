# Java throws and throw

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Java throws and throw

If a method does not handle a checked exception, the method must declare it using the `throws` keyword. The `throws` keyword appears at the end of a method's signature.

Try to understand the difference between throws and throw keywords, 
- `throws` is used to postpone the handling of a checked exception 
- `throw` is used to invoke an exception explicitly.

## Syntax

```java
method(parameters) throws exception {
  // Method implementation
  throw new exception();
}
```

### Java Throws and Throw Example

### Example 1

```java
public static void main(String args[]) {
      int a = 3;
      int b = 0;
      System.out.println("result:" + divide(a,b));
   }

   private static int divide(int a, int b) {
      if(b == 0) {
         throw new IllegalArgumentException("second argument cannot be zero.");
      }
      return a / b;
   }
```

### Example 2

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {
      int a = 3;
      int b = 0;
      try {
         System.out.println("result:" + divide(a,b));
      } catch (Exception e) {
         System.out.println("Exception: " + e);
      }
   }

   private static int divide(int a, int b) throws Exception {
      if(b == 0) {
         throw new Exception("second argument cannot be zero.");
      }
      return a / b;
   }
}
```