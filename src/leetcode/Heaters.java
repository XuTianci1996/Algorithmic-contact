package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heaters {

	public static void main(String[] args) {
		int houses[]={1,2,3,4};
		int heaters[]={1,4};
		System.out.println(findRadius(houses, heaters));
	}

	public static int findRadius(int[] houses, int[] heaters) {
		 if(houses == null || houses.length == 0) return 0;
		 if(heaters.length==1){
			 return Math.max(heaters[0]-1,houses.length-heaters[0]);
		 }
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<Integer>();
        int j=0;
        for (int i = 0; i < houses.length; i++) {
			if(houses[i]==heaters[j]){
				j++;
				list.add(houses[i]);
				if(j==heaters.length) break;
			}
		}
        for(int i=0;i<list.size();i++){
        	if(i==0){
        		res = Math.max(list.get(i)+1, res);
        		res = Math.max(res-1,(list.get(i+1)-list.get(i))/2);
        	}else if(i == list.size()-1){
        		res = Math.max(list.size()-list.get(i)-1, res);
        	}else{
        		res = Math.max(res,(list.get(i+1)-list.get(i))/2);
        	}
        }
        return res;
    }
}
