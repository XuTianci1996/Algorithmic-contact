package leetcode;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(14));
	}

	/*
	 * �κν�βΪ0�����ض�����5*2���ɵ�
	 * ����ÿ��5�ı����ض�����һ��0��{5,10,15��20��25,30}
	 * ������ʱ25,125,625��������ɶ��5��ɵģ�����Ҫ���ǵ���Щ��������
	 * */
	public static int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
