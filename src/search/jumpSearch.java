package search;

import java.util.Scanner;

public class jumpSearch {

	private static int jumpSearch(int[] array, int x) {
		int d = 3; // buoc nhay
		int i = 0;
		int j = i + d;

		while (j < array.length && array[j] < x) {
			i += d;
			j += d;
		}

		if (j >= array.length)
			j = array.length - 1;

		while (array[i] < x) {
			i++;
			if (i >= array.length || i > j)
				return -1;
		}

		if (array[i] == x)
			return i;
		else
			return -1;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào giá trị cần tìm: ");
		x = sc.nextInt();

		System.out.println("\nVị trí của phần tử là: " + jumpSearch(array, x));
	}
}
