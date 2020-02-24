package com.qa.mergeSort;

public class MegeSort {
	public static void mergeSort(int ar[]) {
		int n = ar.length;
		if (n < 2) {
			return;
		}
		int i;
		int mid = n / 2;
		int leftPart[] = new int[mid];
		int rightPart[] = new int[n - mid];
		for (i = 0; i < mid; i++)
			leftPart[i] = ar[i];
		for (i = mid; i < n; i++)
			rightPart[i - mid] = ar[i];
		mergeSort(leftPart);
		mergeSort(rightPart);
		merge(leftPart, rightPart, ar);
	}

	public static void merge(int leftHalf[], int rightHalf[], int sortedAr[]) {
		int nL = leftHalf.length;
		int nR = rightHalf.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (leftHalf[i] <= rightHalf[j]) {
				sortedAr[k] = leftHalf[i];
				i++;
			} else {
				sortedAr[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			sortedAr[k] = leftHalf[i];
			i++;
			k++;
		}
		while (j < nR) {
			sortedAr[k] = rightHalf[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		int ar[]= {-11,-8,-13,-5,-7,-4,-9,-11};
		mergeSort(ar);
		for(int a=0;a<ar.length;a++) {
			System.out.print(ar[a]+" ");
		}
//		for(int a:ar) {
//			System.out.print(ar[a]+" ");
//		}
	}
}
