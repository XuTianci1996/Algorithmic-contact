package huawei;

import java.util.*;

public class N21279 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			int count = 0;
			for(int i=3;i<=num;i++){
				int sum=0;
				for(int j=1;j<=i/2;j++){
					if(i%j==0){
						sum+=j;
					}
				}
				if(sum==i){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
