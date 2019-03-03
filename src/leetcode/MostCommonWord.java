package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostCommonWord {

	public static void main(String[] args) {
		String paragraph = "bob,hit,ball";
		String[]	banned = {"hit","bob"};
		System.out.println(mostCommonWord(paragraph, banned));
	}

	public static String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
		char[] chars = paragraph.toCharArray();
        Map<String, Integer> map = new HashMap<String, Integer>();
        String s="";
        for (int i = 0; i < chars.length; i++) {
        	if(chars[i]>='a'&&chars[i]<='z'){
        		s+=chars[i];
        		if(i == chars.length-1){
        			if(!map.containsKey(s)){
        				map.put(s,1);
        			}else{
        				map.put(s,map.get(s)+1);
        			}
        		}
        	}else{
        		if(!s.equals("") && !Ban(banned,s)){
        			if(!map.containsKey(s)){
        				map.put(s,1);
        			}else{
        				map.put(s,map.get(s)+1);
        			}
        		}
        		s = "";
        	}
		}
        if(map.isEmpty() && !Ban(banned, paragraph)){
        	return paragraph;
        }
        int max=0;
        String result="";
		for(Entry<String, Integer> m : map.entrySet()){
			int t = m.getValue();
			if(t>max){
				max = t;
				result = m.getKey();
			}
		}
		return result;
    }
	
	public static Boolean Ban(String[] banned,String s){
		for(int i=0;i<banned.length;i++){
			if(banned[i].equals(s)) return true;
		}
		return false;
	}
}
