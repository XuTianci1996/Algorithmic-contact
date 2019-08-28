package huawei;

import java.util.*;

public class N21310 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int goal = 0;
			int countLowChar = 0;
			int countUpperChar = 0;
			int countNumber = 0;
			int countOther = 0;
			String str = in.nextLine();
			if(str.length()>=8){
				goal+=25;
			}else if(str.length()<5){
				goal+=5;
			}else{
				goal+=10;
			}
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
					countNumber++;
				}else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
					countLowChar++;
				}else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
					countUpperChar++;
				}else{
					countOther++;
				}
			}
			if(countNumber>1){
				goal+=20;
			}else if(countNumber==1){
				goal+=10;
			}
			if(countLowChar!=0&&countUpperChar!=0){
				goal+=20;
			}else if(countLowChar!=0 || countUpperChar!=0){
				goal+=10;
			}
			if(countOther>1){
				goal+=25;
			}else if(countOther==1){
				goal+=10;
			}
			if(countNumber>0&&(countLowChar>0||countUpperChar>0)){
				goal+=2;
				if(countOther>0){
					goal+=3;
					if(countLowChar>0&&countUpperChar>0){
						goal+=5;
					}
				}
			}
			if(goal>=90){
				System.out.println("VERY_SECURE ");
			}else if(goal>=80){
				System.out.println("SECURE");
			}else if(goal>=70){
				System.out.println("VERY_STRONG");
			}else if(goal>=60){
				System.out.println("STRONG");
			}else if(goal>=50){
				System.out.println("AVERAGE");
			}else if(goal>=25){
				System.out.println("WEAK");
			}else if(goal>0){
				System.out.println("VERY_WEAK");
			}
		}
	}

}
