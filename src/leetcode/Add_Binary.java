package leetcode;

public class Add_Binary {
	// 二进制加法
	public static void main(String[] args) {
		System.out.println(addBinary("100", "110010"));
	}

	public static String addBinary(String a, String b) {
		boolean flag = false;
		String sb = new String();
		if (a.length() == b.length()) {
			for (int i = a.length() - 1; i >= 0; i--) {
				int rs = 0;
				if (flag) {
					rs = 1 + Integer.parseInt(a.charAt(i) + "")
							+ Integer.parseInt(b.charAt(i) + "");
					flag = false;
				} else {
					rs = Integer.parseInt(a.charAt(i) + "")
							+ Integer.parseInt(b.charAt(i) + "");
				}
				if (rs > 1) {
					flag = true;
					if(rs==2){
						rs = 0;
					}else if(rs==3){
						rs = 1;
					}
				}
				sb = rs+sb;
			}
			if (flag) {
				return "1" + sb;
			}
			return sb;
		} else {
			if(a.length()>b.length()){
				String t = a;
				a = b;
				b =t;
			}
			int rs = 0;
			for (int i = b.length()-1,j = a.length() - 1 ; j >= 0; j--,i--) {
				if (flag) {
					rs = 1 + Integer.parseInt(a.charAt(j) + "")
							+ Integer.parseInt(b.charAt(i) + "");
					flag = false;
				} else {
					rs = Integer.parseInt(a.charAt(j) + "")
							+ Integer.parseInt(b.charAt(i) + "");
				}
				if (rs > 1) {
					flag = true;
					if(rs==2){
						rs = 0;
					}else if(rs==3){
						rs = 1;
					}
				}
				System.out.println(rs);
				sb =rs + sb;;
			}
			
			for (int i = b.length() - 1 - a.length(); i >= 0; i--) {
				if (flag) {
					rs = 1 + Integer.parseInt(b.charAt(i) + "");
					flag = false;
				}else{
					rs = Integer.parseInt(b.charAt(i)+"");
				}
				if (rs > 1) {
					flag = true;
					rs = 0;
				}
				System.out.println(rs);
				sb =rs  + sb;;
			}
			if (flag) {
				return "1" + sb;
			}
			return sb;
		}
	}
}
