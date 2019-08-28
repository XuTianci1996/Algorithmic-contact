package huawei;

import java.util.*;

public class N21244 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String encode = in.next();
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<encode.length();i++){
				if(encode.charAt(i)>='a'&&encode.charAt(i)<='z'){
					char ch = encode.charAt(i);
					if(ch>='a'&&ch<='c') sb.append("2");
					else if(ch>='d'&&ch<='f') sb.append("3");
					else if(ch>='g'&&ch<='i') sb.append("4");
					else if(ch>='j'&&ch<='l') sb.append("5");
					else if(ch>='m'&&ch<='o') sb.append("6");
					else if(ch>='p'&&ch<='s') sb.append("7");
					else if(ch>='t'&&ch<='v') sb.append("8");
					else if(ch>='w'&&ch<='z') sb.append("9");
				}else if(encode.charAt(i)>='A'&&encode.charAt(i)<='Z'){
					char ch = encode.charAt(i);
					if(ch=='Z') sb.append("a");
					else{
						String s = String.valueOf((char)(Character.toLowerCase(ch)+1));
						sb.append(s);
					}
				}else{
					sb.append(encode.charAt(i));
				}
			}
			System.out.println(sb);
		}
	}

}
