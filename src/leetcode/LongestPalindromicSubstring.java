package leetcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("asdsadassaaaaaaa"));
	}

	public static String longestPalindrome(String s){
		if(s.length()<=1) return s;
		boolean[][] dp = new boolean[s.length()][s.length()];
		int max = Integer.MIN_VALUE;
		String res = "";
		for(int j=1;j<s.length();j++){
			for(int i=0;i<j;i++){
				if(s.charAt(i)==s.charAt(j)&&(j-i<=2||dp[i+1][j-1])){
					dp[i][j]=true;
					if(max<j-i+1){
						max = j-i+1;
						res = s.substring(i,j+1);
					}
				}
			}
		}
		System.out.println(res);
		return res;
	}
}
