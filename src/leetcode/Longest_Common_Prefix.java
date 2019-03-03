package leetcode;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		String strs[] = {"12345555","12345555","1234"};
		
		System.out.println(longestCommonPrefix(strs));
	}

	
    public static String longestCommonPrefix(String[] strs) {

    	if(strs.length==0 || strs[0].length()==0) return "";
    	String str = strs[0];
    	for(int i = 1 ;i<strs.length;i++){
    		while(strs[i].indexOf(str)==-1){
    			System.out.println(str);
    			str = str.substring(0, str.length()-1);
    			if(str.length()==0) return "";
    		}
    	}
    	return str;
    }
}
