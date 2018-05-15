import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=test_case-54;i<test_case ; i++) {
			int tmp =i, sum =i;
			
			while(tmp != 0) {
				sum += tmp %10;
				tmp /= 10;
			}
			cnt++;
			if(sum ==test_case) {
				System.out.println(i);break;
			}
			if(cnt==54 && sum != test_case) {
				System.out.println(0);
			}
				
			}
		
		}		
		
		
		
		}
		
	

