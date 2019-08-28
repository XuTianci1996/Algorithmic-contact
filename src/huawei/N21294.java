package huawei;

import java.util.*;

public class N21294 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str1 = in.nextLine();
			String str2 = in.nextLine();
			boolean flag = true;
			
			int index1=0;
			int index2=0;
			while(str1.length()-1>index1&&str2.length()-1>index2){
				if(str1.charAt(index1)==str2.charAt(index2)){
					System.out.println(str1.charAt(index1));
					index1++;
					index2++;
				}else if(str1.charAt(index1)=='*'){
					index2++;
					if(index1!=str1.length()-1&&str1.charAt(index1+1)==str2.charAt(index2)){
						index1++;
					}
				}else if(str1.charAt(index1)=='?'){
					index1++;
					index2++;
				}else{
					System.out.println(str1.charAt(index1)+"."+str2.charAt(index2));
					flag=false;
					break;
				}
			}
			System.out.println(flag);
		}
	}

}
