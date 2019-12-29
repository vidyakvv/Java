package com.vidya.sort;

import java.util.Scanner;

public class InsertionSort{
	
	static void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key = a[i];
			int j;
			for(j=i-1; j>=0 && a[j] >key ;j--) {
				a[j+1] =a[j];
				
			}
			a[j+1] = key;
		}
	}
	
	
	
	/*public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arr = new int[arraySize];
		
		for(int i =0; i< arraySize;i++) {
			arr[i]= sc.nextInt();
		}
		
		sc.close();		
		insertionSort(arr);
		System.out.println("Sorted Array: ");
		
		for (int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
	}*/
	
}