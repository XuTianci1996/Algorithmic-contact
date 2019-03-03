package leetcode;

public class RotateArray {

	public static void main(String[] args) {

	}

	public void rotate(int[] nums, int k) {
		k%=nums.length;
        for (int i = 0; i < k; i++) {
			int t = nums[nums.length-1];
			for (int j = nums.length-1; j >0; j++) {
				nums[j]=nums[j-1];
			}
			nums[0]=t;
		}
    }
}
