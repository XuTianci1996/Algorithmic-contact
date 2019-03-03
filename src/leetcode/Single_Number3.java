package leetcode;

import java.util.ArrayList;

public class Single_Number3 {

	public static void main(String[] args) {
		int nums[]={5,1,5,3,4,3,4,2};
		int arr[] = singleNumber(nums);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	
	public static int[] singleNumber(int[] nums) {
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
		int result[] = {arrlist.get(0),arrlist.get(1)};
		return result;
    }
	
}
