package leetcode;

public class ReverseString {

	public static void main(String[] args) {
		String s="sdafdas";
	}

	
	public static String reverseString(String s){
		
		char[] chars = s.toCharArray();
		int n=0,m=chars.length-1;
		while(n<m){
			char t = chars[n];
			chars[n] = chars[m];
			chars[m] = t;
			n++;
			m--;
		}
		return new String(chars);
	}
}
