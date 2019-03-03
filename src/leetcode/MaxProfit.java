package leetcode;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices={7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
//        int max = 0;
//        for (int i = 0; i < prices.length-1; i++) {
//			for (int j = i+1; j < prices.length; j++) {
//				if(prices[j]-prices[i]>0){
//					max = max >(prices[j]-prices[i])?max:(prices[j]-prices[i]);
//				}
//			}
//		}
//        return max;
		if (prices == null || prices.length < 2) return 0;
        int min = prices[0], max = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) 
                min = Math.min(prices[i], min);
            if (prices[i] > prices[i - 1]) {
                max = prices[i];
                profit = Math.max(prices[i] - min, profit);
            }
        }
        
        return profit;
    }
}
