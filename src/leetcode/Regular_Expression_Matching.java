package leetcode;

public class Regular_Expression_Matching {

	public static void main(String[] args) {
		System.out.println(isMatch("bbbba", ".*a*a"));
	}

	public static boolean isMatch(String s, String p) {
		// ��pΪ��ʱ
		if (p.length() == 0)
			return s.length() == 0;
		// ��p����Ϊ1ʱ
		if (p.length() == 1)
			return (s.length() == 1)
					&& (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
		
		if (p.charAt(1) != '*') {
			if (s.length() == 0)
				return false;
			else
				//�����һ����ͬ��ô�ͱȽ���һ���ַ�
				return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')
						&& isMatch(s.substring(1), p.substring(1));
		} else {   //�ڶ���Ϊ*
			while (s.length() > 0
					&& (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
				// �ж�*������Ƿ��sƥ��
				if (isMatch(s, p.substring(2)))
					return true;
				s = s.substring(1);//�ַ���ȥͷ
			}
			return isMatch(s, p.substring(2));
		}
	}
}
