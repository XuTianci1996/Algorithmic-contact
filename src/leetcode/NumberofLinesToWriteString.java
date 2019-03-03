package leetcode;

public class NumberofLinesToWriteString {

	public static void main(String[] args) {
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "";
		int[] result = numberOfLines(widths, S);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			
		}
	}

	
	public static int[] numberOfLines(int[] widths, String S) {
        int row = 0;
        int sum=0;
        for (int i = 0; i < S.length(); i++) {
			int index = S.charAt(i)-97;
			
			sum+=widths[index];
			if(sum>100){
				row++;
				sum = 0;
				sum +=widths[index];
			}
		}
        int[] result = {row+1,sum};
        return result;
    }
}
