package leetcode;
import java.util.*;

public class GenerateParentheses {

	public static void main(String[] args) {
		List<String> l = generateParenthesis(3);
		for(String s:l){
			System.out.println(s); 
		}
	}

	static List<String> list = new ArrayList<String>();
	public static List<String> generateParenthesis(int n) {
        if(n<1) return list;
        f(n,1,"(",1);
		return list;
    }
	public static void f(int n, int i, String str,int len) {
		if(i==0&&len==2*n){
			if(!list.contains(str)){
				list.add(str);
			}
			return;
		}
		if(i<0&&i>n) return;
		if(i>=0&&len<2*n){
			f(n,i+1,str+"(",len+1);
			f(n,i-1,str+")",len+1);
		}
		return;
	}
}
