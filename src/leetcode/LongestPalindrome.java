package leetcode;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abcbax"));
	}

	public static String longestPalindrome(String s) {
        String key ="";
        if(s.length()<=1) return s;
        String reverse = new StringBuffer(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
        	for(int j = i+1;j < s.length();j++){
        		boolean f =s.substring(i, j+1).equals(reverse.substring(s.length()-1-j, s.length()-i));
        		if(f){
        			String t= s.substring(i, j+1);
        			if(key.length() < t.length()){
        				key = t;
        			}
        		}
        	}
		}
		if(key.length() == 0){
			key +=s.charAt(0);
		}
		return key;
    }
	
}
