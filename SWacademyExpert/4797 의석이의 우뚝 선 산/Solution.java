import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
 
 
public class Solution {
		
	static int n,m,max=0;
	static int map[];
	static boolean visit[];
	static LinkedList<Long> arr;
	static int dx[] = {0,1,0,-1, 1,1,-1,-1};
	static int dy[] = {1,0,-1,0,-1,1, 1,-1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner sc = new Scanner(System.in);
    	int test_case = sc.nextInt();
    	
    	for(int T=1; T<=test_case; T++) {
    		int n = sc.nextInt();
    		map = new int[n+1];
    		
    		//StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int i=1; i<=n; i++)map[i]=sc.nextInt();
    		
    		int cnt1=0;
    		int cnt2=0;
    		int rst=0;
    		boolean flag=false;
    		
    		for(int i=1; i<=n-1; i++) {
    			if(flag && map[i+1] > map[i])cnt1++;
    			else if(!flag && map[i+1] > map[i]) {
    				flag = true;
    				rst += (cnt1 * cnt2);
    				cnt1 = 1; cnt2=0;
    				continue;
    			}
    			else if(flag && map[i+1] < map[i]) {
    				flag = false;
    				cnt2++;
    			}
    			else if(!flag && map[i+1] < map[i])cnt2++;
    		}
    		
    		rst +=cnt1*cnt2;
    		bw.write(String.valueOf("#"+T+" "+rst+"\n"));
    		bw.flush();
    		
       		}//test-case
    	}//main func
  	}//class

	 
