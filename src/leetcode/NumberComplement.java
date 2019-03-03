package leetcode;

public class NumberComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}

	public static int findComplement(int num) {
        String str = "";
		while(num!=0){
        	int t = num%2;
        	if(t == 0){
        		str = "1"+str;
        	}else if(t == 1){
        		str = "0"+str;
        	}
        	num/=2;
        }
		int res=0;
		for(int i = 0;i < str.length();i++){
			if(str.charAt(i)=='1'){
				res+=Math.pow(2, str.length()-i-1);
			}
		}
		return res;
    }
}
