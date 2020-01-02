import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int result1=0;
        int result2=0;
        for(int i=0,j=arr.size()-1 ; i<arr.size();i++,j--){
        	//System.out.println(arr.get(i).get(i));
            result1= result1+arr.get(i).get(i);
            result2 = result2+arr.get(j).get(i);
        }
        //System.out.println(result1);
//        for(int i=arr.size(); i>=0;i--){
//        	System.out.println(arr.get(i).get(i));
//            result2 = result2+arr.get(i).get(i);
//        }
        float n = (float)1/6;
        System.out.println(String.format("%.6f", n));
        return Math.abs(result1-result2);

    }

}

public class DiagonalDiffernece {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // int n = 3;

        List<List<Integer>> arr = new ArrayList<>();

            List<Integer> arrRowItems1 = new ArrayList<>();
            arrRowItems1.add(11);
            arrRowItems1.add(2);
            arrRowItems1.add(4);
            List<Integer> arrRowItems2 = new ArrayList<>();
            arrRowItems2.add(4);
            arrRowItems2.add(5);
            arrRowItems2.add(6);
            List<Integer> arrRowItems3 = new ArrayList<>();
            arrRowItems3.add(10);
            arrRowItems3.add(8);
            arrRowItems3.add(-12);
            
            arr.add(arrRowItems1);
            arr.add(arrRowItems2);
            arr.add(arrRowItems3);
            
        
        int result = Result.diagonalDifference(arr);
        System.out.println(result);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
