import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class stringIntro {

	public static void main(String[] args) {
		
/*---------------------length(), compareTo---------------*/ 
		
		/* str1.compareTo(str2) returns int, compares lexically
		 * return 0 , if str1==str2
		 * returns positive int, if str1>str2
		 * returns negative int, if str1<str2
		 */
		
		/*String A="hello";
		String B = "java";
		int totalLength = A.length() + B.length();
		int compare = 0;
		String comp = "";
		compare = A.compareTo(B);
		if (compare > 0) {
			comp = "Yes";
		} else {
			comp = "No";
		}
		String finalA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String finalB = B.substring(0,1).toUpperCase() + B.substring(1);
		String finalAB = finalA +" "+ finalB;

		
		System.out.println(totalLength);
		System.out.println(comp);
		System.out.println(finalAB);*/
		
		/*-------------------------substring-----------------------*/
		/* str="hello"
		 * str.substring(1,3) returns "el" (position 1 till 3-1)
		 */
		/*String str="hello";
		System.out.println(str.substring(1,3));
		System.out.println(str.substring(1));*/
		
		   String S="welcometojava";
		   //System.out.println(S.length());
		   int k =3;
		   String smallest = "";
		   String largest = "";
		        
		   // Complete the function
		   // 'smallest' must be the lexicographically smallest substring of length 'k'
		   // 'largest' must be the lexicographically largest substring of length 'k'
		   String reqString = S.substring(0,k);
		   smallest = reqString;
		   largest = reqString;
		  for(int i=1; i<=S.length()-k;i++) {
			  reqString = S.substring(i,i+k);
			  if(reqString.compareTo(largest)>0) {
				  largest= reqString;
			  }
			  if(reqString.compareTo(smallest)<0)
				  smallest=reqString;
		  }
		        
		  System.out.println(smallest + "\n" + largest);
	 
		
	}
}
