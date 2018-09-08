import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
 
public class Solution {
		
	static int n,m,max=0;
	static int map[];
	static boolean visit[];
	
	static int dx[] = {0,1,0,-1, 1,1,-1,-1};
	static int dy[] = {1,0,-1,0,-1,1, 1,-1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    	
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	
    	double a = Integer.parseInt(st.nextToken());
    	double b = Integer.parseInt(st.nextToken());
    	double c = Integer.parseInt(st.nextToken());
    	double d = Integer.parseInt(st.nextToken());
    	
    	//bÀüa½Â , dÀüc½Â 
    	double rst1=a/b; //alice
    	double rst2=c/d; //bob
    	if(rst1>rst2) {
    		bw.write(String.valueOf("#"+T+" "+"ALICE"+"\n"));
    	}else if(rst1<rst2) {
    		bw.write(String.valueOf("#"+T+" "+"BOB"+"\n"));
    	}else {
    		bw.write(String.valueOf("#"+T+" "+"DRAW"+"\n"));
    	}
    	
    	bw.flush();
    		}//test-case
    	}//main func

	
 	}//class

	 
