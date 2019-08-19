import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static char map[][] = new char[10][10];
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		
		boolean flag =false;
		for(int i=0; i<n; i++) {
			String a = br.readLine().trim();
			
			if(!flag)flag = a.equals("anj") ? true : false; 
		}
			
		if(flag)System.out.println("构具;");
		else System.out.println("构具?");
		
	
	}// main

}// class
