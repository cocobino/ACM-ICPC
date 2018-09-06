import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	//	Scanner sc = new Scanner(System.in);
		int test_case = Integer.parseInt(br.readLine());
		int[] input = new int[10001];
		int[] dp = new int[10001];
		
		
		for(int i=1 ;i<=test_case; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0]=0;
		dp[1]= input[1];
		dp[2]= input[1]+input[2];
		
		for(int i=3; i<=test_case; i++) {
			
			dp[i] = max(dp[i-1], dp[i-2]+input[i], dp[i-3]+input[i]+input[i-1]);
			
		}	
		System.out.println(dp[test_case]);
				
		
		
		
		}

	private static int max(int i, int j, int k) {
		// TODO Auto-generated method stub
		int max=0;
		if(i>=j && i>=k)max=i;
		else if(j>=i && j>=k)max=j;
		else if(k>=i && k>=j)max=k;
		
		return max;
	}


	}
	
	
