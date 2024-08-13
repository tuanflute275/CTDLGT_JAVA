package recursive; // đệ quy

import java.util.Scanner;

// Tìm Kiếm Nhị Phân Bằng Đệ Quy
public class search {

	private static int binarySearch(int[] array, int x, int left, int right) {
		if (left == right) {   // Kiểm tra nếu left và right là bằng nhau, Nếu left bằng right, nghĩa là phạm vi tìm kiếm chỉ còn một phần tử.
			if (left == x) { // Kiểm tra xem giá trị tại chỉ số left (hoặc right vì chúng bằng nhau) có bằng x không. 
				return left; //Nếu có, trả về left,
			} else {
				return -1; //  nếu không, trả về -1.
			}
		} else {
			int mid = left + (right - left) / 2;  // Tính toán chỉ số giữa
			if (array[mid] == x) { // Nếu giá trị tại mid bằng x, 
				return mid; // trả về mid.
			} else {
				// Gọi đệ quy cho nửa còn lại của mảng
				if (array[mid] < x) { // Nếu giá trị tại mid nhỏ hơn x, 
					return binarySearch(array, x, mid + 1, right); // tiếp tục tìm kiếm trong nửa phải của mảng
				} else { // Nếu giá trị tại mid lớn hơn x, 
					return binarySearch(array, x, left, mid - 1); // tiếp tục tìm kiếm trong nửa trái của mảng
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào giá trị cần tìm: ");
		x = sc.nextInt();

		System.out.println("\nVị trí của phần tử là: " + binarySearch(array, x, 0, array.length));
	}
}
