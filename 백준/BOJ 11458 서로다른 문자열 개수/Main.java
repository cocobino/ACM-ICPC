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
		
		String a = br.readLine();
		
		String[][] rst = new String[a.length()+1][a.length()+1];
		//String[][] ckrst = new String[a.length()+1][a.length()+1];
		
		
		for(int i=0; i<=a.length(); i++) {
			for(int j=0; j<=a.length()-i;j++) {
				for(int k=0; k<=i;k++) {
					rst[i][j] = a.substring(j,j+k);
				}
			}
		}
		//ckrst = rst;
		
		int cnt=0;
		for(int i=1; i<=a.length(); i++) {
			for(int j=0; j<=a.length(); j++) {
				if(rst[i][j] != null)cnt++;
				for(int k=j; k<a.length();k++) {
					if(rst[i][j] == rst[i][k+1])cnt--;
				}
			}
		}
		System.out.println(cnt);
			
	}
}