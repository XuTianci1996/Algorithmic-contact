package Ëã·¨;

import java.util.*;

public class AllRange {

	public static void main(String[] args) {
		Set<String> set = f("ABC");
		for (String s : set) {
			System.out.println(s);
		}
	}

	public static HashSet<String> f(String str) {
		HashSet<String> set = new HashSet<String>();
		if (str.length() <= 0)
			return set;
		func(str.toCharArray(), 0, set);
		return set;
	}

	public static void func(char[] str, int index, HashSet<String> set) {
		if (str.length == index) {
			set.add(new String(str));
			return;
		}
		for (int i = index; i < str.length; i++) {
			swap(str,i, index);
			func(str, index + 1, set);
			swap(str, i, index);
		}
	}

	public static void fun(char[] str, int k,HashSet<String> re) {
		if (k == str.length) {
			re.add(new String(str));
			return;
		}
		for (int i = k; i < str.length; i++) {
			swap(str, i, k);
			fun( str, k + 1,re);
			swap(str, i, k);
		}
	}

	private static void swap(char[] str, int i, int j) {
		char t = str[i];
		str[i] = str[j];
		str[j] = t;

	}
}
