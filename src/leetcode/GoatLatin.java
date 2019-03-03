package leetcode;

public class GoatLatin {

	public static void main(String[] args) {
		String S = "The quick brown fox jumped over the lazy dog";
		System.out.println(toGoatLatin(S));
	}

	 public static String toGoatLatin(String S) {
		 String banned="aeiouAEIOU";
		 String[] strings = S.split(" ");
		 StringBuilder sb=new StringBuilder(); 
		 for (int i = 0; i < strings.length; i++) {
			if(banned.contains(strings[i].charAt(0)+"")){
				strings[i] +="ma"; 
			}else{
				String t = strings[i].substring(1);
				strings[i] = t+strings[i].charAt(0)+"ma";
			}
			sb.append(strings[i]);
			for (int j = 0; j <= i; j++) {
				sb.append("a");
			}
			sb.append(" ");
		}
		 
		 return sb.toString().trim();
	 }
}
