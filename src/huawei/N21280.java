package huawei;

import java.math.BigInteger;
import java.util.*;

public class N21280 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String n = in.next();
			String m = in.next();
			BigInteger b1 = new BigInteger(n);
			BigInteger b2 = new BigInteger(m);
			System.out.println(b1.add(b2));
		}
	}

}
