package leetcode;

public class ToSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,6,3,7};
		int target = 7;
		int[] arry = twoSum(a,target);
		System.out.println(arry[0]+" "+ arry[1]);
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					int[] array = { i, j };
					return array;
				}
			}
		}
		return nums;
	}
}
