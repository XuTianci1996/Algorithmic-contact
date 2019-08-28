package huawei;

import java.util.*;

public class N21252 {
	static String de="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	static String en="BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza2345678901";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String ec = in.nextLine();
			String dc = in.nextLine();
			System.out.println(encode(ec));
			System.out.println(decode(dc));
		}
	}

	public static String encode(String str){
		StringBuffer res = new StringBuffer();
		for(int i=0;i<str.length();i++){
			int index = de.indexOf(str.charAt(i));
			res.append(en.charAt(index)+"");
		}
		return res.toString();
	}
	
	public static String decode(String str){
		StringBuffer res = new StringBuffer();
		for(int i=0;i<str.length();i++){
			int index = en.indexOf(str.charAt(i));
			res.append(de.charAt(index)+"");
		}
		return res.toString();
	}
}
