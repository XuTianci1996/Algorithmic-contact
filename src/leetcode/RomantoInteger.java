package leetcode;

public class RomantoInteger {

	public static void main(String[] args) {

	}

	
	public static int romanToInt(String s) {
        if(s.length()==0) return 0;
        int pre = getValue(s.charAt(0));
        int res = pre;
        for (int i = 0; i < s.length(); i++) {
			int cur = getValue(s.charAt(i));
			res += cur>pre ? cur - 2*pre : cur; 
		}
        
        return res;
    }
	
	public static int getValue(char c){
		switch(c)
		{
			case 'I': return 1; 
			case 'V': return 5; 
			case 'X': return 10; 
			case 'L': return 50; 
			case 'C': return 100; 
			case 'D': return 500; 
			case 'M': return 1000; 
			default: return 0;
		}
	}
}
