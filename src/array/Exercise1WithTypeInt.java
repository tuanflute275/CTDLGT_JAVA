package array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Exercise1WithTypeInt {
	int array[];
	int n;

	public Exercise1WithTypeInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của mảng :");
		n = scanner.nextInt();
		array = createArrayInt(n); // khởi tạo array qua phương thức createArrayInt
		printArray();
	}

	// phương thức tạo array với giá trị random
	// Random int number trong khoảng được chỉ định.
	// int value = generator.nextInt((max - min) + 1) + min;
	public int[] createArrayInt(int n) {
		Random random = new Random();
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = random.nextInt((20 - 1) + 1) + 1; // random trong khoảng 1 - 20
		}
		return temp;
	}

	// phương thức hiển thị array
	public void printArray() {
		System.out.println("=========================");
		for (int i = 0; i < array.length; i++) { // for từng giá trị và in ra màn hình
			System.out.println(array[i] + " "); // in ra mà hình
		}
	}

	// phương thức thêm 1 phần tử vào cuối array
	public void addX(int x) {
		// tăng n
		n = n + 1;
		// tạo mảng chứa dữ liệu tạm thời
		int[] temp = new int[n];
		// copy mảng array
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		// sau khi copy xong thì sẽ còn trống 1 ô cuối và trong mảng giá trị cuối là n-1
		temp[n - 1] = x; // gán giá trị cuối cùng là x
		array = temp; // gán lại giá trị array thành temp
	}

	// phương thức tính tổng 2 phân tử đầu tiên
	public void sum2FirstArray(int n) {
		int sum = 0; // khởi tạo biến sum chứa giá trị trả về
		// kiểm tra điều kiện xem có lớn hơn tổng số phần tử của mảng hay không, thỏa
		// mãn thì thực hiện
		if (n <= array.length) {
			for (int i = 0; i < n && i < array.length; i++) { // for tất cả mảng array nhưng thêm điều kiện < n
				sum += array[i]; // thực hiện cộng dồn các giá trị thỏa mãn điều kiện
			}
		} else {
			// thông báo lỗi
			System.out.println("Dữ liệu nhập vào không hợp lệ, tổng số phân tử của mảng là: " + array.length);
		}
		// hiển thị kết quả
		System.out.println("\nTổng của 2 phần tử đầu tiên là: " + sum);
	}

	// phương thức tính tổng tất cả phần tử trong mảng
	public void sumArray() {
		int sum = 0; // khởi tạo biến chứa kết quả
		for (int i = 0; i < array.length; i++) {
			sum += array[i]; // cộng dồn kết quả thỏa mãn
		}
		// hiển hị kết quả
		System.out.println("\nTổng tất cả các phần tử trong mảng là: " + sum);
	}

	// phương thức tìm min trong array
	public void minArray() {
		int min = array[0]; // lấy giá trị đầu tiên của mảng
		for (int i = 0; i < array.length; i++) { // for mảng để lấy các giá trị
			if (min > array[i]) { // kiểm tra nếu phân tử min có phải phần tử nhỏ nhất chưa , nếu chưa
				min = array[i]; // thì lấy giá trị đó gán cho biến temp
			}
		}
		// hiển thin kết quả
		System.out.println("\nGiá trị nhỏ nhất (MIN) trong mảng là: " + min);

	}

	// phương thức tìm max trong array
	public void maxArray() {
		int max = array[0]; // lấy giá trị đầu tiên của mảng
		for (int i = 0; i < array.length; i++) { // for mảng để lấy các giá trị
			if (max < array[i]) { // kiểm tra nếu phân tử max có phải phần tử lớn nhất chưa , nếu chưa
				max = array[i]; // thì lấy giá trị đó gán cho biến temp
			}
		}
		// hiển thin kết quả
		System.out.println("\nGiá trị lớn nhất (MAX) trong mảng là: " + max);
	}

	// phương thức đếm số phần tử là số chẵn.
	public void countNumberEven() {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) { // kiểm tra nếu là số chẵn
				count++; // thì tăng biến đếm lên 1
			}
		}
		// hiển thi kết quả
		System.out.println("\nSố lượng chẵn trong mảng là: " + count);
	}

	// phương thức đếm số phần tử là số lẻ.
	public void countNumberOdd() {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) { // kiểm tra nếu là số lẻ
				count++; // thì tăng biến đếm lên 1
			}
		}
		// hiển thi kết quả
		System.out.println("\nSố lượng số lẻ trong mảng là: " + count);
	}


	// main
	public static void main(String[] args) {
		Exercise1WithTypeInt exercise = new Exercise1WithTypeInt();

		// thêm phần tử
		exercise.addX(10);
		exercise.addX(20);
		System.out.println("\nMảng sau khi thêm mói thành công: ");
		exercise.printArray();

		// tính tổng n phần tử đầu tiên
		exercise.sum2FirstArray(2);

		// tính tổng các phân tử trong mảng
		exercise.sumArray();

		// tìm min
		exercise.minArray();

		// tìm max
		exercise.maxArray();

		// đếm số chẵn trong mảng
		exercise.countNumberEven();

		// đếm số lẻ trong mảng
		exercise.countNumberOdd();

	}

}
