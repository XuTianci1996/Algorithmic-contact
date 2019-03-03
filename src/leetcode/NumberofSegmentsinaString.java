package leetcode;

public class NumberofSegmentsinaString {

	public static void main(String[] args) {
		String s = ", , , ,        a, eaefa";
		System.out.println(countSegments(s));
	}

	public static int countSegments(String s) {
        int count=0;
		String strs[] = s.split(" "); 
//		for(String s1: strs){
//			System.out.println(s1 + " ");
//		}
		for (int i = 0; i < strs.length; i++) {
			strs[i].trim();
			if(strs[i].length()!=0 && strs[i]!=null){
				count++;
			}
		}
		return count;
    }
}
