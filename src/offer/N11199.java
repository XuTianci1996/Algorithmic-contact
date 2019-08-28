package offer;

import java.util.ArrayList;
import java.util.List;

public class N11199 {

	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(6, 7));
	}
	
	public static int LastRemaining_Solution(int n, int m) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
			list.add(i);
		}
        int step = m;
        System.out.println(list.size());
        while(list.size()>1){
        	if(step>list.size()){
        		step %= list.size();
        	}
        	list.remove(step-1);
        	step--;
        	step+=m;
        }
        return list.get(0);
    }
}
