package leetcode;

public class Sqrtx {

	public static void main(String[] args) {
		System.out.println(mySqrt(4));
	}

	public static int mySqrt(int x) {
		if(x==1||x==2) return 1;
        for(int i =0;i<=x/2;i++){
        	if(i*i>x) return i-1;
        }
        return 0;
    }
}
