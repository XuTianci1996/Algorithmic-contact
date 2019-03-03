package leetcode;

public class ReverseWordsinaStringIII {

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

	public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.length;i++){
        	sb.append(new StringBuilder(strs[i]).reverse() + " ");
        }
        return sb.toString().trim();
    }
}
