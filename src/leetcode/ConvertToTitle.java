package leetcode;

public class ConvertToTitle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(1));
	}

	public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        if(n==1) return "A";
		while(n>0){
        	char c = 'A';
        	if(n%26==0){
        		sb.append('Z');
        	}else {
        		sb.append((char)(c+n%26-1));
			}
        	n/=26;
        }
		return sb.toString();
    }
}
