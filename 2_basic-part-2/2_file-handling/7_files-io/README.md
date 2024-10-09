# Java - Files and I/O

Gói java.io chứa hầu như mọi lớp bạn có thể cần để thực hiện nhập và xuất (I/O) trong Java.

## Stream

Một luồng có thể được định nghĩa là một chuỗi dữ liệu. Có hai loại Luồng
- `InPutStream` − được sử dụng để đọc dữ liệu từ một nguồn. 
- `OutPutStream` − được sử dụng để ghi dữ liệu vào một đích.

![alt text](image.png)

## FileInputStream/FileOutputStream (Byte Streams)

`Java Byte Streams` được sử dụng để thực hiện nhập và xuất các byte 8 bit. Mặc dù có nhiều lớp liên quan đến Byte Streams nhưng các lớp được sử dụng thường xuyên nhất là `FileInputStream` và `FileOutputStream`. Sau đây là một ví dụ sử dụng hai lớp này để sao chép tệp đầu vào vào tệp đầu ra −

```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```

## FileReader/FileWriter (Character Streams)

Java` Byte streams` are used to perform input and output of **8-bit** bytes, whereas Java `Character streams` are used to perform input and output for **16-bit unicode**.

Though there are many classes related to character streams but the most frequently used classes are, `FileReader` and `FileWriter`.

```java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("input.txt");
         out = new FileWriter("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
```


## BufferedInputStream / BufferedOutputStream 

là hai lớp trong Java được sử dụng để cải thiện hiệu suất đọc và ghi dữ liệu từ và đến các luồng (streams) như `FileInputStream` và `FileOutputStream` bằng cách sử dụng bộ đệm (buffer).

```java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Standard Streams

Tất cả các ngôn ngữ lập trình đều cung cấp hỗ trợ cho chuẩn I/O, trong đó chương trình của người dùng có thể lấy dữ liệu đầu vào từ bàn phím rồi tạo ra đầu ra trên màn hình máy tính.

- `Standard Input` − This is used to feed the data to user's program and usually a keyboard is used as standard input stream and represented as **System.in**.
- `Standard Output` − This is used to output the data produced by the user's program and usually a computer screen is used for standard output stream and represented as **System.out**.
- `Standard Error` − This is used to output the error data produced by the user's program and usually a computer screen is used for standard error stream and represented as System.err.

```java
import java.io.InputStreamReader;
public class ReadConsole {
   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
}
```