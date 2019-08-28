package huawei;

import java.util.*;

public class N21263 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			int num =0;
			int alp = 0;
			int space=0;
			int other=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
					num++;
				}else if(Character.isLetter(str.charAt(i))){
					alp++;
				}else if(str.charAt(i)==' '){
					space++;
				}else{
					other++;
				}
			}
			System.out.println(alp);
			System.out.println(space);
			System.out.println(num);
			System.out.println(other);
		}
	}
}
