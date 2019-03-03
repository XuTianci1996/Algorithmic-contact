package leetcode;

public class Implement_strStr {

	public static void main(String[] args) {
		System.out.println(strStr("mississippi"
				,"pi"));
	}
	public static int strStr(String haystack, String needle) {
		if(needle.length() < 1) return 0;
		if(haystack.equals(needle)) return 0;
		for (int i = 0; i <= haystack.length()-needle.length(); i++) {
			if(haystack.charAt(i)==needle.charAt(0)){
				if(needle.equals(haystack.substring(i, i+needle.length()))){
					return i;
				}
			}
		}
		return -1;
	}

}
