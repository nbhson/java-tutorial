# Exceptions

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Java Exception Categories

Based on these, we have the following categories of Exceptions.'
- Checked exceptions
- Unchecked exceptions
- Errors

## Java try and catch

> A method catches an exception using a combination of the `try` and `catch` keywords. A try and catch block is placed around the code that might generate an exception. 

### The try Block

- When an exception occurs, that exception occurred is handled by `catch` block associated with it. 
- Every try block should be immediately followed either by a catch block or finally block.

### The catch Block

If an exception occurs in protected code, the catch block that follows the try is checked.

### Syntax of Java try and catch Block

```java
try {
   // Protected code
} catch (ExceptionName e1) {
   // Catch block
}
```

### Example

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}
```

## Multiple Catch Blocks With Java Try

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

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         int b = 0;
         int c = 1 / b; // move this line 
         System.out.println("Access element three :" + a[3]); // move this line 
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

# Multiple Catch Blocks With Java Try

```java
catch (IOException|FileNotFoundException ex) {
   logger.log(ex);
   throw ex;
```

> Cần phải chỉ rõ Exception nào nếu muốn sử dụng multiple

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