import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	 /*
	  * a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
		���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
	  */
	
	long sum(int[] a) {
		long rst =0;
		BigInteger b = BigInteger.ZERO;
		
		for(int i=0; i<a.length; i++) {
			rst+=a[i];
		}
		
		return rst;
	}
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        
//        
//    }// main
//	 
     
}// class
   