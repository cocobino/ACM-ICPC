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
		
		static int n,x,ans;
		static int map[][];
 		static boolean visit[];
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=0; T<test_case; T++) {
    		StringTokenizer st= new StringTokenizer(br.readLine());
    		n = Integer.parseInt(st.nextToken());
    		x = Integer.parseInt(st.nextToken());
    		ans=n*2;
    		map = new int[n*2][n];
    		
    		for(int i=0; i<n; i++) {
    			st= new StringTokenizer(br.readLine());
    			for(int j=0; j<n; j++) {
    				map[i][j] = Integer.parseInt(st.nextToken());
    			}
    		}
    		
    		for(int i=n; i<n*2; i++) {
    			for(int j=0; j<n; j++) {
    				map[i][j] = map[j][i-n];
    			}
    		}
    		//insert
    		
    		/*
    		 * solve
    		 */
    		
    		for(int i=0; i<n*2; i++) {
    			//해당라인 높이 1줄 복사
    			int hgt[] = new int[n];
    			visit = new boolean[n];
    			
    			for(int j=0; j<n; j++) {
    				hgt[j]=map[i][j];
    			}

    			//복사한 라인 한칸씩 탐색
    			for(int k=0; k<n-1; k++) {
    				//같은칸이면 다음칸탐색
    				if(hgt[k]==hgt[k+1])continue;
    				//높이차이가 1이고 내리막이면 앞의 x칸이 평평한지 봐야함
    				else if(hgt[k]-hgt[k+1]==1) {
    					if(searchnext(hgt,k+1,x,visit)) {
    						
    						continue;
    					}
    					else {
    						ans--;
    						break;
    					}
    				}
    				//높이차이가 1이고 오르막이면 이전이 x칸이 평평한지 봐야함
    				else if(hgt[k]-hgt[k+1]==-1) {
    					if(searchpre(hgt,k+1,x,visit)) {
    						
    						continue;
    					}
    					else {
    						ans--;
    						break;
    					}
    				}
    				//높이차이가 2이상이면 빼주기
    				else {
    					ans--;
    					break;
    				}
    			}
    			
    		}
    		bw.write(String.valueOf("#"+(T+1)+" "+ans+"\n"));
    		bw.flush();
    	}//test_case
    	
    	
	}// main

	private static boolean searchpre(int[] hgt, int cur, int x, boolean visit[]) {
		// TODO Auto-generated method stub
		//오르막 시작점 이전에 x 길이만큼 설치가 불가시 return false;
		if(cur-x<0)return false;
		//이전의 x만큼 길이가 일정하지 않다면 false
		for(int i= cur-1; i>=cur-x ;i--) {
			if(hgt[i] != hgt[cur-1])return false;
			if(visit[i])return false;
			visit[i]=true;
		}
		return true;
	}

	
	private static boolean searchnext(int[] hgt, int cur, int x, boolean visit[]) {
		// TODO Auto-generated method stub
		//내리막 시작점에서 x길이만큼 장애물 설치 불가시 return false
		if(cur+x-1>=n)return false;
		//앞의 x만큼 길이가 일정하지않다면
		for(int i=cur; i<cur+x; i++) {
			if(hgt[i] != hgt[cur])return false;
			if(visit[i])return false;
			visit[i] = true;
		}
		return true;
	}

	 
}