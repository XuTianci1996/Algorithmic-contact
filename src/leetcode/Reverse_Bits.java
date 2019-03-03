package leetcode;

public class Reverse_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseBits(43261596));
	}

	public static int reverseBits(int n) {
		int result = 0;
		int least;
		for (int i = 0; i < 32; i++) {
			least = n & 1;
			n >>= 1;
			result <<= 1; 
			result |= least; 
		}
		return result;
	}
}
