package huawei;

import java.util.*;

public class N21314 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int m = in.nextInt();
			int count = go(n,m);
			System.out.println(count);
		}
	}

	public static int  go(int n,int m){
		if(m==0||n==0) return 1;
		return go(n-1,m)+go(n,m-1);
	}
}
