package leetcode;

public class String_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("9223372036854775808"));
	}

	
	 public static int myAtoi(String str) {
		 double result = 0;
		 String st= str.trim();
		 if(st.length()<1 || st.equals(null)) return (int)result;
		 String flag="+";
		 int index = 0;
		 if(st.charAt(0)=='-'){
			 flag="-";
			 index++;
		 }else if (st.charAt(0)=='+'){
			 index++;
		}
		 while(st.length()>index && st.charAt(index)>='0'&&st.charAt(index)<='9'){
			 result = result*10 + (st.charAt(index)-'0');
			 index++;
		 }
		 if(flag.equals("-")){
			 result = - result;
		 }
		 if(result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
		 if(result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
	     return (int)result;
	 }
}
