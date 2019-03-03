package leetcode;

public class LengthofLastWord {

	public static void main(String[] args) {
		String s="a ";
		System.out.println(lengthOfLastWord(s));
	}

	
	public static int lengthOfLastWord(String s) {
		if(s.length()==0) return 0;
        String[] s1 =s.split(" ");
        if(s1.length==0){
        	return 0;
        }
        return s1[s1.length-1].length();
    }
}
