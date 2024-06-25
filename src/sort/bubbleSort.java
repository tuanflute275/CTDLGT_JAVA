package sort;

import java.util.Iterator;

public class bubbleSort {
	private static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) { // Vòng lặp này duyệt qua các phần tử của mảng, trừ đi 1 để tránh lặp lại khi chỉ còn một phần tử cuối cùng.
			for (int j = 0; j < array.length - 1; j++) { // Vòng lặp này so sánh các cặp phần tử liền kề trong mảng (array[j] và array[j + 1]).
				if (array[j] > array[j + 1]) { // Nếu array[j] lớn hơn array[j + 1], thực hiện hoán đổi giá trị của hai phần tử này.
					// Hoán đổi các phần tử
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[] = { 45, 10, 5, 35, 40, 30, 25, 15, 20, 50 };

		System.out.print("Mảng ban đầu là: \n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n");
		bubbleSort(array);

		System.out.println("Mảng sau khi sắp xếp là: \n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
