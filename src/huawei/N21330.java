package huawei;

import java.util.Scanner;

public class N21330 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double n = in.nextDouble();
			double x = 1;
			while(Math.abs(x*x*x-n)>1e-5){
				x = x -(x*x*x - n) / (3*x*x);
			}
			System.out.printf("%.1f",x);
			
		}
		in.close();
	}
}
