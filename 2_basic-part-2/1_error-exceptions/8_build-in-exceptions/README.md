# Java throws and throw

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Common Built-in Exceptions in Java

1 `ArithmeticException()`

Arithmetic error (Số học), such as divide-by-zero. 

2 `ArrayIndexOutOfBoundsException()`

Array index is out-of-bounds.

3 `ArrayStoreException()`

Assignment to an array element of an incompatible type (gan array không tương thích).

4 `ClassCastException()`

Invalid cast.

5 `IllegalArgumentException()`

Illegal argument used to invoke a method (Đối số không hợp lệ được sử dụng để gọi một phương thức.).

6 `IllegalMonitorStateException()`

Illegal monitor operation, such as waiting on an unlocked thread. (question)

7 `IllegalStateException()`

Environment or application is in **incorrect state**.

8 `IllegalThreadStateException()`

Requested operation not compatible with the current thread state.

9 `IndexOutOfBoundsException()`

Some type of index is out-of-bounds.

10 `NegativeArraySizeException()`

Array created with a negative size. (array kich thuoc am).

11 `NullPointerException()`

Invalid use of a null reference 

12 `NumberFormatException()`

Invalid conversion of a string to a numeric format.

13 `SecurityException()`

Attempt to violate security.

14 `StringIndexOutOfBounds()`

Attempt to index outside the bounds of a string.

15 `UnsupportedOperationException()`

An unsupported operation was encountered.

16 `ClassNotFoundException()`

Class not found.

17 `CloneNotSupportedException()`

Attempt to clone an object that does not implement the Cloneable interface. (question)

18 `IllegalAccessException()`

Access to a class is denied.

19 `InstantiationException()`

Attempt to create an object of an abstract class or interface. (question)

20 `InterruptedException()`

One thread has been interrupted by another thread.

21 `NoSuchFieldException()`

A requested field does not exist.

22 `NoSuchMethodException()`

A requested method does not exist.