package list;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Main {
   public static void main(String[] args) throws IOException {
      InputStreamReader cin = null;
      FileWriter writer = new FileWriter(
      "D:\\Github\\java-tutorial\\2_basic-part-2\\2_file-handling\\7_files-io\\files\\test.txt");

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'q' to quit.");
         char c;
         do {
            c = (char) cin.read();
            writer.write(c);
            System.out.print(c);
         } while (c != 'q');
      } finally {
            cin.close();
            writer.close();
      }
   }
}
