# Java - Create File

## Create file in Java

We can create a file in Java using multiple ways. Following are three most popular ways to create a file in Java −

> Using FileOutputStream() constructor
> Using File.createNewFile() method
> Using Files.write() method

## Create File Using FileOutputStream Constructor

Syntax

```java
OutputStream f = new FileOutputStream("C:/java/hello.txt") 

File f = new File("C:/java/hello.txt");
OutputStream f = new FileOutputStream(f);
```

Example

```java
package com.tutorialspoint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTest {

   public static void main(String args[]) {
   
      try {
         byte bWrite [] = {65, 66, 67, 68, 69};
         OutputStream os = new FileOutputStream("test.txt");
         for(int x = 0; x < bWrite.length ; x++) {
            os.write( bWrite[x] );   // writes the bytes
         }
         os.close();
     
         InputStream is = new FileInputStream("test.txt");
         int size = is.available();

         for(int i = 0; i < size; i++) {
            System.out.print((char)is.read() + "  ");
         }
         is.close();
      } catch (IOException e) {
         System.out.print("Exception");
      }	
   }
}
```

## Create File Using File.createNewFile() Method

Syntax 

```java
File file = new File("d://test//testFile1.txt");

//Create the file
if (file.createNewFile()) { 
   System.out.println("File is created!");
} else {
   System.out.println("File already exists.");
}
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
          File file = new File("D:\\Github\\java-tutorial\\2_basic-part-2\\2_file-handling\\2_create-files\\test.txt");
          
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

## Create File Using Files.write() Method

Syntax

```java
String data = "Test data";
Files.write(Paths.get("d://test/testFile3.txt"), data.getBytes());

List<String> lines = Arrays.asList("1st line", "2nd line");
Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
```

Example

```java
package com.tutorialspoint;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileTest {

   public static void main(String args[]) {
   
      try {
    	  String data = "Test data";
          Files.write(Paths.get("d://test/testFile3.txt"), data.getBytes());
          List<String> lines = Arrays.asList("1st line", "2nd line");
          Files.write(Paths.get(
             "file6.txt"), lines, StandardCharsets.UTF_8, 
             StandardOpenOption.CREATE, StandardOpenOption.APPEND);
          
          List<String> content = Files.readAllLines(Paths.get("d://test/testFile3.txt"));

          System.out.println(content);
          
          content = Files.readAllLines(Paths.get("file6.txt"));

          System.out.println(content);
      } catch (IOException e) {
         System.out.print("Exception");
      }	
   }
}
```