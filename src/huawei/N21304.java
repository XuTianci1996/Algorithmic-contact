package huawei;

import java.util.*;

public class N21304 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String s = in.nextLine();
			boolean flag = true;
			for(int i = 0;i<str.length();i++){
				if(s.indexOf(str.charAt(i))!=-1){
					continue;
				}else{
					flag = false;
				}
			}
			if(flag){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}
	}

}
