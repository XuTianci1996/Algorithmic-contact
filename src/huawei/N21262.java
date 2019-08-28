package huawei;

import java.util.*;

public class N21262 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String mask = in.next();
			String ip1 = in.next();
			String ip2 = in.next();
			String[] masks = mask.split("\\.");
			String[] ip1s = ip1.split("\\.");
			String[] ip2s = ip2.split("\\.");
			boolean flag = true;
			for(int i=0;i<masks.length;i++){
				if((Integer.parseInt(ip1s[i]) & Integer.parseInt(masks[i]))!=(Integer.parseInt(ip2s[i]) & Integer.parseInt(masks[i]))){
					System.out.println(ip1s[i]);
					flag =false;
				}
			}
			if(flag){
				System.out.println(0);
			}else{
				System.out.println(2);
			}
		}
	}

}
