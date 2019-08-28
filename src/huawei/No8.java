package huawei;

import java.util.*;

public class No8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			Map<Integer,Integer> map = new TreeMap<Integer, Integer>();
			for(int i=0;i<n;i++){
				int x= in.nextInt();
				int y =in.nextInt();
				if(map.containsKey(x)){
					map.put(x, map.get(x)+y);
				}else{
					map.put(x, y);
				}
			}
			for(Integer m:map.keySet()){
				System.out.println(m+" "+map.get(m));
			}
		}
	}

}
