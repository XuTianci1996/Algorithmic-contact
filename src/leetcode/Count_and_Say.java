package leetcode;

public class Count_and_Say {

	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}
	/*
	 * 题目的关键就是搞懂题意，数上个n对应的数字：
	 * 当n=1结果是  1；
	 * 当n=2结果是  1个1，结果就是21；
	 * 当n=3结果是  1个2，1个1，结果就是1211；
	 * 当n=4结果是  1个1，1个2，2个1，结果就是111221；
	 * 以此类推
	 * 解题的关键就是数重复出现的个数，遇到不同的数字就重新数，直到字符串末尾
	 * */
	
	public static String countAndSay(int n) {
        if(n<1) return "";
		String str = "1";
		for (int i = 2; i <= n; i++) {
			StringBuffer sb =new StringBuffer();
			int count =1 ;
			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(j - 1)) {
	                count++;
	            } else {
	                sb.append(count);
	                sb.append(str.charAt(j - 1));
	                count = 1;
	            }
			}
			 sb.append(count);
		     sb.append(str.charAt(str.length() - 1));
		     str = sb.toString();
		}
		return str;
    }
}
