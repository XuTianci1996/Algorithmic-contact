package huawei;

import java.util.*;

public class N21260 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int m = in.nextInt();
			int a=1;
			int b=0,c=0;
			while(m>1){
				System.out.println(a+" "+b+" "+c);
				c+=b;
				b=a;
				a=c;
				m--;
			}
			System.out.println(a+b+c);
				
		}
	}

}
