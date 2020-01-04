import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class anagramDiff {
	static int anagdiff(int[] a) {
		int count=0;
		HashMap<Integer,Integer[]> hmap = new HashMap<Integer,Integer[]> ();
		//Integer[] array = new Integer[10];
		//Arrays.fill(array,new Integer(0));
//		for(int j=0;j<10;j++) {
//			System.out.print(array[j]+ ",");
//		}
		for (int i=0;i<a.length;i++){
			hmap.put(a[i], new Integer[10]);
			Integer[] array = hmap.get(a[i]);
			Arrays.fill(array,new Integer(0));
			int num =a[i];
			int digit =0;
			//int countIn=0;
			
			while(num!=0) {
				digit =num%10;
				Integer [] temp=hmap.get(a[i]);	
				temp[digit]++;
				//hmap.put(a[i],temp);
				num = num/10;
			}
		}
		for(Map.Entry<Integer, Integer[]> entry : hmap.entrySet()) {
			System.out.print(entry.getKey()+" :");
			int n=0;
			while(n<10) {
			System.out.print(entry.getValue()[n]+" :");
			n++;
			}
			System.out.println();
		}
		
//		for(Integer i : hmap.keySet()) {
//			System.out.print(i+ ": ");
//		}
//		for (Integer[] i : hmap.values()) {
//			System.out.print(i+ ": ");
//		}
//		for ()
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 25, 35, 872, 228, 53, 278, 872 };
		anagdiff(arr);
	}

}
