package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisitCount {

	public static void main(String[] args) {
		String[] s = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org","2 com" };
		List<String> list = new ArrayList<String>();
		list = subdomainVisits(s);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static List<String> subdomainVisits(String[] cpdomains) {
		List<String> list = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < cpdomains.length; i++) {
			String[] s = cpdomains[i].split(" ");
			if (map.containsKey(s[1])) {
				map.put(s[1], Integer.parseInt(s[0]) + map.get(s[1]));
			} else {
				map.put(s[1], Integer.parseInt(s[0]));
			}

			int index1 = s[1].indexOf(".");
			s[1] = s[1].substring(index1 + 1);
			if (map.containsKey(s[1])) {
				map.put(s[1], Integer.parseInt(s[0]) + map.get(s[1]));
			} else {
				map.put(s[1], Integer.parseInt(s[0]));
			}
			if(index1 == -1 ) break;

			int index2 = s[1].indexOf(".");
			s[1] = s[1].substring(index2 + 1);
			if (map.containsKey(s[1]) && index2 != -1) {
				map.put(s[1], Integer.parseInt(s[0]) + map.get(s[1]));
			} else if (!map.containsKey(s[1]) && index2 != -1) {
				map.put(s[1], Integer.parseInt(s[0]));
			}
		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			StringBuffer sb = new StringBuffer();
			sb.append(m.getValue().toString()).append(" ").append(m.getKey());
			list.add(sb.toString());
		}
		return list;
	}

}
