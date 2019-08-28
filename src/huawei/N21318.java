package huawei;

import java.util.*;

public class N21318 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double num = in.nextDouble();
			String[] str = String.valueOf(num).split("\\.");
			String high = str[0];
			String low = str[1];
			StringBuffer highsb = new StringBuffer(high);
			StringBuffer lowsb = new StringBuffer(low);
			StringBuffer sb = new StringBuffer();
			for(int i = 0;i<high.length();i++){
				if(highsb.length()>7){
					String s = high.substring(0,highsb.length()-7);
				}
			}
		}
	}

}
