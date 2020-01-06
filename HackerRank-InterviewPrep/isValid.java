import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class isValid {
	public static String isvalid(String s) {
		String valid="YES";
		HashMap<Character , Integer> hmap = new HashMap <Character , Integer>();
		for(int i=0; i<s.length();i++) {
			if(hmap.containsKey(s.charAt(i))) {
				hmap.put(s.charAt(i), new Integer(hmap.get(s.charAt(i))+1));
			}
			else {
				hmap.put(s.charAt(i), new Integer(1));
			}
		}
		Integer first = hmap.get(s.charAt(0));
		int change = 0;
		int oneTime=0;
		int times=0;
		for (Integer value : hmap.values()) {
			System.out.println(value);
			if(value-first>-1) {
				if(value==1) {
					oneTime++;
					valid="YES";
				}
			}
			if(value-first==-1) {
				times++;
				if(times==hmap.size()-1) {
					valid="YES";
				}
				else {
					valid="NO";
				}
				if(times==1) {
					valid="YES";
				}
			}
			if((value-first)==1) {
				change++;
			}
			if(((Math.abs(value-first)>1)&&(oneTime>1)) || (change >1)){
				valid="NO";
				break;
			}
			
		}
		return valid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isvalid("aaaabbcc"));
	}

}
