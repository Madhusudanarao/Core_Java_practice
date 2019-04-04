package com.sort.algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {9,12,5,1,2,8};
		a = sort(a,6);
		for(int i = 0; i<a.length-1; i++){
			System.out.println(a[i]);
		}
		System.out.println(a.toString());
		
	}

	private static int[] sort(int[] a, int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min]= temp;
		}
		return a;

	}

}
