package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
		System.out.println(compress(chars));
	}

	
	public static int compress(char[] chars) {
		Arrays.sort(chars);
		if(chars.length==1){
			return 1;
		}
		int count=1;
		int index = 0;
		char c = chars[0];
		int result = 0;
		for (int i = 1; i < chars.length; i++) {
			if(chars[i]==c){
				count++;
			}else{
				if(count!=1){
					chars[index] = c;
					result++;
					index++;
					String str = count+"";
					for(int j=0 ;j<str.length();j++){
						chars[index] = str.charAt(j);
						result++;
						index++;
					}
					count =1;
					c = chars[i];
				}else{
					chars[index] = c;
					result++;
					index++;
					c = chars[i];
				}
			}
		}
		if(count!=1){
			chars[index] = c;
			result++;
			index++;
			String str = count+"";
			for(int j=0 ;j<str.length();j++){
				chars[index] = str.charAt(j);
				result++;
				index++;
			}
		}
		
		return result;
    }
}
