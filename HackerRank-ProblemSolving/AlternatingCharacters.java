import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {
	public static void main(String [] args) {
		String a="ABABAB";
		int count=0;
		char [] aCharArray = a.toCharArray();
		for(int i=0;i<aCharArray.length-1; i++) {
			if(aCharArray[i]-aCharArray[i+1]==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
