package leetcode;

public class Regular_Expression_Matching {

	public static void main(String[] args) {
		System.out.println(isMatch("bbbba", ".*a*a"));
	}

	public static boolean isMatch(String s, String p) {
		// 当p为空时
		if (p.length() == 0)
			return s.length() == 0;
		// 当p长度为1时
		if (p.length() == 1)
			return (s.length() == 1)
					&& (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
		
		if (p.charAt(1) != '*') {
			if (s.length() == 0)
				return false;
			else
				//如果第一个相同那么就比较下一个字符
				return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
						&& isMatch(s.substring(1), p.substring(1));
		} else {   //第二个为*
			while (s.length() > 0
					&& (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
				// 判断*后面的是否和s匹配
				if (isMatch(s, p.substring(2)))
					return true;
				s = s.substring(1);//字符串去头
			}
			return isMatch(s, p.substring(2));
		}
	}
}
