package huawei;

import java.util.*;

public class B21300 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
				int pow = n*n-n+1;
				for(int i=0;i<n-1;i++){
					System.out.print(pow+"+");
					pow+=2;
				}
				System.out.println(pow);
			
		}
	}

}
