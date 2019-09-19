import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	 /*
	  * a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
		리턴값: a에 포함되어 있는 정수 n개의 합
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
   