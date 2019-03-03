package leetcode;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String st = new StringBuffer(str).reverse().toString();
        return str.equals(st);
    }
}
