package list;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
   public static void main(String[] args) {
      try {
         File file = new File("D:\\Github\\java-tutorial\\2_basic-part-2\\2_file-handling\\3_write-to-files\\testWrite.txt");
         
         //Create the file
         if (file.createNewFile()) { 
            System.out.println("File is created!");
         } else {
            System.out.println("File already exists.");
         } 
         
         // Write Content
         FileWriter writer = new FileWriter(file);
         writer.write("Hello");
         writer.append("World");
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
