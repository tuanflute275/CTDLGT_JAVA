package search;

import java.util.Scanner;

// tìm kiếm tuần tự
public class linearSearch {

	// nhận vào 1 mảng và 1 giá trị tìm kiếm
	public static int linearSearch(int array[], int x) {
		for (int i = 0; i < array.length; i++) {
			if (x == array[i]) { // kiểm tra nếu x là giá trị cần tìm mà trùng với 1 giá trị nào đó trong mảng
				return i; // thì return về vị trí của phần tử đó

			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào giá trị cần tìm: ");
		x = sc.nextInt();

		System.out.println("\nVị trí của phần tử là: " + linearSearch(array, x));
	}
}
