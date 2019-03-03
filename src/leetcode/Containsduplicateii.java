package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Containsduplicateii {

	public static void main(String[] args) {
		int[] arr={1,0,1,1};
		int k=1;
		System.out.println(containsNearbyDuplicate(arr, k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])){
				System.out.println(map.get(nums[i]));
				int index = i - map.get(nums[i]) ;
				if((k-index )>=0 ) {
					return true;
				}else{
					map.put(nums[i], i);
				}
			}else{
				map.put(nums[i], i);
			}
		}
		return false;
    }
}
