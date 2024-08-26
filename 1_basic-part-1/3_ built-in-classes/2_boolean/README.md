# Boolean Class

- The Java Boolean class wraps a value of the primitive type boolean in an object. An object of type Boolean contains a single field whose type is boolean.

## Boolean Class Constructors

1	Boolean(boolean value)
This allocates a Boolean object representing the value argument.

2	Boolean(String s)
This allocates a Boolean object representing the value true if the string argument is not null and is equal, ignoring case, to the string "true".

## Boolean Class Methods

1	boolean booleanValue()
This method returns the value of this Boolean object as a boolean primitive.

2	int compareTo(Boolean b)
This method compares this Boolean instance with another.

3	boolean equals(Object obj)
This method returns true if and only if the argument is not null and is a Boolean object that represents the same boolean value as this object.

4	static boolean getBoolean(String name)
This method returns true if and only if the system property named by the argument exists and is equal to the string "true".

5	int hashCode()
This method returns a hash code for this Boolean object.

6	int hashCode(boolean value)
This method returns a hash code for a given boolean value. It is compatible with Boolean.hashCode().

7	static boolean logicalAnd​(boolean a, boolean b)
This method returns the result of applying the logical AND operator to the specified boolean operands.

8	static boolean logicalOr(boolean a, boolean b)
This method returns the result of applying the logical OR operator to the specified boolean operands.

9	static boolean logicalXor(boolean a, boolean b)
This method returns the result of applying the logical XOR operator to the specified boolean operands.

10	static boolean parseBoolean(String s)
This method parses the string argument as a boolean.

11	String toString()
This method returns a String object representing this Boolean's value.

12	static String toString(boolean b)
This method returns a String object representing the specified boolean.

13	static Boolean valueOf(boolean b)
This method returns a Boolean instance representing the specified boolean value.

14	static Boolean valueOf(String s)
This method returns a Boolean with a value represented by the specified string.


```java
package com.tutorialspoint;
public class BooleanDemo {
   public static void main(String[] args) {

      // create 2 Boolean objects b1, b2
      Boolean b1, b2;

      // assign values to b1, b2
      b1 = Boolean.valueOf(true);
      b2 = Boolean.valueOf(false);

      // create an int res
      int res;

      // compare b1 with b2
      res = b1.compareTo(b2);

      String str1 = "Both values are equal ";
      String str2 = "Object value is true";
      String str3 = "Argument value is true";
      if( res == 0 ) {
      	System.out.println( str1 );
      } else if( res > 0 ) {
         System.out.println( str2 );
      } else if( res < 0 ) {
         System.out.println( str3 );
      }
   }
}
```