package sort;

public class insertSort {

	private static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) { // Vòng lặp này bắt đầu từ phần tử thứ hai (chỉ số 1) và lặp qua tất cả các phần tử của mảng array.
			int j = i; // j được khởi tạo bằng i. Biến này sẽ được sử dụng để so sánh và di chuyển các phần tử trong mảng.
			// Vòng lặp while kiểm tra hai điều kiện
			// j lớn hơn 0 (để đảm bảo không truy cập phần tử ngoài mảng).
			// array[j] nhỏ hơn hoặc bằng array[j - 1] (để xác định xem phần tử hiện tại có cần di chuyển về phía trước hay không).
			while (j > 0 && array[j] <= array[j - 1]) {
				// Hoán đổi các phần tử
				// Nếu các điều kiện trong vòng lặp while được thỏa mãn, các phần tử array[j] và array[j - 1] được hoán đổi vị trí.
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
				j--; // j sau đó được giảm đi 1 để tiếp tục kiểm tra và di chuyển phần tử cho đến khi tìm được vị trí thích hợp
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
		insertSort(array);

		System.out.println("Mảng sau khi sắp xếp là: \n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
