package leetcode;

public class DecodeWays {

	public static void main(String[] args) {
		System.out.println(numDecodings("01"));
	}

	public static int numDecodings(String s) {
		if(s.charAt(0)=='0') return 0;
		String[] strs = s.split("0");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i]);
		}
		s = sb.toString();
		int len = s.length();
		if(len<1||s.charAt(0)=='0') return 0;
		int[] dp = new int[len];
		if(len==1){
			if(s.charAt(0)>='1'&&s.charAt(0)<='9'){
				return 1;
			}else{
				return 0;
			}
		}
		if(len>=2){
			if(((s.charAt(0)-'0')*10+s.charAt(1)-'0')<=26){
				dp[0]=1;
				dp[1]=2;
			}else{
				dp[0]=1;
				dp[1]=1;
			}
		}
		for(int i=2;i<len;i++){
			if (s.charAt(i) == '0') {
                dp[i] = 0;
                continue;
            }
			if(((s.charAt(i-1)-'0')*10+s.charAt(i)-'0')<=26){
				dp[i] = dp[i-1]+dp[i-2];
			}else{
				dp[i] = dp[i-1];
			}
		}
		return dp[len-1];
	}
}
