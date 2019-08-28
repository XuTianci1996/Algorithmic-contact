package huawei;

import java.util.*;

public class N21282 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.next();
			Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
			for(int i=0;i<str.length();i++){
				map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
			}
			char c =0;
			boolean flag = false;
			for(Character ch:map.keySet()){
				if(map.get(ch)==1){
					c =ch;
					flag = true;
					break;
				}
			}
			if(flag){
				System.out.println(c);
			}else{
				System.out.println(-1);
			}
		}
	}

}
