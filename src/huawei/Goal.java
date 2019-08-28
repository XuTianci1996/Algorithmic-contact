package huawei;

import java.util.Scanner;

public class Goal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String[] strs = in.nextLine().split(" ");
			int n = Integer.parseInt(strs[0]);
			int m = Integer.parseInt(strs[1]);
			String[] goals = in.nextLine().split(" ");
			int[] arr = new int[goals.length];
			for(int i=0;i<arr.length;i++){
				arr[i] = Integer.parseInt(goals[i]);
			}
			for(int j=0;j<m;j++){
				String[] acts = in.nextLine().split(" ");
				if(acts[0].equals("U")){
					arr[Integer.parseInt(acts[1])-1] = Integer.parseInt(acts[2]);
				}else if(acts[0].equals("Q")){
					int max = Integer.MIN_VALUE;
					for(int i=Math.min(Integer.parseInt(acts[1]),Integer.parseInt(acts[2]))-1;i<Math.max(Integer.parseInt(acts[1]),Integer.parseInt(acts[2]));i++){
                        if(arr[i]>max){
                        	max = arr[i];
                        }
					}
					System.out.println(max);
				}
			}
		}
	}

}
