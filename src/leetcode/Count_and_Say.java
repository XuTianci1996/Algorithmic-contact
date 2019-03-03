package leetcode;

public class Count_and_Say {

	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}
	/*
	 * ��Ŀ�Ĺؼ����Ǹ㶮���⣬���ϸ�n��Ӧ�����֣�
	 * ��n=1�����  1��
	 * ��n=2�����  1��1���������21��
	 * ��n=3�����  1��2��1��1���������1211��
	 * ��n=4�����  1��1��1��2��2��1���������111221��
	 * �Դ�����
	 * ����Ĺؼ��������ظ����ֵĸ�����������ͬ�����־���������ֱ���ַ���ĩβ
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
