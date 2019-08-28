package huawei;

public class N11181 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2};
		System.out.println(MoreThanHalfNum_Solution(arr));
	}

	public static int MoreThanHalfNum_Solution(int [] array) {
        int num = array[0];
        int count = 1;
        for(int i=1;i<array.length;i++ ){
        	System.out.println(count);
            if(array[i]==num){
                count++;
            }else{
                count--;
                if(count<0){
                    num=array[i];
                    count = 0;
                }
            }
        }
        count = 0;
        for(int i=0;i<array.length;++i)
        {
            if(array[i] == num) ++count;
        }
        System.out.println(count);
        return (count >= array.length/2) ? num : 0;
    }
}
