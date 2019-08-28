package huawei;

import java.util.*;

public class N21240 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] sps = in.nextLine().split(";");
		in.close();
		int x = 0;
		int y = 0;
		for(int i=0;i<sps.length;i++){
			if(sps[i].length()>3||sps[i].length()<2) continue;
			if(sps[i].charAt(0)=='S'){
				//y-
				try{
					y-=Integer.parseInt(sps[i].substring(1));
				}catch(Exception e){
					continue;
				}
			}else if(sps[i].charAt(0)=='W'){
				try{
					y+=Integer.parseInt(sps[i].substring(1));
				}catch(Exception e){
					continue;
				}
				//y+
			}else if(sps[i].charAt(0)=='A'){
				//x-
				try{
					x-=Integer.parseInt(sps[i].substring(1));
				}catch(Exception e){
					continue;
				}
			}else if(sps[i].charAt(0)=='D'){
				//x+
				try{
					x+=Integer.parseInt(sps[i].substring(1));
				}catch(Exception e){
					continue;
				}
			}
		}
		System.out.println(x+","+y);
	}

}
