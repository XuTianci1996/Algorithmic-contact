package huawei;

import java.util.*;

public class No4 {

	public static void main(String[] args) {
		func();
	}

	public static void func(){
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String sb = null ;
		List<String> list = new ArrayList<String>();
		while(s1.length()>8){
			sb = "";
			sb = s1.substring(0, 8);
			list.add(sb);
			s1 = s1.substring(8);
		}
		if(s1.length()!=0&&s1.length()<=8){
			sb = "";
			sb +=s1;
			for(int i=0;i<8-s1.length();i++){
				sb += "0";
			}
			list.add(sb);
		}
		String s2 = in.nextLine();
		while(s2.length()>8){
			sb = "";
			sb = s2.substring(0, 8);
			list.add(sb);
			s2 = s2.substring(8);
		}
		if(s2.length()!=0&&s2.length()<=8){
			sb = "";
			sb +=s2;
			for(int i=0;i<8-s2.length();i++){
				sb += "0";
			}
			list.add(sb);
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
