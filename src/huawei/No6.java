package huawei;

import java.util.Scanner;

public class No6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n!=1){
			for(int i=2 ; i<=n ; i++){
				if( n%i == 0){
					System.out.println(i);
					n /= i;
					break;
				}
			}
		}
	}

}
