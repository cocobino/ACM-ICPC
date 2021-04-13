import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int[][] tr = {{5, 1}, //0 
						{2, -1},//1
						{3, -1},//2
						{3, 4},//3
						{5, 7},//4
						{-1, 6},//5
						{5, 1},//6
						{8, 7},//7
						{3, 6},//8
						{-1,-1}};//9
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			
			boolean flag = chk(a);
			System.out.println(flag ? "YES" : "NO");
		}
	}

	private static boolean chk(String str) {
		int state = 0;
		for(int i=0; i<str.length(); i++) {
			int num  =str.charAt(i)-'0';
			state = tr[state][num];
			if(state == -1) return false;
		}
		
		return state == 4 || state == 6 || state ==7;
	}
	
}