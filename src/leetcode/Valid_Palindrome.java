package leetcode;

public class Valid_Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car"));
	}

	
	public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)<='z'&&s.charAt(i)>='a'){
				sb.append(s.charAt(i));
			}else if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
				sb.append(s.charAt(i));
			}else if(s.charAt(i)<='Z'&&s.charAt(i)>='A'){
				sb.append(s.charAt(i));
			}
		}
		return sb.reverse().toString().toLowerCase().equals(sb.toString().toLowerCase());
    }
}
