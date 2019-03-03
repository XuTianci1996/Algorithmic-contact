package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		int[] arr= {9,9};
		int[] arr1=plusOne(arr);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

//	public static int[] plusOne(int[] digits) {
//		List<Integer> arrlist = new ArrayList<Integer>();
//		int f = 0;
//		int sum = digits[digits.length-1]+1;
//		if(sum==10){
//			System.out.println("-");
//			f=1;
//			arrlist.add(0);
//		}else{
//			arrlist.add(sum);
//		}
//		for (int i = digits.length-2; i >=0; i--) {
//			sum = digits[i]+f;
//			if(sum==10){
//				f=1;
//				arrlist.add(0,0);
//			}else{
//				f=0;
//				arrlist.add(0, sum);
//			}
//		}
//		if(f==1){
//			arrlist.add(0, 1);
//		}
//		int[]  arr = new int[arrlist.size()];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arrlist.get(i);
//		}
//		return arr;
//    }
	public static int[] plusOne(int[] digits) {
        
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}
}
