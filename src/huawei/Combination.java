package huawei;

public class Combination {

	void combination(String s) {
        char[] strs = s.toCharArray();
        int n = s.length();
        int nbit = 1 << n;
        for (int i = 0; i < nbit; i++) {

            for (int j = 0; j < n; j++) {

                int tmp = 1 << j; // ��0��n����λ
                //System.out.println( tmp );
                if ((tmp & i) != 0) { // �����㣬ͬΪ1ʱ�Ż���1
                    System.out.print(strs[j]);
                }

            }
            System.out.println();
        }
        System.out.println("�����Ϊ:" + (nbit - 1));
    }
    public static void main(String[] args) {
        new Combination().combination("cgz");
        //System.out.println();
    }

}
