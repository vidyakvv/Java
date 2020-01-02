import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class RansomNote {
	public static void main(String[] args) {
		String [] note= new String[] {"old", "new","old"};
		String [] magazine = new String[] {"me","old","attack","new","old"};
		
		HashMap<String, Integer> noteMap = new HashMap<String, Integer>();
		HashMap<String,Integer> magazineMap = new HashMap<String,Integer>();
		
		for(int i=0;i<note.length;i++) {
			if(noteMap.containsKey(note[i])) {
				noteMap.put(note[i], new Integer(noteMap.get(note[i])+1));
			}
			else {
				noteMap.put(note[i], 1);
			}
		}	
		
		for(String i:magazine) {
			if(magazineMap.containsKey(i)) {
				magazineMap.put(i, new Integer(magazineMap.get(i)+1));
			}
			else {
				magazineMap.put(i, 1);
			}
		}
		
		int loopCount=0;
		for(String i:note) {
			
			if(magazineMap.containsKey(i)) {
				if(magazineMap.get(i)>=noteMap.get(i)) {
					loopCount++;
					if(loopCount==note.length) {
						System.out.println("YES");
					}
					continue;
				}
				else {
					loopCount=0;
					System.out.println("NO");
					break;
				}
			}
			else {
				loopCount=0;
				System.out.println("NO");
				break;
			}
			
		}
		
//		for(Map.Entry<String, Integer> entry : noteMap.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//		
//		for(Map.Entry<String, Integer> entry : magazineMap.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
			
			
			
		
		
	}

}
