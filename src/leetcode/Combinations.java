package leetcode;

import java.util.*;

public class Combinations {

	public static void main(String[] args) {
		List<List<Integer>> lsts = combine(2, 2);
	}
	static List<List<Integer>> lists = new ArrayList<List<Integer>>();
	
	public static List<List<Integer>> combine(int n, int k) {
        if(n==0) return lists;
        List<Integer> list = new ArrayList<Integer>();
//		if(n==k){
//			for(int i=1;i<=n;i++){
//				list.add(i);
//				lists.add(new ArrayList<Integer>(list));
//			}
//		}else{
			for(int i=1;i<=n-k+1;i++){
				list.add(i);
				f(list,i,k,n);
				list.remove(0);
//			}
		}
		
		return lists;
    }
	public static void f(List<Integer> list, int i,int k,int n) {
		if(list.size()==k){
			for(Integer s:list){
				System.out.print(s+" ");
			}
			System.out.println();
			lists.add(new ArrayList<Integer>(list));
			return;
		}else{
			for(int j=i+1;j<=n;j++){
				list.add(j);
				f(list, j, k, n);
				list.remove(list.size()-1);
			}
		}
	}
}
