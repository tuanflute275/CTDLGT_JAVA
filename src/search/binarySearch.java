package search;

import java.util.Scanner;


// Thuật Toán Tìm Kiếm Nhị Phân 
public class binarySearch {

	private static int binarySearch(int[] array, int x) {
		int left = 0; // lấy vị trí đầu
		int right = array.length - 1; // lấy vị trí cuối

		while (left <= right) { // kiểm tra điều kiện xem vị trí đầu nhỏ hơn vị trí cuối thì thực hiện tiếp
			int middle =  left + (right - left) / 2;  // lấy vị trí giữa mảng
			if(array[middle] == x) { // kiểm tra giá trị của mảng tại vị trí middle, nếu trùng với kết quả nhập vào x
				return middle;  // thì trả về vị trí của middle
			}
			
			if(array[middle] < x) { // kiểm tra nếu giá trị tại vị trí middle mà nhỏ hơn giá trị x
				left = middle + 1; // thì gán lại cho left = giá trị middle + 1
			}
			
			if(array[middle] > x) { // kiểm tra nếu giá trị tại vị trí middle mà lớn hơn giá trị x
				right = middle + 1; // thì gán lại cho right = giá trị middle - 1
			}
		}
		return -1;
	}

	/*
	 * binarySearch tư tưởng là cứ chia đôi mảng rồi tìm
	 * ===========>      tìm số 6   <==============
	 * 
	 * arr = [1, 2, 3, 4, 5, 6, 7]; mảng bắt đầu từ 0 ==> left = 0 độ dài mảng coi như
	 * vị trí cuối của mảng ==> right = arr.length
	 * 
	 * while loop nếu như 0 < arr.length thì tiếp tục thực hiện các lệnh trong while
	 * 
	 * middel = (left + rigth) / 2 = ( 0 + 6 ) / 2 = 6 / 2 = 3
	 *  kiểm tra tại vị trí 3 có giá trị là 4
	 *  số 4 nhỏ hơn 6 , giá trị 6 nằm phía bên phải 
	 *  ===> vì vậy ta loại bỏ phần bên trái middle
	 *  ===> left = middle + 1
	 *  
	 *  
	 *  
	 *  Giả sử tìm số 2 
	 *  kiểm tra tại vị trí 3 có giá trị là 4
	 *  số 4 lớn hơn 2 , giá trị 2 nằm phía bên trái 
	 *  ===> vì vậy ta loại bỏ phần bên phải middle
	 *  ===> right = middle - 1
	 *  
	 *  
	 *  thoát khỏi while, nếu vẫn không thỏa mã thì trả về -1
	 */

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào giá trị cần tìm: ");
		x = sc.nextInt();

		System.out.println("\nVị trí của phần tử là: " + binarySearch(array, x));
	}
}
