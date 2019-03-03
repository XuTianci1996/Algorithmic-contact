package leetcode;

public class ArrangingCoins {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(3));
	}

	 public static int arrangeCoins(int n) {
	      int count =0;
	      for (int i = 1; i <= n; i++) {
			if(count+1>n){
				return count;
			}else{
				n-=i;
				count++;
			}
		}
	    return count;
	 }
}
