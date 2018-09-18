import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static String ans;  
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	//	int T = Integer.parseInt(br.readLine());
	 
		for(int tc=1; tc<=10; tc++) {
			int n = Integer.parseInt(br.readLine());
			String tree[][] = new String[n][3];
			ans ="";
		for(int i=0; i<n; i++) {
		String tmp[] = br.readLine().split(" ");
			for(int j=1; j<tmp.length; j++) {
				tree[i][j-1] = tmp[j];
			}
		}
		
		pre(tree,0);
			
		bw.write(String.valueOf("#"+tc+" "+ans+"\n"));
		bw.flush();
		}//test-case
	}//main


	private static void pre(String[][] tree, int n) {
		// TODO Auto-generated method stub
		if(tree[n][1]==null) {
			ans +=tree[n][0];
			return;
		}
		pre(tree, Integer.parseInt(tree[n][1])-1);
		ans +=tree[n][0];
		if(tree[n][2] != null)pre(tree,Integer.parseInt(tree[n][2])-1);
	}
}//class
 
