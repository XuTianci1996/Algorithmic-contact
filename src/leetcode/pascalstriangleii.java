package leetcode;

import java.util.ArrayList;
import java.util.List;

public class pascalstriangleii {

	public static void main(String[] args) {
		List<Integer> list = getRow(4);
		System.out.println(list);
	}

	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 1; i <= rowIndex; i++) {
			List<Integer> ls = new ArrayList<Integer>();
			for (int j = 1; j <= i; j++) {
				if(i==1){
					ls.add(1);
				}else if(j == 1 || j == i ){
					ls.add(1);
				}else{
					List<Integer> lt = list.get(i-2);
					ls.add(lt.get(j-2)+lt.get(j-1));
				}
			}
			list.add(ls);
		}
		return list.get(list.size()-1);
    }
}
