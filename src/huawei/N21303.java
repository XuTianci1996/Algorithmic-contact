package huawei;

import java.util.*;

public class N21303 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] arr1 = new int[n];
			for(int i=0;i<n;i++){
				arr1[i]=in.nextInt();
			}
			int m = in.nextInt();
			int[] arr2 = new int[m];
			for(int i=0;i<m;i++){
				arr2[i]=in.nextInt();
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			StringBuffer sb = new StringBuffer();
			int index1=0;
			int index2=0;
			while(index1<n&&index2<m){
				if(arr1[index1]<arr2[index2]){
					sb.append(arr1[index1]);
					index1++;
				}else if(arr1[index1]>arr2[index2]){
					sb.append(arr2[index2]);
					index2++;
				}else{
					sb.append(arr1[index1]);
					index1++;
					index2++;
				}
			}
			while(index1<n){
				sb.append(arr1[index1]);
				index1++;
			}
			while(index2<m){
				sb.append(arr2[index2]);
				index2++;
			}
			System.out.println(sb.toString());
		}
	}

}
