package huawei;

import java.util.*;

public class N21313 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str[] = in.nextLine().split("\\.");
			if(Integer.parseInt(str[0])>0&&Integer.parseInt(str[0])<256){
				if(Integer.parseInt(str[1])>=0&&Integer.parseInt(str[1])<256){
					if(Integer.parseInt(str[2])>=0&&Integer.parseInt(str[2])<256){
						if(Integer.parseInt(str[3])>=0&&Integer.parseInt(str[3])<256){
							System.out.println("YES");
							continue;
						}
					}
				}
			}
			System.out.println("NO");
		}
	}

}
