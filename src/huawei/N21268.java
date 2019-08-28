package huawei;

import java.util.*;

public class N21268 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			String[] strs = new String[n];
			for(int i=0;i<n;i++){
				strs[i] = in.next();
				
			}
			for(int i=0;i<n;i++){
				System.out.println(goal(strs[i]));
			}
		}
	}
	
	public static int goal(String str){
		Map<Character,Integer> hashmap = new HashMap<Character, Integer>();
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if(!hashmap.containsKey(str.charAt(i))){
				hashmap.put(str.charAt(i), 1);
				count++;
			}else{
				hashmap.put(str.charAt(i), hashmap.get(str.charAt(i))+1);
			}
		}
		Map<Integer,String> treemap = new TreeMap<Integer, String>();
		for(char ch : hashmap.keySet()){
			if(!treemap.containsKey(hashmap.get(ch))){
				treemap.put(hashmap.get(ch), ch+"");
			}else{
				treemap.put(hashmap.get(ch),treemap.get(hashmap.get(ch)) + ch+"");
			}
		}
		int result = 0;
		int n = 26-count+1;
		for(int num : treemap.keySet()){
			if(treemap.get(num).length()>1){
				result += num*(n+n+treemap.get(num).length()-1)*treemap.get(num).length()/2;
				n += treemap.get(num).length();
			}else if(treemap.get(num).length()==1){
				result += n*num;
				n++;
			}
		}
		return result;
	}

}
