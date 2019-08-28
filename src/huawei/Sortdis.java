package huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sortdis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int arr[] = new int[num];
		for(int i=0;i<num;i++){
			arr[i] = input.nextInt();
		}
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<num;i++){
			if(!res.contains(arr[i])){
				res.add(arr[i]);
			}
		}
		int arrs[] = new int[res.size()];
		for(int i=0;i<res.size();i++){
			arrs[i] = res.get(i);
		}
		Arrays.sort(arrs);
		for(int i=0;i<arrs.length;i++){
			System.out.println(arrs[i]);
		}
	}

}
