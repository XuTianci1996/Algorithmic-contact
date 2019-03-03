package offer;

public class No2 {

	public static void main(String[] args) {
		System.out.println(f(5000,0.2));
	}

	
	public static int f(double yu, double a) {
		int times = 1;
		double s = yu/2;
		while(yu/2*a<s){
			yu+= yu/2*(1+a);
			times++;
		}
		return times;
	}
}
