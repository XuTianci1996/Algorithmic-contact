package huawei;

import java.util.*;

public class N21316 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int sum3 = 0;
			int sum5 = 0;
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				int num = in.nextInt();
				if(num%5==0){
					sum5+=num;
				}else if(num%3==0){
					sum3+=num;
				}else{
					list.add(num);
				}
			}
			int cha =sum3-sum5;
			int num = 0;
			for(int i:list){
				num+=i;
			}
			if((num+cha)%2!=0){
				System.out.println("false");
			}else{
				int result = (num+cha)/2;
				Integer[] a = new Integer[list.size()];
				Integer arr[]= list.toArray(a);
				System.out.println(result);
				boolean flag = func(result,0,arr,0);
				if(flag) System.out.println("true");
				if(!flag) System.out.println("false");
			}
		}
	}
	
	public static boolean func(int result,int a,Integer[] arr,int index){
		System.out.println(arr[index]);
		if(index==arr.length){
			if(result == a ) return true;
			if(result != a ) return false;
		}
		if(result == a ) return true;
		if(result != a) return func(result,a+arr[index],arr,index+1)||func(result,a,arr,index+1);
		return false;
	}

}
