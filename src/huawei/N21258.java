package huawei;

import java.util.*;

public class N21258 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			for(int i=1;i<=n;i++){
				int start = (i-1)*i/2+1;
				int add = i+1;
				System.out.print(start+" ");
				for(int j=2;j<=n-i+1;j++){
					start += add;
					System.out.print(start+" ");
					add++;
				}
				System.out.println();
			}
		}
	}

}
