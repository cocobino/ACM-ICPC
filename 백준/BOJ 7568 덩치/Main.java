import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		int table[][] = new int[test_case][2];
		int rank[] =new int[test_case];
		
		for (int i=0;i<test_case;i++) {
			rank[i] = 1;
		}
		
		for(int i=0;i<test_case;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			table[i][0] = Integer.parseInt(st.nextToken());
			table[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<test_case;i++) {
			for(int j=0; j<test_case;j++) {
				if(table[i][0]>table[j][0] && table[i][1]>table[j][1]) {
					rank[j]++;
				}
			}
		}
		for(int i=0; i<test_case;i++) {		
			System.out.print(rank[i]+" ");
		}
		
		
		}
}
