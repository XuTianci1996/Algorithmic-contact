package huawei;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float f = in.nextFloat();
		int res = (int)f;
		if((f-res)*10>=5){
			res++;
		}
		System.out.println(res);
	}

}
