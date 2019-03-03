package leetcode;

import java.math.BigInteger;

public class MultiplyStrings {

	public static void main(String[] args) {
		System.out.println(multiply("123","456"));
	}
	
	public static String multiply(String num1, String num2) {
		BigInteger bi1=new BigInteger(num1);
		BigInteger bi2=new BigInteger(num2);
		return bi1.add(bi2).toString();
	}
}
