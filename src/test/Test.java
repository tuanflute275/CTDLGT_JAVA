package test;

public class Test {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < nums2.length; i++) {
			insert(nums2[i], nums1, m);
			m++;
		}
	}


	private static void insert(int x, int[] nums, int m) {
		boolean isCheck = false;
		for (int i = 0; i < m; i++) {
			if(x < nums[i]) {
				isCheck = true;
				for (int j = m-1; j >= i; j--) {
					nums[j+1] = nums[j];
				}
				nums[i] = x;
				break;
			}
		}
		if(!isCheck) {
			nums[m] = x;
		}
	}


	public static void main(String[] args) {
		int nums1[] = {2, 8, 10, 0, 0, 0, 0};
		int nums2[] = {6, 0, 4, 12};
		
		merge(nums1, 3, nums2, 4);
		for (int i : nums1) {
			System.out.print(i + " ");
		}
		System.out.println("\nDONE");
	}
}
