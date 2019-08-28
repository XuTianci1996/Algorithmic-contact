package huawei;

public class Ad {

	public static void main(String[] args) {
		String s = "2+4+5-10";
		String[] splits = s.split("\\+|-");
		int n=0;
		int res=Integer.parseInt(splits[n++]);
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='-'){
				res-=Integer.parseInt(splits[n++]);
			}
			if(s.charAt(i)=='+'){
				res+=Integer.parseInt(splits[n++]);
			}
		}
		System.out.println(res);
	}

}
