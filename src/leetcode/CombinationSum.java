package leetcode;

import java.util.*;

public class CombinationSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		List<List<Integer>> l = combinationSum(arr, 5);
		for (List lst : l) {
			for (Object i : lst) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	static List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public static List<List<Integer>> combinationSum(int[] candidates,
			int target) {
		List<Integer> list = new ArrayList<Integer>();
		f(list, candidates, target, 0, 0);
		return lists;
	}

	public static void f(List<Integer> list, int[] arr, int t, int index,
			int sum) {
		if (sum > t) {
			// list.remove(list.size()-1);
			return;
		} else if (sum == t) {
			lists.add(list);
			// list.clear();
			return;
		} else if (sum < t && index < arr.length) {
			for (int i = index; i < arr.length; i++) {
				List<Integer> t_list = new ArrayList<>(list);
				t_list.add(arr[i]);
				f(t_list, arr, t, i,sum + arr[i]);
			}
		}
		return;
	}
}
