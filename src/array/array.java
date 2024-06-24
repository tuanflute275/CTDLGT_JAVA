package array;




public class array {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] numberCopy = numbers.clone(); // clone là copy mảng thanhf mảng mới

//		hiển thị mảng
		for (int i = 0; i < numberCopy.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
