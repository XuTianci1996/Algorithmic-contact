package leetcode;

import java.util.*;

public class Permutations {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		List<List<Integer>> l = permute(arr);
		for (List lst : l) {
			for (Object i : lst) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	static List<List<Integer>> lists = new ArrayList<List<Integer>>();
	public static List<List<Integer>> permute(int[] nums) {
        if(nums.length==0) return lists;
        List<Integer> list = new ArrayList<Integer>(); 
        f(list,nums,0);
        return lists;
    }
	public static void f(List<Integer> list, int[] nums, int index) {
		if(index == nums.length-1){
			for(int i:nums){
				list.add(i);
			}
			//if()
			lists.add(list);
			return;
		}
		for(int i = index;i<nums.length;i++){
			List<Integer> t_list = new ArrayList<Integer>(list);
			swap(nums,i,index);
			f(t_list,nums,index+1);
			swap(nums,i,index);
		}
		return;
	}
	public static void swap(int[] nums, int i, int index) {
		if(i!=index){
			int t = nums[i];
			nums[i] = nums[index];
			nums[index] = t;
		}
	}
}
