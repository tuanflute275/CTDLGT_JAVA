package array;

public class _88_Merge_Sorted_Array {
	
	/*
	 * n1 = 1, 2, 6, 0, 0, 0
	 * n2 = 2, 0, 3
	 * 
	 * duyệt mảng n1
	 * lần 1: 
	 * nó sẽ lấy số 2 chèn vào cái mảng n1
	 * so sánh nếu số 2 nhỏ 1 số nào đó trong mảng n1 thì tất cả các phần tử tại vị trí đó trờ về cuối mảng sẽ bị đẩy sang phải 1 đơn vị index
	 * a[i+1] = a[i]
	 * ==> mảng sau khi duyệt lần 1 là: 1, 2, 2, 6, 0, 0
	 * 
	 * 
	 * lần 2: 
	 * sẽ lấy số 0 so sánh với mảng n1 và bắt đầu chèn vào
	 * ở trường hợp này số 0 sẽ nhỏ hơn số 2 vậy thì tất cả các số từ số 2 trở về sau sẽ tiến thêm1 đơn vị index
	 * mảng sau khi duyệt lần 1 là: 1, 2, 2, 6, 0, 0 ==> null, 1, 2, 2, 6, 0, 0 => chèn phần tử n2 (giá trị là 0) vào null
	 * sau khi duyệt lần 2 sẽ là: 0, 1, 2, 2, 6, 0
	 * 
	 * 
	 * lần 3: 
	 * sẽ lấy số 3 so sánh với mảng n1 và bắt đầu chèn vào
	 * ở trường hợp này số 0 sẽ nhỏ hơn số 3 vậy thì tất cả các số từ số 3 trở về sau sẽ tiến thêm1 đơn vị index
	 * sau khi duyệt lần 2 sẽ là: 0, 1, 2, 2, 6, 0 ==> 0, 1, 2, 2, null, 6 => chèn phần tử n2 (giá trị là 3) vào null
	 * sau khi duyệt lần 2 sẽ là: 0, 1, 2, 2, 3, 6
	 * 
	 * 
	 * */

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int item : nums2) {
			insertElementInArray(item, nums1, m);
			m++;
		}
	}

	private static void insertElementInArray(int x, int[] a, int m) {
		boolean isCheck = false;
		for (int k = 0; k < m; k++) {
			if(a[k] > x) {
				isCheck = true;
				for (int i = m-1; i >= k; i--) {
					a[i+1] = a[i];
				}
				a[k] = x;
				break;
			}
		}
		if(!isCheck) {
			a[m] = x;
		}
	}

	public static void main(String[] args) {
		int nums1[] = {1,2,6,0,0,0};
		int nums2[] = {2,0,3};
		
		merge(nums1, 3, nums2, 3);
		for (int i : nums1) {
			System.out.print(i + " ");
		}
		System.out.println("\nDONE");
	}
}
