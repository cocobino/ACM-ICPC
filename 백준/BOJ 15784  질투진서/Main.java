import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int test_case = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		boolean check = true;
		int arr[][] = new int[test_case][test_case];
		

		for(int i=0; i<test_case; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<test_case; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<test_case; i++) {
			if(arr[x-1][y-1] < arr[i][y-1] || arr[x-1][y-1] < arr[x-1][i])check = false;
		}
		if(check == true)bw.write(String.valueOf("HAPPY"));
		else if(check == false)bw.write(String.valueOf("ANGRY"));
		bw.flush();
	}

}