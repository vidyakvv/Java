package com.vidya.sort;

import java.util.Scanner; 

public class MergeSort{
	
	public static void mergeSort(int f, int l, int[] a) {
		//int size= a.length;
		
		if(f<l) {
			
			int m = (f+l)/2;
			mergeSort(f,m,a);
			mergeSort(m+1,l,a);
			merge(f,m,l,a);
			
		}
		
	}
	
	
	public static void merge(int f,int m, int l, int[] ar) {
		int fSize = m-f+1;
		int lsize = l-m;
		
		int [] fAr = new int[fSize];
		int [] lAr = new int[lsize];
		
		for(int i=0;i<fSize;i++) {
			fAr[i]=ar[f+i];
		}
		for(int j=0;j<lsize;j++) {
			lAr[j]=ar[m+1+j];
		}
		
		int i=0,j=0;
		int k =f;
		while(i<fSize && j<lsize) {
			if(fAr[i]<lAr[j]) {
				ar[k]=fAr[i];
				i++;
			}
			else {
				ar[k]=lAr[j];
				j++;
			}
			k++;
		}
		
		while(i<fSize) {
			ar[k]=fAr[i];
			k++;
			i++;
		}
		
		while(j<lsize) {
			ar[k]=lAr[j];
			k++;
			j++;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int size= sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
		
		int firstIndex=0;
		int lastIndex = size-1;
		
		mergeSort(firstIndex,lastIndex,arr);
		
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
}

