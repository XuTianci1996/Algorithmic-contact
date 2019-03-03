package leetcode;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "";
		System.out.println(lengthOfLongestSubstring(string));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        String key = null;
        if(s.length()!=0){
        	count = 1;
        }
        for (int i = 0; i < s.length(); i++) {
        	String t = "";
        	t+=s.charAt(i);
			for (int j = i+1; j < s.length(); j++) {
				if(!t.contains(s.charAt(j)+"")){
					t+=s.charAt(j);
					if(count<t.length()){
						count = t.length();
						key = t;
					}
				}
				else break;
			}
		}
        System.out.println(key);
		return count;
    }
}
