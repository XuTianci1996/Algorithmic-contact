package huawei;

import java.util.*;

public class N21309 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			int[] dp = new  int[9];
			int max = Integer.MIN_VALUE;
			int index = 0;
			while(num!=0){
				if(num%2==1){
					if(index==0){
						dp[index]=1;
						if(dp[index]>max) max = dp[index];
					}else if(dp[index-1]!=0){
						dp[index] =dp[index-1]+1;
						max = dp[index];
					}else{
						dp[index]=1;
						max = dp[index];
					}
				}
				index++;
				num/=2;
				//System.out.println(num);
			}
			for(int i:dp){
				System.out.println(i);
			}
			System.out.println(max);
		}
	}

}
