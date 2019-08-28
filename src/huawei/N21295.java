package huawei;

import java.util.*;

public class N21295 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			for(int i=0;i<=20;i++){
				for(int j=0;j<33;j++){
						int k = 100-i-j;
						if(i*5+j*3+k/3==100&&k%3==0){
							System.out.println(i+" "+j+" "+k);
						}
					}
			}
		}
	}

}

