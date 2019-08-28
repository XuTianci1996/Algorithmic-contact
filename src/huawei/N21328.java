package huawei;

import java.util.*;

public class N21328 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count=0;
		List<Integer> list = new ArrayList<Integer>();
		
		while(in.hasNext()){
			int n = in.nextInt();
			if(n<0){
				count++;
			}else if(n>0){
				list.add(n);
			}
		}
		float sum=0;
		for(int i:list){
			sum+=i;
		}
		System.out.println(count);
		System.out.println(sum/list.size());
	}

}
