package huawei;

import java.util.*;

public class N21256 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String ip = in.next();
			int num = in.nextInt();
			String[] ips = ip.split("\\.");
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<ips.length;i++){
				String str = Integer.toBinaryString(Integer.parseInt(ips[i]));
				if(str.length()!=8){
					for(int j =0;j<8-str.length();j++){
						sb.append("0");
					}
					sb.append(str);
				}else{
					sb.append(str);
				}
			}
			int iptonum = Integer.parseInt(sb.toString(), 2);
			String st = Integer.toBinaryString(num);
			int len = 32-st.length();
			StringBuffer s = new StringBuffer();
			s.append(Integer.parseInt(st.substring(0, 8-len),2));
			st = st.substring(8-len);
			for(int i=1;i<3;i++){
				s.append("."+Integer.parseInt(st.substring(0, 8),2));
				st = st.substring(8);
			}
			s.append("."+Integer.parseInt(st,2));
			System.out.println(iptonum);
			System.out.println(s.toString());
		}
	}

}
