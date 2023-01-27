package java_project;

import java.util.Scanner;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class program {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new FileReader("File.txt"));
       String str;
       while ((str = br.readLine()) != null) {
        System.out.printf("== %s ==\n", str);
       }
       br.close();

       
} }
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("Введите имя: ");
    //     String x = iScanner.nextLine();
    //     System.out.printf("Привет, %s!", x);
    //     iScanner.close();

    // }

    // static String getType(Object o) {
    //     return o.getClass().getSimpleName();
    // }
// ----------------------------------------------------------------------

     // try (FileWriter fw = new FileWriter("File.txt", false)) {
        //     fw.write("line 1");
        //     fw.append('\n');
        //     fw.write("Line 2");
        //     fw.append('\n');
        //     fw.write("Line 3");
        //     fw.append('\n');
        //     fw.flush();
        
            
        // } catch (IOException ex) {
        //     System.out.println(ex.getMessage());
        //     // TODO: handle exception
        // }
// -----------------------------------------------------------------------------

        // FileReader fr =new FileReader("File.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        //     char ch = (char) c;
        //     if (ch == '\n') {
        //         System.out.println(ch);
        //     } else {
        //         System.out.println(ch);
        //     }
        // }