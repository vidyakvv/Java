//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//public class SockMerchant{
//
//    // Complete the sockMerchant function below.
//    static int sockMerchant(int n, int[] ar) {
//    	HashMap<Integer,Integer> sock = new HashMap <>();
//    	//System.out.println("************HashMap loop beginning*************");
//    		for(int i =0;i<n;i++) {
//    			//System.out.println("************i = "+i+" *****************");
//    			Integer count = sock.get(ar[i]);
//    			if(count==null) {
//    				sock.put(ar[i], 1);
//    				//System.out.println("********* null key*******************");
//    				//System.out.println("********* count=" +count+"*******************");
//    			}
//    			else {
//    				count = count+1;
//    				sock.put(ar[i], count);
//    				//System.out.println("********* non-null key*******************");
//    				//System.out.println("********* count=" +count+"*******************");
//    			}
//    		}
//    		
//    		int sockCount =0;
//    		
//    		for (Map.Entry mapElement : sock.entrySet()) { 
//               // int key = (int)mapElement.getKey(); 
//      
//                int value = (((int)mapElement.getValue())/2); 
//                
//                //System.out.println(key + " : " + value); 
//                
//                sockCount = sockCount+value;
//            } 
//    		
//    		return sockCount;
//
//    }
//    
//    private static final Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) throws IOException {
//       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//    		
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//       // System.out.println();
//       // System.out.println("************n = " + n + " **************");
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            //System.out.println(arItem);
//            ar[i] = arItem;
//        }
//      
//        
//        //System.out.println("************Array created**************");
//        int result = sockMerchant(n, ar);
//        System.out.println(result);
//
//        //bufferedWriter.write(String.valueOf(result));
//       // bufferedWriter.newLine();
//
//        //bufferedWriter.close();
//
//        scanner.close();
//    }
//}
