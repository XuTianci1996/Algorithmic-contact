package offer;

import java.util.ArrayList;

public class N11172 {

	public static void main(String[] args) {
		int[][] arrays = new int[4][4];
		int count =1;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				arrays[i][j] = count;
				count++;
			}
		}
		ArrayList<Integer> list = printMatrix(arrays);
		for(Integer n:list){
			System.out.println(n);
		}
	}

	public static ArrayList<Integer> printMatrix(int [][] matrix) {
	       int nodes = matrix[0].length*matrix[0].length;
	       ArrayList<Integer> list = new ArrayList<Integer>();
	       //0ÓÒ£¬1ÏÂ£¬2×ó£¬3ÉÏ
	       int flag = 0;
	       int i = 0,j=0;
	       int up = 0,down = matrix[0].length-1, left = 0, right = matrix[0].length-1 ;
	       while(nodes>0){
	    	   if(flag==0){
	    		   if(j<right){
	    			   list.add(matrix[i][j]);
	    			   j++;
	    		   }else if(j==right){
	    			   list.add(matrix[i][j]);
	    			   flag = 1;
	    			   up++;
	    			   i++;
	    		   }
	    	   }else if(flag==1){
	    		   if(i<down){
	    			   list.add(matrix[i][j]);
	    			   i++;
	    		   }else if(i==down){
	    			   list.add(matrix[i][j]);
	    			   flag=2;
	    			   j--;
	    			   right--;
	    		   }
	    	   }else if(flag==2){
	    		   if(j>left){
	    			   list.add(matrix[i][j]);
	    			   j--;
	    		   }else if(j==left){
	    			   list.add(matrix[i][j]);
	    			   flag = 3;
	    			   down--;
	    			   i--;
	    		   }
	    	   }else if(flag == 3){
	    		   if(i>up){
	    			   list.add(matrix[i][j]);
	    			   i--;
	    		   }else if(i==up){
	    			   list.add(matrix[i][j]);
	    			   flag=0;
	    			   left++;
	    			   j++;
	    		   }
	    	   }
	    	   nodes--;
	       }
	       return list;
	}
}
