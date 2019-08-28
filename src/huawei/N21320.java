package huawei;

import java.util.*;

public class N21320 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int arr[] = new int[n];
			List<Integer> list = new ArrayList<Integer>();
			int count = 0;
			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
				if(arr[i]<0) count++;
				else if(arr[i]>0) list.add(arr[i]);
			}
			float sum =0;
			for(int i:list){
				sum+=i;
			}
			System.out.print(count+" ");
			System.out.printf("%.1f",sum/list.size());
		}
	}

}
