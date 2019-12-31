import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = new char[] { 'a', 'a', 'a', 'b', 'c' };
		 int anchor = 0, write = 0;
	        for (int read = 0; read < chars.length; read++) {
	            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
	                chars[write++] = chars[anchor];
	                if (read > anchor) {
	                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
	                        chars[write++] = c;
	                    }
	                }
	                anchor = read + 1;
	            }
	        }
	        System.out.println(write);
	        for (int i = 0; i < write; i++) {
				System.out.println(chars[i]);
				//System.out.println();
	        }
	        
	}
}
	
	/*
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < chars.length; i++) {
			Character c = Character.valueOf(chars[i]);
			if (hmap.containsKey(c)) {
				hmap.put(c, new Integer(hmap.get(c) + 1));
			} else {
				hmap.put(c, new Integer(1));
			}
		}
		int count = 0;
		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			count++;
			if (entry.getValue() > 1) {
				count++;
			}
		}

		System.out.println("Count = " + count);

		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		int charIndex = 0;
		char pivot = chars[0];
		int countChar = 1;
		for (int i = 1; i < chars.length; i++) {
			charIndex = i;
			if (chars[i] == pivot) {
				countChar++;
			} else {
				pivot = chars[i];
				if (countChar == 1) {
					chars[charIndex-] = (char) countChar;
				}				
			}
		}
		for (int i = 0; i < count; i++)
			System.out.println(chars[i]);
			System.out.println();
	}

*/
