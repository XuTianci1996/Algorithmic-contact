package huawei;

public class N11206 {

	public static void main(String[] args) {
		System.out.println(isNumeric("123.45e+6".toCharArray()));
	}

	public static boolean isNumeric(char[] str){
		boolean e=false,flag=true,dot=false;
		for(int i=0;i<str.length;i++){
			if(str[i]=='e'||str[i]=='E'){
				if (i == str.length-1) return false;
				if(e) return false;
				e=true;
				dot=true;
				flag=false;
			}else if(str[i]=='-'||str[i]=='+'){
				if(i==0||(i>0&&(str[i-1]=='e'||str[i-1]=='E'))){
					flag = true;
				}else if(i>0 && flag) return false;
			}else if(str[i]=='.'){
				if(dot||e) return false;
				dot = true;
			}else if(str[i]<'0'||str[i]>'9'){
				return false;
			}
		}
		return true;
	}
}
