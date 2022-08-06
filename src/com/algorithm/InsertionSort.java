package com.algorithm;

public class InsertionSort{
	
public static void insertionsort(int array[]) {
	
		int n=array.length;
		for(int j=1; j<n; j++) {
			int key=array[j];
			int i=j-1;
			while((i>-1)&&(array[i]>key)) {
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
	}
	public static void main(String[] args) {
		int[] arr= {15,26,4,2,8,56,34,9};
		System.out.println("Before Insertion Sort");
		for(int i:arr) {
			System.out.println(i+"");
		}
		System.out.println();
		insertionsort(arr);
		System.out.println("After Insertion Sort:");
		for(int i:arr) {
			System.out.println(i+"");
		}
	}
}
