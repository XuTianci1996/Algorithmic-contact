package leetcode;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AZ"));
	}

	
	public static int titleToNumber(String s) {
		int result=0;
		for (int i = 0; i < s.length(); i++) {
			result+=(int)(s.charAt(i)-64)*Math.pow(26, s.length()-1-i);
		}
		return result;
    }
}
