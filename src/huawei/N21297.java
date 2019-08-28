package huawei;

import java.util.*;

public class N21297 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();

			StringBuffer sb = new StringBuffer();
			int len = 0;
			int quotaNum = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '\"') {
					quotaNum++;
					continue;
				}
				if (str.charAt(i) != ' ') {
					sb.append(str.charAt(i));
				} else if (quotaNum % 2 == 0) {
					sb.append('\n');
					len++;
				} else {
					sb.append(' ');
				}
			}
			System.out.println(len + 1);
			System.out.println(sb.toString());
		}
		in.close();
	}

}
