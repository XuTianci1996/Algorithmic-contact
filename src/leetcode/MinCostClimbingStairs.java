package leetcode;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		int[] cost = {10,15,20};
		System.out.println(minCostClimbingStairs(cost));
	}
	
	public static int minCostClimbingStairs(int[] cost) {
        int[] res = new int[cost.length]; 
        for (int i = 0; i < res.length; i++) {
			if(i==1 || i ==0) {
				res[i] = cost[i];
			//	System.out.println(res[i]);
			}else {
				res[i] = Math.min(res[i-1], res[i-2])+cost[i];
			//	System.out.println(res[i]);
			}
		}
        return Math.min(res[res.length-2], res[res.length-1]);
    }

}
