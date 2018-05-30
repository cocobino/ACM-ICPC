import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat format = new DecimalFormat(".###");


		StringTokenizer st =new StringTokenizer(br.readLine());
		int test_case = Integer.parseInt(st.nextToken());
		double arr[] = new double[test_case];
		double max =0;
		double rst=0;
		
		st =new StringTokenizer(br.readLine());
		for(int i=0; i<test_case; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]>max)max=arr[i];
					}
		
		for(int i=0; i<test_case; i++) {
			arr[i] = (arr[i]/max)*100;
		}
		
		for(int i=0; i<test_case; i++) {
			rst += arr[i];
		}
		bw.write(String.valueOf(format.format(rst/test_case)));
		bw.flush();		
		
	}

}
