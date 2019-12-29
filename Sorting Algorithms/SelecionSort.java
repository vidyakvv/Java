package com.vidya.sort;

import java.util.Scanner;


public class SelecionSort {
	
	static void selectionSort(int[] a) {
		
		for(int i=0; i<a.length-1;i++) {
			int minIndex =i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minIndex]) {
					minIndex =j;
				}
			}
			int temp = a[i];
			a[i]= a[minIndex];
			a[minIndex]= temp;
		}
		
	}
	

	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arr = new int[arraySize];
		
		for(int i =0; i< arraySize;i++) {
			arr[i]= sc.nextInt();
		}
		
		sc.close();		
		selectionSort(arr);
		System.out.println("Sorted Array: ");
		
		for (int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}

	}*/
}
