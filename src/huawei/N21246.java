package huawei;

import java.util.*;

public class N21246 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int count[] = new int[26];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)-'a'+1]++;
		}
		for(int i=0;i<26;i++){
			if(min>count[i]&&count[i]!=0) min = count[i];
		}
		System.out.println(min);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)-'a'+1]>min){
				sb.append(str.charAt(i)+"");
			}
		}
		System.out.println(sb.toString());
	}

}
