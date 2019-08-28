package huawei;

import java.util.*;

public class N21284 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int m= in.nextInt();
			int n= in.nextInt();
			System.out.println(func(m,n));
		}
	}

	private static int func(int m, int n) {
		if(m==0||n==1) return 1;
		if(m<n) return func(m,m);
		else return func(m-n,n)+func(m,n-1);
	}
	

}
