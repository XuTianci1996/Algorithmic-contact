package huawei;

import java.util.*;

public class No9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str= in.nextLine();
		List<Integer> list = new ArrayList<Integer>();
		for(int i= str.length()-1;i>-1;i--){
			if(!list.contains(str.charAt(i)-'0')){
				list.add(str.charAt(i)-'0');
			}
		}
		for(int n :list){
			System.out.print(n);
		}
	}

}
