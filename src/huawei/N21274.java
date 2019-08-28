package huawei;

import java.util.*;

public class N21274 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				int num = in.nextInt();
				list.add(num);
			}
			int index = in.nextInt();
			System.out.println(list.get(list.size()-index));
		}
	}
}
