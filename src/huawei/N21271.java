 package huawei;

import java.util.*;


public class N21271 {

	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int m = in.nextInt();
			int head = in.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			list.add(head);
			for(int i=0;i<m-1;i++){
				int val = in.nextInt();
				int loc = in.nextInt();
				int index = list.lastIndexOf(loc)+1;
				list.add(index, val);
			}
			Object o = in.nextInt();
			list.remove(o);
			
			for(int i=0;i<list.size()-1;i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println(list.get(list.size()-1)+" ");
			for(Integer i:list){
				System.out.print(i+" ");
			}
		}
	}

}
