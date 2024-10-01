# Java - Write File

## Write to file in Java

We can write to a file in Java using multiple ways. Following are three most popular ways to create a file in Java −

> Using FileOutputStream() constructor
> Using FileWriter.write() method
> Using Files.write() method

## Write To File Using FileWriter.write() Method

Syntax

```java
// get an existing file
File file = new File("d://test//testFile1.txt");

// Write Content
FileWriter writer = new FileWriter(file);
writer.write("Test data");
writer.close();
```

Example

```java
package com.tutorialspoint;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

   public static void main(String args[]) {
   
      try {
          File file = new File("d://test//testFile1.txt");
          
          //Create the file
          if (file.createNewFile()) { 
             System.out.println("File is created!");
          } else {
             System.out.println("File already exists.");
          } 
          
          // Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data");
          writer.close();
          
          
          // read content
          FileReader reader = new FileReader(file);
          
          int c;
          while ((c = reader.read()) != -1) {
        	  char ch = (char) c;
              System.out.print(ch);
          }
      } catch (IOException e) {
         System.out.print("Exception");
      }	
   }
}
```