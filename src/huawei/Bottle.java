package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bottle {

	public static void main(String[] args) {
		func();
	}

	public static void func(){
		List<Integer> result = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i = 0;i<10;i++){
			arr[i] = input.nextInt();
			if(arr[i]==0) break;
		}
		for(int i = 0;i<10;i++){
			if(arr[i]==0) break;
			if(arr[i]<2) result.add(0);
			int sum = 0;
			int t =0;
			while(arr[i]>1){
				if(arr[i]==2){
					sum++;
					break;
				}
				sum+=arr[i]/3;
				t = arr[i]/3;
				arr[i]=arr[i]%3 +t;
			}
			result.add(sum);
		}
		for (int i : result) {
			System.out.println(i);
		}
	}
}
