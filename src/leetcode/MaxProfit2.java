package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProfit2 {

	public static void main(String[] args) {
		int[] prices={3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int profit=0;
        boolean IsBuy = false;
        int min=0;
        int max=0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < prices.length-1; i++) {
			if(prices[i]<prices[i+1] && !IsBuy){
				min = prices[i];
				IsBuy = true;
			}
			if(prices[i]>prices[i+1] && IsBuy){
				max = prices[i];
				IsBuy = false;
				profit = max-min;
				list.add(profit);
			}else if(i==prices.length-2 && IsBuy){
				profit = prices[i+1]-min; 
				list.add(profit);
			}
		}
        if(list.size()==0) return 0;
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
        	System.out.println(list.get(i));
			arr[i] = list.get(i);
			System.out.println(arr[i]);
		}
        Arrays.sort(arr);
        if(arr.length<2) return arr[0];
        return arr[arr.length-1]+arr[arr.length-2];
    }
}
