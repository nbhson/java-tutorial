# Exceptions

## What Is an Exception in Java?

`An exception` is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

## Why Exception Occurs?

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
- A user has entered an invalid data.
- A file that needs to be opened cannot be found.
- A network connection has been lost in the middle of communications or the JVM has run out of memory.

> Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in some manner.

## Try with Resources

> Câu lệnh try-with-resources trong Java là câu lệnh try được sử dụng để khai báo một hoặc nhiều tài nguyên như streams, sockets, databases, connections, etc. v.v. Các tài nguyên này **phải được đóng** trong khi chương trình đang được hoàn tất. Câu lệnh try-with-resources sẽ đóng các tài nguyên ở cuối câu lệnh **một cách tự động.**

The try-with-resources feature was introduced in Java7. The try-with-resources can also be a replacement for try-catch-finally with resources objects.

## Syntax of Try with Resources

```java
try(resources declarations) {
   // use of the resources
}
catch(Exception e) {
   // exception handling
}
```

## Example

```java
try(FileReader fr = new FileReader("E://file.txt")) {
   char [] a = new char[50];
   fr.read(a);   // reads the contentto the array
   for(char c : a)
   System.out.print(c);   // prints the characters one by one
} catch (IOException e) {
   e.printStackTrace();
}
```

## Try with Resources having Multiple Resources

```java
// This example is to use Try with Resources 
// with multiple  Resources
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // try block with multiple resources
    try (
      FileReader fileReader = new FileReader("file1.txt"); 
      BufferedReader bufferedReader = new BufferedReader(fileReader); 
      FileWriter fileWriter = new FileWriter("file2.txt"); 
      PrintWriter printWriter = new PrintWriter(fileWriter)
    ) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        // Read content line by line and write it 
        // to the output (file2.txt) file
        printWriter.println(line);
      }
      System.out.println("Content copied.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
```

Sau khi kết thúc khối try, BufferedReader sẽ tự động được đóng mà không cần phải gọi phương thức close() một cách rõ ràng. Nếu có lỗi xảy ra trong quá trình đọc file, nó sẽ được bắt và xử lý trong khối catch.

###  Without Try with Resources

```java
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo {

   public static void main(String args[]) {
      FileReader fr = null;		
      try {
         File file = new File("file.txt");
         fr = new FileReader(file); char [] a = new char[50];
         fr.read(a);   // reads the content to the array
         for(char c : a)
         System.out.print(c);   // prints the characters one by one
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            fr.close();
         } catch (IOException ex) {		
            ex.printStackTrace();
         }
      }
   }
}
```
