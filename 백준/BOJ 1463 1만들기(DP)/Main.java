import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int X = Integer.parseInt(br.readLine());
		int[] dp = new int[X+1];
		
		dp[0]=dp[1]=0;
		
		for(int i=2; i<=X; i++) {
			dp[i] = dp[i-1]+1; // �Է°��� -1�� �̸�����ص� �����ּҰ��� �ȴ�.
			if(i %2 ==0)dp[i] = Math.min(dp[i], dp[i/2]+1); //X-1 �ּ� ���� ���� ���簪 X/3 ���� �ּҿ��갪�� ��
			if(i %3 ==0)dp[i] = Math.min(dp[i], dp[i/3]+1); //X-1 �ּ� ���� ���� ���簪 X/2 ���� �ּҿ��갪�� ��
			
		}// �ݺ�~
		System.out.println(dp[X]);
		
		
		
		
		}


	}
	
	
