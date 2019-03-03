package leetcode;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};
		System.out.println(f(nums));
	}

	
	public static int f(int[] nums){
		int len = nums.length;
		int[] sum = new int[len];
		int res= 0;
		
		for (int i = 0; i < sum.length; i++) {
			if(i==1 || i==0){
				sum[i] = nums[i];
			}else{
				int max = 0;
				for(int j=0;j<i-1;j++){
					if(max<sum[j]) max=sum[j];
				}
				sum[i] = max +nums[i];
				res = Math.max(res, sum[i]);
			}
		}
		return res;
	}
}
