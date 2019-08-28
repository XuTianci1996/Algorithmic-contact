package huawei;

import java.util.*;

public class N21217 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			Map<String,Integer> map = new TreeMap<String, Integer>();
			for(int i=0;i<n;i++){
				map.put(in.next(),0);
			}
			int invalid = 0;
			int num = in.nextInt();
			for(int i=0;i<num;i++){
				String s = in.next();
				if(map.containsKey(s)){
					map.put(s, map.get(s)+1);
				}else{
					invalid++;
				}
			}
			for(String s:map.keySet()){
				System.out.println(s+" : " +map.get(s));
			}
			System.out.println("Invalid : " + invalid);
		}
	}

}
