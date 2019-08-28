package Ëã·¨;

public class NumofSub {

	
	public static void main(String[] args) {
		System.out.println("A");
		new NumofSub();
		new NumofSub();
		 updateX(x);
	        updateY(y);
	        System.out.println(x+","+y);
	}
	
	public NumofSub(){
		System.out.println("B");
	}
	{
		System.out.println("C");
	}
	static{
		System.out.println("D");
	}
	  private static int x = 10;
	    private static Integer y = 10;

	    public static void updateX(int value) {
	        value = 3 * value;
	    }

	    public static void updateY(Integer value) {
	        value = 3 * value;
	    }

	    
}
