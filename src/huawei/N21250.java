package huawei;
import java.util.*;
public class N21250 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			String[] strs = new String[n];
			for(int i=0;i<strs.length;i++){
				strs[i] = in.next();
			}
			String str = in.next();
			int k = in.nextInt();
			List<String> list = new ArrayList<String>();
			int count=0;
			char[] chs = str.toCharArray();
			Arrays.sort(chs);
			String s = "";
			for(int i =0;i<chs.length;i++){
				s+=chs[i];
			}
			System.out.println(s);
			for(int i=0;i<strs.length;i++){
				if(str.equals(strs[i])){
					continue;
				}
				char[] ch = strs[i].toCharArray();
				Arrays.sort(ch);
				String t = "";
				for(int j =0;j<ch.length;j++){
					t+=ch[j];
				}
				if(t.equals(s)){
					System.out.println(i+" "+strs[i]);
					count++;
					list.add(strs[i]);
				}
			}
			
			System.out.println(count+" "+k);
			if(k>=0&&k<=list.size()){
				System.out.println(list.get(k-1));
			}
		}
		
	}

}
