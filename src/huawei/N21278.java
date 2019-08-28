package huawei;

import java.util.*;

public class N21278 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int count=0;
			for(int i = 7;i<=n;i++){
				if(is7(i)){
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static boolean is7(int number){
		if(number%7==0) return true;
		String s  = number+"";
		if(s.indexOf('7')!=-1) return true;
		return false;
	}
}
