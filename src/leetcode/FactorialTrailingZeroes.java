package leetcode;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(14));
	}

	/*
	 * 任何结尾为0的数必定是有5*2构成的
	 * 所以每逢5的倍数必定产生一个0，{5,10,15，20，25,30}
	 * 但是有时25,125,625本身就是由多个5组成的，所以要考虑到这些特殊的情况
	 * */
	public static int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
