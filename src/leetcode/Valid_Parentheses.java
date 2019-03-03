package leetcode;

import java.util.ArrayList;

public class Valid_Parentheses {

	public static void main(String[] args) {
		System.out.println(isValid("[])"));
	}

	public static boolean isValid(String s) {
		if (s.length() < 1)
			return true;
		ArrayList<Character> arr = new ArrayList<Character>();
		arr.add(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (arr.size() > 0) {
				if ((s.charAt(i) == ']' && arr.get(arr.size() - 1) == '[')
						|| (s.charAt(i) == '}'
								&& arr.get(arr.size() - 1) == '{' || (s
								.charAt(i) == ')' && arr.get(arr.size() - 1) == '('))) {
					arr.remove(arr.size() - 1);
				} else {
					arr.add(s.charAt(i));
				}
			} else {
				arr.add(s.charAt(i));
			}
		}
		if (arr.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
