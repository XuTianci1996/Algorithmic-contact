package huawei;

import java.util.*;

public class N21276 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[][] arr = new int[n][2*n];
			for(int i=0;i<n;i++){
				for(int j=0;j<2*i+1;j++){
					if(j==0||2*i==j){
						arr[i][j]=1;
					}else if(j==1){
						if(j==2*i-1){
							arr[i][j]=1;
						}else{
							arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
						}
					}else if(j==2*i-1){
						arr[i][j] = arr[i-1][j-1]+arr[i-1][j-2];
					}else{
						arr[i][j] = arr[i-1][j-2]+arr[i-1][j-1]+arr[i-1][j];
					}
				}
			//	System.out.println();
			}
			int index = -1;
			for(int i=0;i<n;i++){
				index++;
				if(arr[n-1][i]==0){
					index = -2;
					break;
				}else if(arr[n-1][i]%2==0){
					break;
				}
			}
			System.out.println(index+1);
		}
	}

}
