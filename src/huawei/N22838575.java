package huawei;

import java.util.*;

public class N22838575 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				list.add(i);
			}
			int index =2;
			while(list.size()>1){
				index %= list.size();
				list.remove(index);
				index+=2;
			}
			System.out.println(list.get(0));
		}
	}

}
