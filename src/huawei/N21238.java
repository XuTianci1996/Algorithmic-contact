package huawei;

import java.util.*;

public class N21238 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		while(n!=0){
			if(n%2==1) count++;
			n/=2;
		}
		System.out.println(count);
	}

}
