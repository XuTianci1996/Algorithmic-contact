package huawei;

import java.util.*;

public class N21242 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		while (in.hasNext()) {
			String str = in.next();
			int line = in.nextInt();
			String[] strs = str.split("\\\\");
			String last = strs[strs.length - 1];
			if (last.length() > 16) {
				last = last.substring(last.length() - 16);
			}
			
			String key = last + " " + line;
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
		}
		int count = 0;
		for (String key : map.keySet()) {
			count++;
			if (count > (map.keySet().size() - 8)) // 输出最后八个记录
				System.out.println(key + " " + map.get(key));
		}
	}

}
