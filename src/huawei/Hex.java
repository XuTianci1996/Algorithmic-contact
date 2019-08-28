package huawei;

import java.util.Scanner;

public class Hex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine().substring(2);
			int res=0;
			for(int i=str.length()-1;i>=0;i--){
				if(str.charAt(i)>='A'&str.charAt(i)<='F'){
					res+=(str.charAt(i)-'A'+10)*Math.pow(16, str.length()-1-i);
				}else{
					res+= (str.charAt(i)-'0')*Math.pow(16, str.length()-1-i);
				}
			}
			System.out.println(res);
		}
	}

}
