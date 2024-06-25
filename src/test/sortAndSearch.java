package test;

import java.util.Iterator;
import java.util.Scanner;

public class sortAndSearch {
	
	private static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j] <= array[j - 1]) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
				j--;
			}
		}
	}
	
	private static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			
			if(array[mid] == target) {
				return mid;
			}
			if(array[mid] < target) {
				left = mid + 1;
			}
			if(array[mid] > target) {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// cho mang sau hay sap xep va tim ra vi tri cua so 20
		int array[] = { 45, 10, 5, 35, 40, 30, 25, 15, 20, 50 };

		// sort
		insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// search
		System.out.println("\nNhap so ban muon tim: ");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		System.out.println("\nVi tri cua so " + target + " la: " + binarySearch(array, target));
	}
}
