package leetcode;

import java.util.Set;
import java.util.TreeSet;

public class LetterTilePossibilities {

	public static void main(String[] args) {
		System.out.println(numTilePossibilities("AB"));
	}

	static Set<String> set = new TreeSet<String>();
	public static int numTilePossibilities(String tiles) {
        if(tiles.length()==0) return set.size();
        boolean[] flag = new boolean[tiles.length()]; 
        boolean[] flag2 = new boolean[tiles.length()]; 
        for(int i=0;i<tiles.length();i++){
        	flag = flag2.clone();
        	flag[i] = true;
        	f(i,tiles,tiles.charAt(i)+"",flag);
        }
        for(String s:set){
        	System.out.println(s);
        }
        return set.size();
    }
	public static void f(int i, String tiles, String string, boolean[] flag) {
		if(string.length()!=0){
			set.add(string);
		}
		for(int j=0;j<tiles.length();j++){
			if(i!=j&&!flag[j]){
	        	flag[j] = true;
				f(i,tiles,string+tiles.charAt(j),flag);
				flag[j] = false;
			}
		}
		return;
	}
	
	
}
