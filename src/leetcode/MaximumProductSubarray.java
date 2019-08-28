package leetcode;

public class MaximumProductSubarray {

	public static void main(String[] args) {

	}

	public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
        	if(nums[i]<0){
        		int t = max;
        		max = min;
        		min = t;
        	}
        	min = Math.min(min*nums[i], nums[i]);
        	max = Math.max(max*nums[i], nums[i]);
        	res = res>max? res:max;
        }
        
        return res;
    }
}
