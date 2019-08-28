package huawei;

import java.util.*;

public class N21243 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str =in.next();
			if(func(str)&&checkCharRepeat(str)){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
	}
	
	public static boolean func(String str){
		if(str.length()<9) return false;
		int[] num=new int[4];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				num[0]=1;
			}else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				num[1]=1;
			}else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				num[2]=1;
			}else{
				num[3]=1;
			}
		}
		
		return (num[0]+num[1]+num[2]+num[3])>2?true:false;
	}

	public static boolean checkCharRepeat(String password) {
		for (int i = 0; i < password.length() - 2; i++) {
			String substr1 = password.substring(i, i + 3);
			if (password.substring(i + 1).contains(substr1))
				return false;
		}
		return true;
	}
}
