package offer;

public class No1 {

	public static void main(String[] args) {
		String s = "asdfasdf";
		System.out.println(s.indexOf("d"));
		StringBuffer str = new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(str));
	}

	public static String replaceSpace(StringBuffer str) {
		String s = str.toString();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				s = s.substring(0, i)+"%20"+s.substring(i+1);
			}
		}
		return s;
    }
}
