package leetcode;

public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println(reverse(1534236469));
	}
	
	public static int reverse(int x) {
		//if(x>(int) Math.pow(2, 31)-1 && x < -(int) Math.pow(2, 31)) return 0;
		if(x<0){
			String s = x +"";
			int t= 0;
			for (int i = 0; i < s.length()-1; i++) {
				long n =  ((int)Math.pow(10,s.length()-i-2));
				long m = x%10;
				t += m * n;
				/*
				 * 使用long类型来判断int是否溢出
				 * 负数的判断是当long转换为int时值变大
				 * 正数则相反*/
				if(t>m*n) return 0;
 				x/=10;
			}
			return t;
		}
		else if(x>0){
			String s = x +"";
			int t= 0;
			for (int i = 0; i < s.length(); i++) {
				long n =  ((int)Math.pow(10,s.length()-i-1));
				long m = x%10;
				t += m * n;
				x/=10;
			}
			return t;
		}
		else return 0;
    }
}
