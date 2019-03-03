package Manacher;

public class Manacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(manacher("112321bbbbbbbbb"));
	}
	private static String manacher(String s) {
		// TODO Auto-generated method stub
		String st = "@";
		for (int i = 0; i < s.length(); i++) {
			st +="#" + s.charAt(i);
		}
		st += "#!";
		//System.out.println(st);
		int[] p = new int[st.length()];;
        int mx = 0, id = 0, resLen = 0, resCenter = 0;
        for (int i = 1; i < st.length()-1; ++i) {
            p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 1;
            while (((i - p[i])>=0) && ((i + p[i])<st.length()-1) && (st.charAt(i + p[i]) == st.charAt(i - p[i])))
                ++p[i];
            if (mx < i + p[i]) {
                mx = i + p[i];
                id = i;
            }
            if (resLen < p[i]) {
                resLen = p[i];
                resCenter = i;
            }
        }
        return s.substring((resCenter - resLen) / 2, (resCenter - resLen) / 2 + resLen-1);

	}
}
