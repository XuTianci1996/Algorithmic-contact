package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxProfit3 {

	public static void main(String[] args) {
		int[] prices = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < prices.length-1; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if(prices[j]-prices[i]>0){
					list.add(prices[j]-prices[i]);
				}
			}
        }
        if(list.size()==0) return 0;
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
        Arrays.sort(arr);
        if(arr.length<2) return arr[0];
        return arr[arr.length-1]+arr[arr.length-2];
    }
}
