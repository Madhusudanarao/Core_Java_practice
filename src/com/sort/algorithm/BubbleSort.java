package com.sort.algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {1,2,9,4,8,7};
		a= bubbleSort(a,6);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

	private static int[] bubbleSort(int[] a, int n) {
		for(int i = 0;  i < n-2; i++){
			 for(int j = 0; j<n-1; j++){
				 int temp;
				 if(a[j] > a[j+1]){
					 temp = a[j];
					 a[j] = a[j+1];
					 a[j+1] = temp;
				 }
			 }
		}
		return a;
	}

}
