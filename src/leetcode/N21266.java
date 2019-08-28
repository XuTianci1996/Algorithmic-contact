package leetcode;

import java.util.*;

public class N21266 {

	static List<Integer[]> list = new ArrayList<Integer[]>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n= in.nextInt();
			int m = in.nextInt();
			int[][] matrix = new int[n][m];
			for(int i=0;i<n;i++){
				for (int j = 0; j < m; j++) {
					matrix[i][j]= in.nextInt();
				}
			}
			
//			for(int i=0;i<n;i++){
//				for (int j = 0; j < m; j++) {
//					System.out.println(matrix[i][j]);
//				}
//			}
			f(matrix,0,0);
			list.clear();
		}
	}

	public static void f(int[][] matrix,int x,int y){
		matrix[x][y]=1;
		Integer[] arr = {x,y};
		list.add(arr);
		if(x==matrix.length-1&&y==matrix[0].length-1){
			for(Integer[] a:list){
				System.out.println("("+a[0]+","+a[1]+")");
			}
			return;
		}
		if((x<matrix.length-1)&&matrix[x+1][y]==0){
			//System.out.println(list.size()+","+x+","+y);
			//down
			f(matrix,x+1,y);
		}
		if((y<matrix[0].length-1)&&matrix[x][y+1]==0){
			//right
			f(matrix,x,y+1);
		}
		if((y>0)&&matrix[x][y-1]==0){
			//left
			f(matrix,x,y-1);
		}
		if((x>0)&&matrix[x-1][y]==0){
			//up
			f(matrix,x-1,y);
		}
		matrix[x][y]=0;
		list.remove(arr);
		return;
	}
}
