import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String a = br.readLine();
		boolean flag=false;
		for(int i=0; i<a.length()-1; i++) {
			if(a.charAt(i) == a.charAt(i+1)) {
				flag =true;
				break;
			}
		}//for loop
		
		if(flag)System.out.println("No");
		else System.out.println("Yes");
		
	}//main
 
}//class
 