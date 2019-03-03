package leetcode;

import java.awt.event.ActionListener;

public class Gas_station134 {

	/**
	 * 在一条环路上有 N 个加油站，其中第 i 个加油站有汽油 gas[i] 升。

	你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。

	如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] gas  = {3,3,4};
		int[] cost = {3,4,4};
		System.out.println(canCompleteCircuit(gas, cost));
		
	}
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {
//		int rest = 0, run = 0, start = 0;
//	    for (int i = 0; i < gas.size(); ++i){
//	        run += (gas[i] - cost[i]);
//	        rest += (gas[i] - cost[i]);
//	        if (run < 0){
				//
//	            start = i + 1;
//	            run = 0;
//	        }
//	    }
//	    return rest < 0 ? -1: start;
        int left=0;
		for (int i = 0; i < gas.length; i++) {
			if(gas[i]<cost[i]) continue;
			else{//gas[i]>=cost[i]
				left=0;
				left += gas[i]-cost[i];
				for(int j=1;j<gas.length&&left>=0;j++){
					left+=gas[(i+j)%gas.length]-cost[(i+j)%gas.length];
				}
				if(left<0) continue;
				if(left>=0) return i;
			}
		}
		return -1;
    }
}
