package huawei;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class N21241 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int E=0;
		int error=0;
		int priva=0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(192);
		list.add(128);
		list.add(224);
		list.add(240);
		list.add(248);
		list.add(252);
		list.add(254);
		list.add(0);
		while(in.hasNext()){
			String[] strs = in.next().split("~");
//			String strs = in.nextLine();
			String[] s = strs[1].split("\\.");
//			System.out.println(func(s,0,list,0));
			if(func(s,0,list,0)&&isValidFormat(strs[0])){
				System.out.println(strs[0]);
				String[] st = strs[0].split("\\.");
				int head = Integer.parseInt(st[0]);
				if(head>0&&head<127){
					A++;
					if(head==10) priva++;
				}else if(head>127&&head<192){
					B++;
					if(head==172&&Integer.parseInt(st[1])>15&&Integer.parseInt(st[1])<32) priva++;
				}else if(head>191&&head<224){
					C++;
					if(head==192&&Integer.parseInt(st[1])==168) priva++;
				}else if(head>223&&head<240){
					D++;
				}else if(head>239&&head<256){
					E++;
				}
			}else{
				error++;
			}
			System.out.println(A+" "+B+" "+C+" "+D+" "+E+" "+error+" "+priva);
		}
	}

		private static boolean isValidFormat(String ip) {
		        boolean res = true;
		        if (ip == null || "".equals(ip))
		            return false;
		        Pattern pattern = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$");
		        Matcher matcher = pattern.matcher(ip);
		         
		        if (matcher.matches()) {
		            String[] nums = ip.split("\\.");
		            for (String num : nums) {
		                int n = Integer.valueOf(num);
		                if (n < 0 || n > 255) {
		                    res = false;
		                    break;
		                }
		            }
		        } else {
		            res = false;
		        }
		         
		        return res;
		    }
		 

	public static boolean func(String[] s,int start,List<Integer> list,int flag){
		if(start<s.length-1){
			if(flag==1){
				if(Integer.parseInt(s[start])==0){
					return func(s,start+1,list,flag);
				}else{
					return false;
				}
			}else if(s[start].equals("255")){
				return func(s,start+1,list,flag);
			}else if(list.contains(Integer.parseInt(s[start]))){
				flag=1;
				return func(s,start+1,list,flag);
			}else{
				return false;
			}
		}
		if(s[start].equals("0")){
			return true;
		}
		return false;
	}
}
