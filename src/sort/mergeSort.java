package sort;

import java.util.Iterator;
import java.util.Scanner;

// Thuật Toán Sắp Xếp Trộn
public class mergeSort {

	private static void merge(int[] array, int left, int mid, int right) {
		int len_left = mid - left + 1;
		int len_right = right - mid;

		int[] array_left = new int[len_left];
		int[] array_right = new int[len_right];
		
		//
		for (int i = 0; i < len_left; i++) {
			array_left[i] = array[left + i];
		}
		for (int i = 0; i < len_right; i++) {
			array_right[i] = array[mid + 1 + i];
		}
		
		int i1 = 0;
		int i2 = 0;
		int k = left;
		
		while (i1 < len_left && i2 < len_right) {
			if(array_left[i1] < array_right[i2]) {
				array[k] = array_left[i1];
				i1++;
			}else {
				array[k] = array_right[i2];
				i2++;
			}
			k++;
		}
		
		
		//
	}

	private static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			// de quy
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

//			merge()
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target;

		System.out.println("Nhap vao so can tim: ");
		Scanner sc = new Scanner(System.in);
		target = sc.nextInt();

//		System.out.println("\nVi tri cua so la: " + mergeSort(array, 0, array.length));
	}
}
