import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class javaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in).useDelimiter("|/n|");
        int i=0;
        while(sc.hasNextLine()){
            String line= sc.nextLine();
            i++;
            System.out.println(i+" "+line);
        
        }
    }
}
