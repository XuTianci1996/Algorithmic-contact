package �㷨;

public class Split {

	public static void main(String[] args) {
		System.out.println(split(6, 6));
	}

	public static int split(int n,int m){
		if(n < 1 || m < 1) return 0;
		if(n == 1 || m == 1) return 1;
		//����nС��Ҫ���ֵ���m��ʱ����ô������m�����ȡֵ��������n
		if(n < m) return split(n, n);
		//Ϊ�������ֵ+��������-1����ֵ
		if(n == m) return (split(n, m - 1) + 1);
		//���ڻ�����-1 +    ������n-m���Ļ������ĺ͡�
		if(n > m) return (split(n, m - 1) + split((n - m), m));
		return m;
	}
}
