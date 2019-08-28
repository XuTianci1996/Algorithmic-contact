	package huawei;
	
	import java.util.*;
	
	public class N21270 {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				int n = in.nextInt();
				int m = in.nextInt();
				int[][] arr = new int[n][2];
				for(int i=0;i<n;i++){
					for(int j=0;j<2;j++){
						arr[i][j]=in.nextInt();
					}
				}
				
				List<String> list = new ArrayList<String>();
				for(int i=0;i<n;i++){
					if(i<n-1){
						int x = arr[i+1][0]-arr[i][0];
						//System.out.println(arr[i][0]+","+arr[i][1]);
						if(i-1>=0&&arr[i][0]!=arr[i-1][1]){
							list.add(arr[i][0]+" "+ arr[i][1]);
						}else if(i==0){
							list.add(arr[i][0]+" "+ arr[i][1]);
						}
						if(x==0){
							i++;
							continue;
						}
						for(int j=1;j<x;j++){
							//System.out.println(i+j);
							int num = arr[i][1]+((arr[i+1][1]-arr[i][1])/x)*j;
							list.add(arr[i][0]+j+" "+ num);
						}
					}else{
						if(arr[i][0]!=arr[i-1][0]){
							list.add(arr[i][0]+" "+ arr[i][1]);
						}
					}
				}
				for(String s:list){
					System.out.println(s);
				}
			}
		}
	
	}
