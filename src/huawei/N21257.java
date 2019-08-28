package huawei;

import java.util.*;

public class N21257 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str =in.next();
			Map<Character,Integer> map = new TreeMap<Character, Integer>();
			for(int i=0;i<str.length();i++){
				map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			}
			for(char ch:map.keySet()){
				for(int i=0;i<map.get(ch);i++){
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}

}
