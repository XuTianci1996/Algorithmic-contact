package offer;

import java.util.HashMap;

public class No13 {

	public static void main(String[] args) {
		System.out.println(1>2?3:4>4?4:5);
		HashMap<String,Integer > map = new HashMap<String, Integer>();
		map.put("110", 100);
		int [] array= {2,2,3,5,7,8};
		reOrderArray(array);
		for(int v:array){
			System.out.println(v);
		}
	}
	
	public static void reOrderArray(int [] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i; j < array.length-1 ;j++)
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
        }
    }
	public static void swap(int a , int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

}
