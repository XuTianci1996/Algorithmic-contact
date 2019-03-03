package leetcode;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		List<List<Integer>> ls = generate(3);
		System.out.println(ls);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 1; i <= numRows; i++) {
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
		return list;
    }
}
