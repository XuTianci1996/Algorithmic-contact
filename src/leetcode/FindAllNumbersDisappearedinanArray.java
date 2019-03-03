package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		int[] nums={4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= nums.length; i++) {
			list.add(i);
		}
		for (int i = 0; i < nums.length; i++) {
			while (list.contains(nums[i])) {
				list.remove(list.indexOf(nums[i]));
			}
		}
		return list;

    }
}
