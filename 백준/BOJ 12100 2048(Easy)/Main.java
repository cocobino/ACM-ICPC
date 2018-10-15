import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
   //static int map[][],tmp[][];
   static boolean visit[][];
   static int n,max=0;
   
   static int dx[] = {-1,0,1,0}; //╩С, ©Л, го, аб
   static int dy[] = {0,1,0,-1};
   
   
    public static void main(String[] args) throws IOException {
    	n = Integer.parseInt(br.readLine());
    	
    	int map[][] = new int[n][n];
    	//tmp = new int[n][n];
    	
    	for(int i=0; i<n; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0; j<n; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    			max = Math.max(max, map[i][j]);
    		}
    	}//insert
    	
    	for(int i=0; i<4; i++) {
    		dfs(i,1,map);
    	}
     bw.write(String.valueOf(max));
     bw.flush();
   
   }//main


	private static void dfs(int where, int count, int[][] map) {
		// TODO Auto-generated method stub
		int tmp[][] = new int[n][n];
		
		switch(where) {
		//up
		case 0:
			for(int i=0; i<n; i++) {
			ArrayList<Integer> q = new ArrayList<>();
			for(int j=0; j<n; j++) {
				int temp = map[j][i];
				if(temp !=0) {
					q.add(temp);
				}
			}
			
			int nowposition=0;
			while(q.size()>0) {
				int tmpvalue = q.get(0);
				q.remove(0);
				if(tmpvalue>0) {
					if(q.size()>0) {
						if(tmpvalue == q.get(0)) {
							tmpvalue *=2;
							q.remove(0);
						}
					}
					tmp[nowposition][i]=tmpvalue;
					nowposition +=1;
				}
			}
		}
			break;
			
		case 1:
			//down
			for(int i=0; i<n; i++) {
				ArrayList<Integer> q= new ArrayList<>();
				for(int j=n-1; j>=0; j--) {
					int temp = map[j][i];
					if(temp !=0) {
						q.add(temp);
					}
				}
				int nowposition =n-1;
				
				while(q.size()>0) {
					int tmpvalue = q.get(0);
					q.remove(0);
					if(tmpvalue >0) {
						if(q.size()>0) {
							if(tmpvalue == q.get(0)) {
								tmpvalue *=2;
								q.remove(0);
							}
						}
						tmp[nowposition][i]=tmpvalue;
						nowposition -=1;
					}
				}
			}
			break;
			
		case 2:
			//left
			for(int i=0; i<n; i++) {
				ArrayList<Integer> q = new ArrayList<>();
				for(int j=0; j<n; j++) {
					int temp = map[i][j];
					if(temp !=0) {
						q.add(temp);
					}
				}
				int nowposition =0;
				while(q.size()>0) {
					int tempvalue = q.get(0);
					q.remove(0);
					if(tempvalue>0) {
						if(q.size()>0) {
							if(tempvalue ==q.get(0)) {
								tempvalue *=2;
								q.remove(0);
							}
						}
						tmp[i][nowposition]=tempvalue;
						nowposition +=1;
					}
				}
			}
			break;
			
		case 3:
			//right
			for(int i=0; i<n; i++) {
				ArrayList<Integer> q = new ArrayList<>();
				for(int j=n-1; j>=0; j--) {
					int temp = map[i][j];
					if(temp !=0) {
						q.add(temp);
					}
				}
				int nowposition = n-1;
				
				while(q.size()>0) {
					int tempvalue = q.get(0);
					q.remove(0);
					if(tempvalue>0) {
						if(q.size()>0) {
							if(tempvalue ==q.get(0)) {
								tempvalue *=2;
								q.remove(0);
							}
						}
						tmp[i][nowposition]= tempvalue;
						nowposition -=1;
					}
				}
			}
			break;
			default:
				break;
		}
		if(count ==5) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					max = Math.max(max, tmp[i][j]);
				}
			}
			return;
		}
		else {
			for(int i=0; i<4; i++) {
				dfs(i,count+1,tmp);
			}
		}
	}
 
  
}// class
  