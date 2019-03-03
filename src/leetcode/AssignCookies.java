package leetcode;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		int[] s = {10,9,8,7};
		int[] g	= {5,6,7,8};
		System.out.println(findContentChildren(g, s));
	}

	public static int findContentChildren(int[] g, int[] s) {
		if(s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
		int result =0;
		int index = 0;
		for (int i = 0; i < g.length; i++) {
			while(g[i]>s[index] && index<s.length){
				index++;
			}
			if(s[index]>=g[i]){
				result++;
				index++;
				if(index == s.length-1) return result;
			}
		}
		return result;
    }
}
