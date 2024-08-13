package test;

import java.util.Scanner;

public class dequy_search {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int target;

		System.out.println("Nhap vao so can tim: ");
		Scanner sc = new Scanner(System.in);
		target = sc.nextInt();

		System.out.println("\nVi tri cua so la: " + search(a, target, 0, a.length));
	}

	private static int search(int[] a, int target, int left, int right) {
		if (left == right) {
			if (left == target) {
				return left;
			} else {
				return -1;
			}
		} else {
			int mid = left + (right - left) / 2;
			if(a[mid] == target) {
				return mid;
			}else {
				if(a[mid] > target) {
					return search(a, target, left, right -1);
				}else {
					return search(a, target, left + 1, right -1);
				}
			}
		}
	}
}
