package huawei;

import java.util.*;

public class No31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strs = str.split("[^a-zA-Z]");
		StringBuffer sb = new StringBuffer();
		for(int i=strs.length-1;i>-1;i--){
			sb.append(strs[i]+" ");
		}
		System.out.println(sb.toString().trim());
	}

}
