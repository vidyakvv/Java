import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {
	public static void main(String[] args) {
		String a = "abbrw";
		String b = "abbute";
		HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();
		
		for(int i =0; i<a.length(); i++) {
			if(!aMap.containsKey(a.charAt(i))) {
				aMap.put(a.charAt(i), 1);
			}
			else {
				aMap.put(a.charAt(i), (aMap.get(a.charAt(i))+1));
			}
		}
		for(int i =0; i<b.length(); i++) {
			if(!bMap.containsKey(b.charAt(i))) {
				bMap.put(b.charAt(i), 1);
			}
			else {
				bMap.put(b.charAt(i), (bMap.get(b.charAt(i))+1));
			}
		}
		int count=0;
		
		
		for (Map.Entry<Character, Integer> entry: aMap.entrySet()){
			if(bMap.containsKey(entry.getKey())) {
				if(entry.getValue() != bMap.get(entry.getKey())){
					count = count + (int)Math.abs((entry.getValue()-bMap.get(entry.getKey())));
				}
			bMap.put(entry.getKey(), Integer.valueOf(0));
			}
			else {
				count = count + (int)entry.getValue();
			}
		}
		
		
		for (Map.Entry<Character, Integer> entry: bMap.entrySet()) {
			count = count + (int)entry.getValue();
		}
		System.out.println(count);
		
	}
}
//try this
/*import java.util.Scanner;
public class Solution {
	public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}*/
/*
public static int numberNeeded(String first, String second) {
	HashMap<Character, Integer> hm=new HashMap<>();
	int count=0;
	for(int i=0;i<first.length();i++){
		if(!hm.containsKey(first.charAt(i))){
			hm.put(first.charAt(i), 1);
		}else{
			hm.put(first.charAt(i),hm.get(first.charAt(i))+1);
		}
	}
	for(int i=0;i<second.length();i++){
		if(!hm.containsKey(second.charAt(i))){
			count++;
		}else{
			hm.put(second.charAt(i),hm.get(second.charAt(i))-1);
		}
	}
	for(Entry<Character,Integer> entry:hm.entrySet()){
		if(entry.getValue()!=0){
			count+=Math.abs(entry.getValue());
		}
	}
	return count;
}*/