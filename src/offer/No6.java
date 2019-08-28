package offer;

import java.util.Arrays;

public class No6 {

	public static void main(String[] args) {

	}

	public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        Arrays.sort(array);
        return array[0];
    }
}
