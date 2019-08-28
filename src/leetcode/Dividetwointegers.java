package leetcode;

public class Dividetwointegers {

	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(divide(-2147483648,-1));
	}

	public static int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        if(dividend==Integer.MIN_VALUE){
        	if(divisor==-1){
        		System.out.println(dividend);
        		return Integer.MAX_VALUE;
        	}
        }
        if(divisor==1){
        	return dividend;
        }
        long dd = (long)dividend;
        long ds = (long)divisor;
		int result = 0;
        boolean flag = true;
        if(dd<0){
        	dd=-dd;
        	flag = !flag;
        }
        if(ds<0){
        	ds = -ds;
        	flag = !flag;
        }
        
        while(dd>=ds){
        	int shift=0;
        	while(dd>=(ds<<shift)){
        		shift++;
        	}
        	result += 1<<(shift-1);
        	dd-=ds<<(shift-1);
        }
        
		return flag?result:-result;
    }
}
