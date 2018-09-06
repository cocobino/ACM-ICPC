import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);

		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		cal(1, E,S,M);
		
		
		
		
	}

	private static void cal(int i, int E, int S, int M) {
		// TODO Auto-generated method stub
		int a = ((i-1)%15)+1;
		int b = ((i-1)%28)+1;
		int c = ((i-1)%19)+1;
		
		if(b==S &&(a!=E ||c!=M)) {
			cal(i+28,E,S,M);
		}
		if((a!=E||b!=S)&&c==M) {

			cal(i+19,E,S,M);

		}

		if(a==E&&(b!=S||c!=M)) {

			cal(i+15,E,S,M);

		}

		if(a!=E&&b!=S&&c!=M) {

			cal(i+1,E,S,M);

		}
		System.out.println(i);
		//System.exit(0);
		return;
		
	}
