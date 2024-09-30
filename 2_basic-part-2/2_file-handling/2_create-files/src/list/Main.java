package list;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.Permission;

public class Main {
   public static void main(String[] args) {
      try {
         File file = new File("D:\\Github\\java-tutorial\\2_basic-part-2\\2_file-handling\\2_create-files\\test.txt");

         // Create the file
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
         System.out.print("Exception: " + e);
      }
   }
}
