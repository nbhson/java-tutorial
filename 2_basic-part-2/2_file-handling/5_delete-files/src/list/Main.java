package list;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
   public static void main(String[] args) {
      File file = new File("D:\\Github\\java-tutorial\\2_basic-part-2\\2_file-handling\\5_delete-files\\testRead.txt");
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
