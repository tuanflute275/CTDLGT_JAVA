package array;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
	
	public static int findNumbers(int[] nums) {
		int count = 0; // tạo biến đếm 
		for (int i : nums) { // duyệt m
			if(numberOfDigits(i) % 2 == 0) { // kiểm tra xem có phải số chẵn hay không ?
				count++;
			}
		}
		return count;
	}
	
	// đếm số chữ số
	// ví dụ: số 2 là có 1 chữ số, số 15 có 2 chữ số, số 100 có 3 chữ số, số 1001 có 4 chữ số...
	
	/*
	 * Ý tưởng:
	 * ví dụ 1: giả sử ta có số 1234
	 * ta lấy  1234 / 10 = 123 (dư 4)
	 * ta lấy  123 / 10 = 12   (dư 3)
	 * ta lấy  12 / 10 = 1     (dư 2)
	 * ta lấy  1 / 10 = 0      (dư 1)
	 * 
	 * 
	 * ví dụ 2: giả sử ta có số 123
	 * ta lấy  123 / 10 = 12   (dư 3)
	 * ta lấy  12 / 10 = 1     (dư 2)
	 * ta lấy  1 / 10 = 0      (dư 1)
	 * 
	 * 
	 * ví dụ 3: giả sử ta có số 12
	 * ta lấy  12 / 10 = 1     (dư 2)
	 * ta lấy  1 / 10 = 0      (dư 1)
	 * 
	 * 
	 * ví dụ 3: giả sử ta có số 1
	 * ta lấy  1 / 10 = 0      (dư 1)
	 * 
	 * 
	 * => chia đến khi = 0 và mỗi lần chia đó coi là số lượng chữ số
	 * */	

	private static int numberOfDigits(int i) {
		int count = 0;
		int result = i;
		while(result != 0) {
			result = i /10;
			i = result;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		int output = findNumbers(nums);
		System.out.println(output);
	}
}
