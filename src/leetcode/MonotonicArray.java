package leetcode;

public class MonotonicArray {

	public static void main(String[] args) {
		int nums[] ={1,0,3,4,5,6,7,8,8,8,8};
		System.out.println(isMonotonic(nums));
	}

	
	public static boolean isMonotonic(int[] A) {
        int f=0;
        for (int i = 0; i < A.length-1; i++) {
			if(A[i]==A[i+1]){
				continue;
			}else if(A[i]<A[i+1]){
				if( f == 0){
					f = 1;
				}else if(f==2){
					return false;
				}
			}else if(A[i]>A[i+1]){
				if( f == 0){
					f = 2;
				}else if(f==1){
					return false;
				}
			}
		}
        return true;
    }
}
