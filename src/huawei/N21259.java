	package huawei;
	
	import java.util.*;
	
	public class N21259 {
	
		static String origal = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				String key = in.next().toUpperCase();
				String data = in.next();
				StringBuffer k = new StringBuffer();
				for(int i=0;i<key.length();i++){
					char t= key.charAt(i);
					if(k.indexOf(t+"")==-1){
						//System.out.println(i);
						k.append(t);
					}
				}
				for(int i=0;i<26;i++){
					char t= (char)('A'+i);
					if(k.indexOf(t+"")==-1){
						//System.out.println(i);
						k.append(t);
					}
				}
				System.out.println(k);
				String key_low = k.toString().toLowerCase();
				String key_up = k.toString();
				StringBuffer sb = new StringBuffer();
				for(int i=0;i<data.length();i++){
					if(data.charAt(i)>='a'&&data.charAt(i)<='z'){
						sb.append(key_low.charAt(data.charAt(i)-'a'));
					}else if(data.charAt(i)>='A'&&data.charAt(i)<='Z'){
						sb.append(key_up.charAt(data.charAt(i)-'A'));
					}
				}
				System.out.println(sb.toString());
			}
		}
	
	}
