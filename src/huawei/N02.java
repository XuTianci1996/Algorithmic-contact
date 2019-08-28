package huawei;

import java.util.Scanner;

public class N02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] sps = str.split(" ");
        int res = 0;
        for(int i=0;i<sps[0].length();i++){
            if(sps[1].equals(sps[0].charAt(i)+"")){
                res++;
            }
        }
        System.out.println(res);
	}

}
