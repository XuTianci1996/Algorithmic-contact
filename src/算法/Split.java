package 算法;

public class Split {

	public static void main(String[] args) {
		System.out.println(split(6, 6));
	}

	public static int split(int n,int m){
		if(n < 1 || m < 1) return 0;
		if(n == 1 || m == 1) return 1;
		//整数n小于要划分的数m的时候，那么划分数m的最大取值就是自身n
		if(n < m) return split(n, n);
		//为自身最大值+（划分数-1）的值
		if(n == m) return (split(n, m - 1) + 1);
		//等于划分数-1 +    整数（n-m）的划分数的和。
		if(n > m) return (split(n, m - 1) + split((n - m), m));
		return m;
	}
}
