package leetcode;

public class Dividetwointegers {

	public static void main(String[] args) {
		System.out.println(divide(-213213213, -1));
	}

	public static int divide(int dividend, int divisor) {
        if(dividend>0 && divisor>0){
            int count = 0;
            while(dividend>=divisor){
                dividend -= divisor;
                count++;
            }
            return count;
        }else if(dividend<0 && divisor<0){
            int count = 0;
             while(dividend<=divisor){
                dividend -= divisor;
                count++;
            }
            return count;
        }else if((dividend>0 && divisor<0)||(dividend<0 && divisor>0)){
            int count = 0;
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
             while(dividend>=divisor){
                dividend -= divisor;
                count++;
            }
            return -count;
        }else{
            return 0;  
        }
    }
}
