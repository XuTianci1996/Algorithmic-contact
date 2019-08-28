package huawei;

import java.math.BigInteger;
import java.util.*;

public class N21301 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String num1 = in.next();
			String num2 = in.next();
			BigInteger bi1 = new BigInteger(num1);
			BigInteger bi2 = new BigInteger(num2);
			System.out.println(bi1.add(bi2));
		}
	}

}
