package 算法;

public class Dp {

	/**
	 * 打家劫舍问题：
	 * {1,2,4,1,7,8,3}
	 * 每次抢劫不能抢劫相邻的位置，求抢劫的最大金额
	 * @param args
	 */
	
	public static void main(String[] args) {
		//int[] arr = {1,2,4,1,7,8,3};
		int[] arr = {4,1,1,9,1};
		//System.out.println(opt1(arr,arr.length-1));
		//System.out.println(opt2(arr));
		System.out.println(f(arr,19,0));
	}

	public static int opt1(int[] arr,int index){
		if(index==0) return arr[0];
		if(index==1) return arr[0]>arr[1]?arr[0]:arr[1];
		return Math.max(opt1(arr,index-2)+arr[index], opt1(arr,index-1));
	}
	
	public static int opt2(int[] arr){
		int max = Integer.MIN_VALUE;
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = arr[0]>arr[1]?arr[0]:arr[1];
		for(int i=2;i<dp.length;i++){
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
			if(dp[i]>max) max = dp[i];
		}
		return max;
	}
	
	public static boolean f(int[] arr,int s,int index){
		if(s==0) return true;
		if(index==arr.length-1) return false;
		return f(arr,s-arr[index],index+1)||f(arr,s,index+1);
	}
	
	public static boolean f2(int[] arr,int s,int index){
		 
	}
}
