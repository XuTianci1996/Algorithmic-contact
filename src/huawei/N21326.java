package huawei;

import java.util.*;

public class N21326 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			int max = 0;
			max = Redraimen(arr, n);

			System.out.println(max);
		}
	}

	public static int Redraimen(int[] arr, int n) {
		int max[] = new int[n];
		for(int i=0;i<n;i++){
			max[i]=1;
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]&&max[j]+1>max[i]){
					max[i] = max[j]+1;
				}
			}
		}
		Arrays.sort(max);
		return max[n-1];
	}

}
