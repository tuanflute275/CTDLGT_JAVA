package search;

import java.util.Scanner;

// Thuật Toán Tìm Kiếm Nhảy 
public class jumpSearch {

	private static int jumpSearch(int[] array, int x) {
		//  Khởi tạo các biến
		int d = 3; // d là bước nhảy (ở đây là 3)
		int i = 0; // i là chỉ số bắt đầu
		int j = i + d; //j là chỉ số kết thúc của bước nhảy, được khởi tạo bằng i + d 

		/* Nhảy qua các phần tử của mảng
		  
		  	Vòng lặp while này nhảy qua các phần tử của mảng bằng cách tăng i và j thêm d cho đến khi:
		  	
			j vượt quá độ dài của mảng, hoặc
			
			array[j] lớn hơn hoặc bằng giá trị cần tìm x.
		 */
		while (j < array.length && array[j] < x) {
			i += d;
			j += d;
		}

		// Điều chỉnh chỉ số j nếu nó vượt quá độ dài của mảng
		// Nếu j vượt quá độ dài của mảng, nó được đặt lại bằng chỉ số của phần tử cuối cùng
		if (j >= array.length)
			j = array.length - 1;

		// Tìm kiếm tuyến tính(tìm kiếm tuần tự) trong khoảng từ i đến j
		while (array[i] < x) { //Vòng lặp while này kiểm tra từng phần tử từ i đến j
			i++; // Nếu array[i] < x, tăng i.
			if (i >= array.length || i > j)  
				return -1; // Nếu i vượt quá độ dài của mảng hoặc vượt qua j, trả về -1 (không tìm thấy x).
		}

		// Kiểm tra phần tử tìm thấy
		if (array[i] == x)
			return i; // Nếu array[i] bằng x, trả về chỉ số i.
		else
			return -1; // Nếu không, trả về -1 (không tìm thấy x).
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
