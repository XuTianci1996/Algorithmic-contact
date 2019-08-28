package huawei;

import java.util.*;

public class N21281 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int m = in.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			for(int i=0;i<m;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

}
