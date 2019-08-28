package huawei;

import java.util.*;

public class N21261 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double n = in.nextDouble();
			double sum = n;
			n/=2;
			for(int i=1;i<5;i++){
				sum+=n*2;
				n/=2;
			}
			System.out.println(Math.ceil(sum));
			System.out.println(n);
		}
	}

}
