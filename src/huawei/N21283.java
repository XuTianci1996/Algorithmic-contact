package huawei;

import java.math.BigInteger;
import java.util.*;

public class N21283 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int num = in.nextInt();
			if(num%2!=0){
				int n=num/2;
				int m = n+1;
				while(n>=1&&m<num-1){
				if(isPrime(n)&&isPrime(m)){
					System.out.println(n);
					System.out.println(m);
					break;
				}else{
					n--;
					m++;
				}}
			}else{
				int n=num/2;
				int m = n;
				while(n>=1&&m<num-1){
				if(isPrime(n)&&isPrime(m)){
					System.out.println(n);
					System.out.println(m);
					break;
				}else{
					n--;
					m++;
				}}
			}
		}
	}

	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0) return false;
		}
		return true;
	}
}
