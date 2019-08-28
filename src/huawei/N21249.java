package huawei;
import java.util.*;
public class N21249 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			char[] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				int t = 0;
				for (int j = 0; j < ch.length - i; j++) {
					if(!Character.isLetter(ch[t])) {
						t = j;
						continue;
					}
					if (Character.isLetter(ch[j])) {
						if (Character.toLowerCase(ch[t]) > Character
								.toLowerCase(ch[j])) {
							char temp = ch[t];
							ch[t] = ch[j];
							ch[j] = temp;
						}
						t = j;
					} 
				}
			}
			StringBuffer Sb = new StringBuffer();
			for (int i = 0; i < ch.length; i++) {
				Sb.append(ch[i] + "");
			}
			System.out.println(Sb.toString());
		}
	}

}
