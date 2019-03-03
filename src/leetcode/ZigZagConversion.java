package leetcode;

public class ZigZagConversion {

	public static void main(String[] args) {
		String s = "PAHNAPLSIIGYIR";
		System.out.println(convert(s, 3));
	}

	public static String convert(String s, int numRows) {
        int d= numRows*2-2;
        String result ="";
        
        if (s.length() == 0 || numRows <2)//特殊情况特殊处理
            return s;

        for (int i = 0; i < numRows; i++) {
			for (int j = i; j < s.length(); j+=d) {
				result+=s.charAt(j);
				if(i!=0 && i!=numRows-1 && j - 2*i + d < s.length()){
					 result += s.charAt(j - 2*i + d);
				}
			}
		}
        return result;
    }
}
