package leetcode;

public class HouseRobberII {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}

	 public static int rob(int[] nums) {
		 int x= rob(nums,0,nums.length-2);
		 int y= rob(nums,1,nums.length-1);
		 return x>y?x:y;
	 }

	public static int rob(int[] num, int n, int m) {
		System.out.println(n + ":" + m);
		int len = num.length - 1;
		System.out.println(len);
		int[] nums = new int[len];
		int x = 0;
		for (int i = n; i <= m; i++) {
			nums[x++] = num[i];
		}
		int[] sum = new int[len];
		int res = 0;

		for (int i = 0; i < sum.length; i++) {
			if (i == 1 || i == 0) {
				sum[i] = nums[i];
				res = Math.max(res, sum[i]);
			} else {
				int max = 0;
				System.out.println(i);
				for (int j = 0; j < i - 1; j++) {
					if (max < sum[j])
						max = sum[j];
				}
				sum[i] = max + nums[i];
				res = Math.max(res, sum[i]);
			}
		}
		return res;
	}
}
