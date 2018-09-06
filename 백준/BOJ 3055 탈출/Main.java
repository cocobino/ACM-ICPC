   
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;




public class Main {
	
			static int r,c;
			static char arr[][];
			static boolean visit[][];
			static int dx[] = {1,-1,0,0};
			static int dy[] = {0,0,-1,1};
			static Queue<Node> water = new LinkedList<Node>();
			static Queue<Node> mice = new LinkedList<Node>();
			
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st= new StringTokenizer(br.readLine());
        r=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());
        
        arr = new char[r][c];
        visit = new boolean[r][c];
        //rst = new int[r][c];
        
        for(int i=0; i<r; i++) { //ют╥б
        	String a =br.readLine();
        	for(int j=0; j<c; j++) {
        		arr[i][j] = a.charAt(j);
        	}
        }
        
        for(int i=0; i<r; i++) {
        	for(int j=0; j<c; j++) {
        		if(arr[i][j]=='*')water.add(new Node(i,j));
        		if(arr[i][j]=='S')mice.add(new Node(i,j));
        	}
        }
        int ans=0;
        while(true) {
        	++ans;
        	if(mice.size()==0) {
        		bw.write(String.valueOf("KAKTUS"));
        		break;
        	}
        	extendWater();
        	if(extendmice()) {
        		bw.write(String.valueOf(ans));
        		break;
        	}
        	
        }
        bw.flush();
        
		}

	private static boolean extendmice() {
		// TODO Auto-generated method stub
		int size = mice.size();
		for(int i=0; i<size; i++) {
			Node cur = mice.poll();
			
			for(int j=0; j<4; j++) {
				int nextX = cur.x+dx[j];
				int nextY = cur.y+dy[j];
				
				if(0<=nextX && 0<=nextY && nextX<r && nextY <c) {
					if(arr[nextX][nextY]=='D') {
						mice.add(new Node(nextX,nextY));
						return true;
					}
					if(arr[nextX][nextY]=='.') {
						arr[nextX][nextY]='S';
						mice.add(new Node(nextX, nextY));
					}
				}
			}
		}
		return false;
	}

	private static void extendWater() {
		// TODO Auto-generated method stub
		int size = water.size();
		for(int i=0; i<size; i++) {
			Node curNode = water.poll();
				for(int j=0; j<4; j++) {
					int nextX = dx[j]+curNode.x;
					int nextY = dy[j]+curNode.y;
					water.add(new Node(nextX,nextY));
				}
		}
	}
		
	}

class Node {
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x =x;
		this.y =y;
		
	}	
}