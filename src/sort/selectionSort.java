package sort;

public class selectionSort {
	public static void selectionSort(int[] array) {
		// Vòng lặp ngoài bắt đầu từ chỉ số 0 và chạy tới array.length - 1.
		// Chỉ số i xác định vị trí hiện tại của phần tử cần được sắp xếp.
		for (int i = 0; i < array.length - 1; i++) {
			// Khởi tạo biến i_min và v_min
			int i_min = i; // i_min giữ chỉ số của phần tử nhỏ nhất tìm thấy trong vòng lặp bên trong.
			int v_min = array[i]; // v_min giữ giá trị của phần tử nhỏ nhất tìm thấy trong vòng lặp bên trong.
			// Vòng lặp bên trong để tìm phần tử nhỏ nhất
			for (int j = i; j < array.length; j++) { // Vòng lặp bên trong bắt đầu từ chỉ số i và chạy tới cuối mảng.
				if(array[j] < v_min) { // Nếu phần tử tại array[j] nhỏ hơn v_min, 
					v_min = array[j]; // cập nhật v_min và i_min với giá trị và chỉ số của phần tử nhỏ hơn.
					i_min = j;
				}
			}
			// Hoán đổi phần tử nhỏ nhất với phần tử tại vị trí i
			// Sau khi tìm thấy phần tử nhỏ nhất trong phần chưa sắp xếp của mảng, 
			// hoán đổi phần tử đó với phần tử đầu tiên của phần chưa sắp xếp (tại chỉ số i).
			int temp = array[i];
			array[i] = array[i_min];
			array[i_min] = temp;
		}
	}

	
	public static void main(String[] args) {
		int array[] = { 45, 10, 5, 35, 40, 30, 25, 15, 20, 50 };

		System.out.print("Mảng ban đầu là: \n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n");
		selectionSort(array);

		System.out.println("Mảng sau khi sắp xếp là: \n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
