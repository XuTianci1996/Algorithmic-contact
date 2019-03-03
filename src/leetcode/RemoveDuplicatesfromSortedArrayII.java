package leetcode;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		int nums[]= {1,1,1,1,1,1,2,3,4,5,6,6,6};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		if(nums.length<=2) return nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count= 1;
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
        	if(arr.get(arr.size()-1)!=nums[i]){
        		arr.add(nums[i]);
        		count = 1;
        	}else if(arr.get(arr.size()-1)==nums[i] && count <2){
        		arr.add(nums[i]);
        		count++;
        	}
		}
        
        for (int i = 0; i < arr.size(); i++) {
			nums[i] = arr.get(i);
		}
        System.out.println(arr);
        return arr.size();
	}
}
