package leetcode;

import java.util.ArrayList;

public class Single_Number {

	public static void main(String[] args) {
		int nums[]={5,1,5,3,4,3,4};
		System.out.println(singleNumber(nums));
	}

	
	public static int singleNumber(int[] nums) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(arrlist.contains(nums[i])){
				Integer b = nums[i];
				arrlist.remove(b);
			}
			else {
				arrlist.add(nums[i]);
			}
		}
		int result = arrlist.get(0);
		return result;
    }
}
