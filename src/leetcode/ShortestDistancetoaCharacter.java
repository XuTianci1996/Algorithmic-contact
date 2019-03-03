package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ShortestDistancetoaCharacter {

	public static void main(String[] args) {
		 String S = "loveleetcode";
		 char C = 'e';
		 int[] arr = shortestToChar(S, C);
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] shortestToChar(String S, char C) {
        List<Integer> list = new ArrayList<Integer>();
        int index = S.indexOf(C);
        int ind = S.indexOf(C);
        for(int i=0;i<S.length();i++ ){
        	String s = S.substring(i);
        	if(s.contains(C+"")){
        		 ind = s.indexOf(C)+i;
        	}
        	if(S.charAt(i)==C){
        		index = i;
        	}
        	int t = Math.abs(i-index)<Math.abs(i-ind)? Math.abs(i-index):Math.abs(i-ind);
        	list.add(t);
        }
        int[] arr = new int[list.size()]; 
        for(int i=0 ;i<list.size();i++){
        	arr[i] = list.get(i);
        }
        return arr;
    }	
}
