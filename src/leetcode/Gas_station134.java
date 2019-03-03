package leetcode;

import java.awt.event.ActionListener;

public class Gas_station134 {

	/**
	 * ��һ����·���� N ������վ�����е� i ������վ������ gas[i] ����

	����һ�������������޵ĵ��������ӵ� i ������վ������ i+1 ������վ��Ҫ�������� cost[i] ����������е�һ������վ��������ʼʱ����Ϊ�ա�

	���������ƻ�·��ʻһ�ܣ��򷵻س���ʱ����վ�ı�ţ����򷵻� -1��
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
