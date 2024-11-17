# Basic Operators

## Java Arithmetic Operators

+ (Addition)	      Adds values on either side of the operator.	         A + B will give 30
- (Subtraction)	   Subtracts right-hand operand from left-hand operand.	A - B will give -10
* (Multiplication)	Multiplies values on either side of the operator.	   A * B will give 200
/ (Division)	      Divides left-hand operand by right-hand operand.	   B / A will give 2
% (Modulus)	         Divides left-hand operand by right-hand operand and returns remainder.	B % A will give 0
++ (Increment)	      Increases the value of operand by 1.	               B++ gives 21
-- (Decrement)	      Decreases the value of operand by 1.	               B-- gives 19

## Java Relational Operators

== (equal to)	            Checks if the values of two operands are equal or not, if yes then condition becomes true.	                        (A == B) is not true.
!= (not equal to)	         Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.	         (A != B) is true.
> (greater than)	         Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.	(A > B) is not true.
< (less than)	            Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.	   (A < B) is true.
>= (greater than or equal to)	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.	(A >= B) is not true.
<= (less than or equal to)	Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.	(A <= B) is true.

## Java Logical Operators

&& (logical and)	Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.	   (A && B) is false
|| (logical or)	Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.	(A || B) is true
! (logical not)	Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.	!(A && B) is true

## The Assignment Operators

=	   Simple assignment operator. Assigns values from right side operands to left side operand.	C = A + B will assign value of A + B into C
+=	   Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.	C += A is equivalent to C = C + A
-=	   Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.	C -= A is equivalent to C = C − A
*=	   Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.	C *= A is equivalent to C = C * A
/=	   Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.	C /= A is equivalent to C = C / A
%=	   Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.	C %= A is equivalent to C = C % A
<<=	Left shift AND assignment operator.	C <<= 2 is same as C = C << 2
>>=	Right shift AND assignment operator.	C >>= 2 is same as C = C >> 2
&=	   Bitwise AND assignment operator.	C &= 2 is same as C = C & 2
^=	   bitwise exclusive OR and assignment operator.	C ^= 2 is same as C = C ^ 2
|=	   bitwise inclusive OR and assignment operator.	C |= 2 is same as C = C | 2

## Conditional Operator ( ? : )

```java
public class Test {

   public static void main(String args[]) {
      int a, b;
      a = 10;
      b = (a == 1) ? 20: 30;
      System.out.println( "Value of b is : " +  b );

      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );
   }
}
```

## instanceof Operator

```java
public class Test {

   public static void main(String args[]) {

      String name = "James";

      // following will return true since name is type of String
      boolean result = name instanceof String;
      System.out.println( result );
   }
}
```