package offer;

public class No10 {

	public static void main(String[] args) {
		System.out.println(~-2);
	}
	public class Solution {
	    public int RectCover(int target) {
	        if(target<=0) return 0;
	        if(target==1) return 1;
	        if(target==2) return 2;
	        return RectCover(target-1)+RectCover(target-2);
	    }
	}

}
