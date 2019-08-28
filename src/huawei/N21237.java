package huawei;

import java.util.*;

public class N21237{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            Map<String,Integer> map = new TreeMap<String,Integer>();
            for(int i=0;i<n;i++){
            	String str = in.next();
//            	if(map.containsKey(str)){
//            		map.put(str, map.get(str)+1);
//            	}else{
//            		map.put(str, 1);
//            	}
            	map.put(str, map.getOrDefault(str, 1)+1);
            }
            for(String str : map.keySet() ){
            	while(map.get(str)>1){
            		System.out.println(str);
            		map.put(str, map.get(str)-1);
            	}
            }
        }
    }
}
