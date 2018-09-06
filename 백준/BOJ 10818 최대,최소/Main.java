import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		int arr[] = new int[test_case];
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<test_case ;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(arr);
		
		bw.write(String.valueOf(arr[0]+" "+arr[test_case-1]));
		bw.flush();
	}
}
