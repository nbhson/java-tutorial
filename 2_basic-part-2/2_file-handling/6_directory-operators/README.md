# Java - Directory Operations

A directory is a File which can contain a list of other files and directories. You use File object to create directories, to list down files available in a directory. For complete detail, check a list of all the methods which you can call on File object and what are related to directories.

## Creating Directories

There are two useful `File` utility methods, which can be used to create directories −

- The `mkdir()` method creates a directory, returning true on success and false on failure. Failure indicates that the path specified in the File object already exists, or that the directory cannot be created because the entire path does not exist yet.
- The `mkdirs()` method creates both a directory and all the parents of the directory.

### Example to Create Directory in Java

```java
package com.tutorialspoint;

import java.io.File;

public class DirectoryTest {
   public static void main(String args[]) {
      String dirname = "/tmp/user/java/bin";
      File directory = new File(dirname);

      // Create directory now.
      directory.mkdirs();

      // create new file object
      File file = new File("/tmp/user/java/bin");

      System.out.println(file.exists());      
   }
}
```

### Listing (Reading) Directories

You can use list() method provided by File object to list down all the files and directories available in a directory as follows (inside) −

```java
package com.tutorialspoint;

import java.io.File;

public class DirectoryTest {

   public static void main(String[] args) {
      File file = null;
      String[] paths;
  
      try {      
         // create new file object
         file = new File("/tmp");

         // array of files and directory
         paths = file.list();

         // for each name in the path array
         for(String path:paths) {
            // prints filename and directory name
            System.out.println(path);
         }
      } catch (Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
   }
}
```

### Deleting Directories

You can use `delete()` method provided by File object to delete a directory as follows −

```java
package com.tutorialspoint;

import java.io.File;

public class DirectoryTest {

   public static void main(String[] args) {
      File file = new File("/tmp/user/java/bin");
      if(file.exists()) {
         boolean success = file.delete();

         if (success) {
            System.out.println("The directory has been successfully deleted."); 
         }else {
            System.out.println("The directory deletion failed.");
         }        
      }else {
         System.out.println("The directory is not present."); 
      }
   }
}
```