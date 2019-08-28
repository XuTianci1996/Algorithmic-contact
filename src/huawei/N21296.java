package huawei;

import java.util.*;

public class N21296 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int year = in.nextInt();
			int month = in.nextInt();
			int day =in.nextInt();
			int[]  arr= {31,28,31,30,31,30,31,31,30,31,30};
			int allday = day;
			for(int i=0;i<month-1;i++){
				allday+=arr[i];
			}
			if(month>2){
				if(year%4==0){
					if(year%100!=0){
						allday++;
					}else if(year%400==0){
						allday++;
					}
				}
			}
			System.out.println(allday);
		}
	}

}
