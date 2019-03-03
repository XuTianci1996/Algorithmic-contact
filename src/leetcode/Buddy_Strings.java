package leetcode;

public class Buddy_Strings {

	public static void main(String[] args) {
		System.out.println(buddyStrings("ab", "ba"));
		//System.out.println('a'-97);
	}

	public static boolean buddyStrings(String A, String B) {
        if((A.length()<2 || B.length()<2) || A.length()!=B.length()) return false;
        int l= 0,r = 0;
        System.out.println(l+r);
        int count = 0 , o=0;
        for (int i = 0; i < A.length(); i++) {
        	if(A.charAt(i)==B.charAt(i)){
        		count++; 
        	}else {
				if(o==0){
					o++;
					l = i;
				}else {
					r = i;
				}
			}
		}
        if(count==A.length()-2){
        	char c1 = A.charAt(l);
        	char c2 = A.charAt(r);
        	StringBuffer sb = new StringBuffer(A);
        	sb.setCharAt(l, c2);
        	sb.setCharAt(r, c1);
        	System.out.println(sb.toString());
        	if(sb.toString().equals(B)){
        		return true;
        	}else{
        		return false;
        	}
        }else if(count == A.length()){
        	int c[] = new int[26];
        	for (int i = 0; i < A.length(); i++) {
				c[A.charAt(i)-97]++;
				if((c[A.charAt(i)-97])>=2){
					return true;
				}
			}
        	return false;
        }else{
        	return false;
        }
    }
}
