# Exceptions

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Nested Try Block

A try block can be nested within another try block. This structure is termed as Nested try block. Whenever an exception is raised within a nested try block, its exception is pushed to Stack. The exception propagates from child to parent try block and so on.

(question: real use case for this? do we use it often)

```java
try { // parent try block
   try {  // child try block
   
   }
   catch(ExceptionType1 e1){  // child catch block
   
   }
} catch (ExceptionType2 e1) { // parent catch block

} 
```

## Pointer To Remember While Using Nested Try Block

- Child catch block should have specific exception for better code clarity. Parent catch block can have more generic exception handled so that if child catch block is not able to handle the exception then parent catch block can handle it.
- If a exception is handled correctly in child catch block, then in parent, another exception can be raised and handled.

```java
package com.tutorialspoint;

public class ExcepTest {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         try {
            int b = 0;
            int c = 1/b;
         }catch(Exception e) {
            System.out.println("Child - Exception thrown: " + e);
         }
         System.out.println("Access element three :" + a[3]);
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Parent - Exception thrown: " + e);
      }
      System.out.println("Out of the block");
   }
}

// Child - Exception thrown: java.lang.ArithmeticException: / by zero
// Parent - Exception thrown: java.lang.ArrayIndexOutOfBoundsException: 3
```

```java
try {
   int a[] = new int[2];
   try {
      int b = 0;
      int c = 1/b;
   } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Child - Exception thrown: " + e);
   }
   System.out.println("Access element three :" + a[3]);
}
catch (Exception e) {
   System.out.println("Parent - Exception thrown: " + e);
}

// Parent - Exception thrown: java.lang.ArithmeticException: / by zero
````