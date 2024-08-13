package array;

public class _27_Remove_Element {

	public static int removeElement(int[] nums, int val) {
		int n = nums.length;
		for (int i = 0; i < n;) {
			if (nums[i] == val) {
				// xóa phần tử nums[i] => trống => dồn mảng lùi 1 index
				// dồn tất cả các phần tử từ nums[i+1] đến n - 1 về phía nums[i]
				// => nums[i] = nums[i+1]
				for (int j = i; j < (n - 1); j++) {
					nums[j] = nums[j + 1];
				}
				n--;
				// nếu xóa thì giữ nguyên vị trí index 
			} else {
				// không phải là xóa thì tăng i++
				i++;
			}
		}
		return n;
	}

	public static void main(String[] args) {

		/*
		 * Input: nums = [0,1,2,2,3,0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_]
		 * 
		 * 
		 * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_]
		 * 	
		 */
		int[] nums = {3,2,2,3};
		int val = 3;
		int result = removeElement(nums, val);
		for (int item : nums) {
			System.out.print(item + " ");
		}
		System.out.println("\nResult ==> "+result);
	}
}
