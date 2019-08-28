package huawei;

import java.util.*;

public class N21322 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int count=0;
			for(int i=0;i<=n;i++){
				int pow = i*i;
				String str1=pow+"";
				String str2=i+"";
				if(str1.substring(str1.length()-str2.length()).equals(str2)){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
