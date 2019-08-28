package huawei;

import java.util.*;

public class N21331 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int m=in.nextInt();
			int mul = n*m;
			if(n<m){
				int t = n;
				n=m;
				m=t;
			}
			while(n%m!=0){
				int t = n;
				n = m;
				m = t%n;
			}
			System.out.println(mul/m);
		}
	}

}
