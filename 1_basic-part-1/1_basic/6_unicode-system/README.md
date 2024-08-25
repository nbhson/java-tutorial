# Unicode System

> Java programming language, being platform-independent, has built-in support for Unicode characters, allowing developers to create applications that can work seamlessly with diverse languages and scripts.

## Using Unicode Escape Sequences 

```java
package com.tutorialspoint;

public class UnicodeCharacterDemo {
   public static void main (String[]args) {   		 
      //Unicode escape sequence
      char unicodeChar = '\u0041';
      // point for 'A'
      System.out.println("Stored Unicode Character: " + unicodeChar); // Stored Unicode Character: A
   }
}
```

## Storing Unicode Values Directly

```java
package com.tutorialspoint;

public class UnicodeCharacterDemo {
   public static void main(String[] args) {
      // Storing Unicode character directly
      char unicodeChar = 'A';
      // Directly storing the character 'A'
      System.out.println("Stored Unicode Character: " + unicodeChar);
   }
}
```

## Assigning Unicode Values to Variables

```java
package com.tutorialspoint;

public class UnicodeCharacterDemo {
   public static void main(String[] args) {
      // Storing Unicode characters using escape sequences
      char letterA = '\u0041';
      char letterSigma = '\u03A3';
      char copyrightSymbol = '\u00A9';
      // Storing Unicode characters directly
      char letterZ = 'Z';
      char letterOmega = 'Ω';
      char registeredSymbol = '®';
      // Printing the stored Unicode characters
      System.out.println("Stored Unicode Characters using Escape Sequences:");
      System.out.println("Letter A: " + letterA); //  Letter A: A
      System.out.println("Greek Capital Letter Sigma: " + letterSigma); //  Greek Capital Letter Sigma: Σ
      System.out.println("Copyright Symbol: " + copyrightSymbol); //  Copyright Symbol: ©
      System.out.println("\nStored Unicode Characters Directly:");
      System.out.println("Letter Z: " + letterZ); //  Letter Z: Z
      System.out.println("Greek Capital Letter Omega: " + letterOmega); //  Greek Capital Letter Omega: Ω
      System.out.println("Registered Symbol: " + registeredSymbol); // Registered Symbol: ®

   }
}
```

##  Assigning Unicode Characters and Values to Variables

```java
package com.tutorialspoint;

public class UnicodeCharacterDemo {
   public static void main(String[] args) {
      // Storing Unicode characters using escape sequences
      char letterA = '\u0041';
      char letterSmallA = '\u0061';
      // Storing Unicode characters directly
      char letterB = 'B';

      // Manipulating the stored Unicode characters
      int difference = letterA - letterSmallA;
      char letterC = (char) (letterB + difference);
      char letterSmallC = (char) (letterC + 32);
      // Printing the manipulated Unicode characters
      System.out.println("Manipulated Unicode Characters:");
      System.out.println("Difference between A and a: " + difference);
      System.out.println("Calculated Letter C: " + letterC);
      System.out.println("Calculated Letter c: " + letterSmallC);
   }
}
```