package leetcode;

import java.util.ArrayList;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		int nums[] ={1,1,3,4,5,6,6}; 
		System.out.println(removeDuplicates(nums));
	}

	 public static int removeDuplicates(int[] nums) {
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 arr.add(nums[0]);
		 int count = 1;
		 for (int i = 1; i < nums.length; i++) {
			if(arr.get(arr.size()-1)!=nums[i]){
				arr.add(nums[i]);
				count++;
			}
		 }
		 for (int i = 0; i < arr.size(); i++) {
			nums[i] = arr.get(i);
		}
		 return count;
	 }
}
