package huawei;

import java.util.*;

public class N228385752 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.next();
			Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
			for(int i=0;i<str.length();i++){
				map.put(str.charAt(i),1);
			}
			for(char ch : map.keySet()){
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
