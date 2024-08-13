package array;




public class doc {
	public static void main(String[] args) {
		
		/*
		 * 1 .Khai báo
		 * ==> định nghĩa: Mảng là một tập hợp các phần tử có cùng một kiểu
		 * */
		int[] array = new int[5]; // khai báo mảng biết trước số lượng
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // khai báo mảng và gán giá trị ngay ban đầu
		int[] arrayNull = null; // khai báo mảng và gán giá trị null
		int[] numberCopy = numbers.clone(); // clone là copy mảng
		
		int[][] array2 = null; // khai báo mảng HAI CHIỀU và gán giá trị là null
		int[][] array3 = new int[2][4]; // new int[row][col];
		// khai báo mảng hai chiểu gán giá trị hàng là 2 và cột là 4
		
		
		/* 
		 * 
		 * Các thao tác với mảng
		 * 
		 * */
		
		// hiển thị mảng
		for (int i = 0; i < numberCopy.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
