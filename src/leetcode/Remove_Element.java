package leetcode;

import java.util.ArrayList;

public class Remove_Element {

	public static void main(String[] args) {
		int nums[] ={2,4,5,6,2,1,5}; 
		System.out.println(removeElement(nums, 5));
	}

	public static int removeElement(int[] nums, int val) {
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val){
				count++;
				arr.add(nums[i]);
			}
		}
        for (int i = 0; i < arr.size(); i++) {
			nums[i] = arr.get(i);
		}
		return count;
    }
}
