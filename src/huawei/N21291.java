package huawei;

import java.util.*;

public class N21291 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int flag = in.nextInt();
			Map<Integer, String> map = new TreeMap<Integer, String>();
			for(int i=0;i<n;i++){
				String str = in.next();
				int goal = in.nextInt();
				if(!map.containsKey(goal)){
					map.put(goal, str);
				}else{
					map.put(goal, map.get(goal)+"+"+str);
				}
			}
			StringBuffer sb = new StringBuffer();
			for(Integer goal:map.keySet()){
				if(map.get(goal).indexOf("+")!=-1){
					String[] str = map.get(goal).split("\\+");
					if(flag==1){
						for(int i=0;i<str.length;i++){
							sb.append(str[i]+" "+goal+"\n");
						}
					}else{
						for(int i=str.length-1;i>=0;i--){
							sb.append(str[i]+" "+goal+"\n");
						}
					}
					
				}else{
					sb.append(map.get(goal)+" "+goal+"\n");
				}
			}
			if(flag==1){
				String[] str = sb.toString().split("\n");
				for(int i=0;i<str.length;i++){
					System.out.println(str[i]);
				}
			}else{
				String[] str = sb.toString().split("\n");
				for(int i=str.length-1;i>=0;i--){
					System.out.println(str[i]);
				}
			}
		}
	}

}
