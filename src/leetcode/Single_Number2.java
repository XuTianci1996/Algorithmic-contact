package leetcode;

import java.util.ArrayList;

public class Single_Number2 {

	public static void main(String[] args) {
		int nums[]={5,1,5,4,4,5,4};
		System.out.println(singleNumber(nums));
	}

	
	public static int singleNumber(int[] nums) {
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
			if(!arrlist1.contains(nums[i])){
				arrlist1.add(nums[i]);
			}else if(!arrlist2.contains(nums[i])){
				arrlist2.add(nums[i]);
			}else if(arrlist1.contains(nums[i]) && arrlist2.contains(nums[i])){
				Integer a = nums[i];
				arrlist1.remove(a);
			}
		}
		
		int result = arrlist1.get(0);
		return result;
    }
}
