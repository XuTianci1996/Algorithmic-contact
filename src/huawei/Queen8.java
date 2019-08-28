package huawei;

public class Queen8 {
	public static int[][] array = new int[8][8];
	public static int count = 0;
	public static void main(String[] args) {
		queen(0);
		System.out.println(count);
	}
	
	public static void queen(int i){
		if(i>7){
			count++;
			return;
		}
		for(int m=0;m<8;m++){
			if(check(i,m)){
				array[i][m]=1;
				queen(i+1);
				array[i][m]=0;
			}
		}
	}
	
	public static boolean check(int i,int m){
		for(int j=0;j<8;j++){
			if(array[j][m]==1){
				return false;
			}
		}
		for(int x=i-1,y=m-1;x>=0 && y>=0;x--,y--){
			if(array[x][y]==1){
				return false;
			}
		}
		
		for(int x=i-1,y=m+1;x>=0 && y<8;x--,y++){
			if(array[x][y]==1){
				return false;
			}
		}
		
		return true;
	}
}
