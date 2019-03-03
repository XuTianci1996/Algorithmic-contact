package leetcode;

public class NextGreaterElementI {

	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] arr=nextGreaterElement(nums1, nums2);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
			int index = getindex(nums2, nums1[i]);
			while(nums1[i]>=nums2[index]){
				index++;
				if(index>nums2.length-1){
					break;
				}
			}
			if(index>nums2.length-1){
				arr[i]=-1;
			}else {
				arr[i] = nums2[index];
			}
		}
        
        return arr;
    }
	
	public static int getindex(int[] nums,int num){
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==num) return i;
		}
		return -1;
	}
}
