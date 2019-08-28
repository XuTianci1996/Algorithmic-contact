package huawei;

import java.util.*;

public class N21319 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
					if(i==0){
						sb.append("*");
						sb.append(str.charAt(i)+"");
						if(!(str.charAt(i+1)>='0'&&str.charAt(i+1)<='9')){
							sb.append("*");
						}
					}else if(i==str.length()-1){
						if(!(str.charAt(i-1)>='0'&&str.charAt(i-1)<='9')){
							sb.append("*");
						}
						sb.append(str.charAt(i)+"");
						sb.append("*");
					}else{
						if(!(str.charAt(i-1)>='0'&&str.charAt(i-1)<='9')){
							sb.append("*");
						}
						sb.append(str.charAt(i)+"");
						if(!(str.charAt(i+1)>='0'&&str.charAt(i+1)<='9')){
							sb.append("*");
						}
					}
					continue;
				}
				sb.append(str.charAt(i)+"");
			}
			System.out.println(sb.toString());
		}
	}

}
