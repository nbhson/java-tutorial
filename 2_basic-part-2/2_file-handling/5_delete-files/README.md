# Java -Deleting Files in Java

To delete a file in Java, you can use the File.delete() method. This method deletes the files or directory from the given path.

## Syntax

```java
File file = new File("C:/java/hello.txt");

if(file.exists()){
   file.delete();
}
```

## Deleting File from Current Directory

```java
package com.tutorialspoint;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
  
   public static void main(String args[]) throws IOException {
      BufferedWriter out = new BufferedWriter (new FileWriter("test.txt"));
      out.write("test data");
      out.close();

      File file = new File("test.txt");
      if(file.exists()) {
         boolean success = file.delete();

         if (success) {
            System.out.println("The file has been successfully deleted."); 
         }else {
            System.out.println("The file deletion failed.");
         }        
      }else {
         System.out.println("The file is not present."); 
      }
   }
}
```

## Deleting All Files From Given Directory

```java
package com.tutorialspoint;

import java.io.File;
import java.io.IOException;

public class FileTest {
  
   public static void deleteFiles(File dirPath) {
      File filesList[] = dirPath.listFiles(); // mảng chứa tất cả các file và thư mục con trong đường dẫn được chỉ định dirPath.
      for(File file : filesList) {
         if(file.isFile()) {
            file.delete();
         } else {
            deleteFiles(file);
         }
      }
   }
   public static void main(String args[]) throws IOException {
      
      //Creating a File object for directory
      File file = new File("D:\\test");
      
      //List of all files and directories
      deleteFiles(file);
      System.out.println("Files deleted.");
   }
}
```