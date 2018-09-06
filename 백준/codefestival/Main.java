import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
	
	
	public static void main(String...args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		double tmp[] = new double[K];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)arr[i] = Integer.parseInt(st.nextToken()); // 선호도 입력

		Arrays.sort(arr);
		double min = Double.MAX_VALUE;
		double rst=0;
		int idx_num=0;

		for(int i=0; i<N; i++) {
			
		}
		
		
			double m = calm(tmp);
			rst =  cal(tmp);
			rst = Math.sqrt(rst);
			min = Math.min(rst, min);
		}
		
	
	
	 public static double calm(double[] tmp) {
	        double total = 0;
	        for (int i = 0; i < tmp.length; i++) {
	            total = total + tmp[i];
	        }
	        return total / tmp.length;
	    }


	public static double cal(double[] tmp) {
     return cal(tmp, calm(tmp));
 }

 
 public static double cal(double[] tmp, double m) {
     double totalDev = 0;

     for (int i = 0; i < tmp.length; i++) {
         totalDev = totalDev + (m - tmp[i]) * (m - tmp[i]);
     }

     // Sample estimate of variance so divide by n-1.
     return totalDev / (tmp.length);
 }

}
