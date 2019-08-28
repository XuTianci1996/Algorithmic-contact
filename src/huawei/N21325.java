package huawei;

import java.util.*;

public class N21325 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = " 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int num[] = new int[63];
		while(in.hasNext()){
			String s = in.next();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==' '){
					num[0]++;
				}else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
					num[s.charAt(i)-'0'+1]++;
				}else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
					num[s.charAt(i)-'a'+11]++;
				}else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
					num[s.charAt(i)-'A'+37]++;
				}
			}
			StringBuffer sb = new StringBuffer();
			for(int j=0;j<s.length();j++){
				int max=0;
				int index=-1;
				for(int i=0;i<num.length;i++){
					if(max<num[i]){
						max=num[i];
						index = i;
					}
				}
				if(index>=0){
					sb.append(str.charAt(index));
					num[index]=0;
				}
			}
			System.out.println(sb.toString());
		}
	}

}
