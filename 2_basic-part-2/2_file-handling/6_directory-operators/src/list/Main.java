package list;

import java.io.File;

public class Main {
   public static void main(String[] args) {
      String dirname = "D:/Github/java-tutorial/2_basic-part-2/2_file-handling/6_directory-operators/new-folder/";
      File file = new File(dirname);
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
