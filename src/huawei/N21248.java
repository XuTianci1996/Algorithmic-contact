package huawei;

import java.util.*;

public class N21248 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		String[] I = new String[m];
		for (int i = 0; i < I.length; i++) {
			I[i] = in.next();
		}
		int n = in.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			set.add(in.nextInt());
		}
		StringBuffer sb = new StringBuffer();
		int count = 0;
		for (Integer R : set) {
			String s=String.valueOf(R);
			int count_t = 0;
			int flag = 0;
			StringBuffer sbt = new StringBuffer();
			for (int j = 0; j < I.length; j++) {
				// System.out.println(I[j].contains(R[i]+"")+"  "+ R[i]+"");
				if (I[j].contains(s)) {
					flag = 1;
					count_t++;
					count += 2;
					sbt.append(j + " ");
					sbt.append(I[j] + " ");
				}
			}
			if (flag == 1) {
				sb.append(R + " ");
				count += 2;
				sb.append(count_t + " ");
				sb.append(sbt);
			}
		}
		System.out.println(count + " " + sb.toString());
	}

}
