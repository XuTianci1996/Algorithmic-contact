package huawei;

import java.util.*;

/**
 * 连续最长的数字串的长度
 * 
 * @author Administrator
 *
 */
public class N21315 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			List<String> list = new ArrayList<String>();
			int[] len = new int[str.length()];
			if (str.length() == 0) {
				System.out.println(",0");
				return;
			} else {
				for(int i=0;i<str.length();i++){
					if(i==0){
						if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
							len[i] = 1;
						}
					}else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
						if(str.charAt(i-1)>='0'&&str.charAt(i-1)<='9'){
							len[i] = len[i-1]+1;
						}else{
							len[i]=1;
						}
					}
				}
			}
			int max = Integer.MIN_VALUE;
			for(int i:len){
				if(i>max) max = i;
			}
			for(int i=0;i<len.length;i++){
				if(len[i]==max){
					System.out.print(str.substring(i-max+1, i+1));
				}
			}
			System.out.println(","+max);
		}
	}

}
