package huawei;

import java.util.*;

public class N21324 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			int method = in.nextInt();
			if (method == 0) {
				for (int i = 0; i < n - 1; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println(arr[n - 1]);
			} else if (method == 1) {
				for (int i = n - 1; i > 0; i--) {
					System.out.print(arr[i] + " ");
				}
				System.out.println(arr[0]);
			}
		}
	}

}
