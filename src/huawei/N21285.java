package huawei;

import java.util.*;

public class N21285 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			int count = 0;
			while(num!=0){
				if(num%2==1){
					count+=1;
				}
				num/=2;
			}
			System.out.println(count);
		}
	}

}
