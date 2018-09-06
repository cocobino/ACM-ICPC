		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
			
			
			
			
		public class Main {
			
				static int h,w;// h= 높이 , w = 넓이
				static char map[][] = new char[1001][1001];
				static boolean firevisit[][] = new boolean[1001][1001];
				static boolean visit[][] = new boolean[1001][1001];
				static int dx[]= {0,0,-1,1};
				static int dy[] = {1,-1,0,0};
				static Queue<Node> sang = new LinkedList<Node>();
				static Queue<Node> fire = new LinkedList<Node>();
			
		    public static void main(String[] args) throws IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		        int test_case = Integer.parseInt(br.readLine());
		        
		        for(int T=0; T<test_case; T++) {
		        	StringTokenizer st = new StringTokenizer(br.readLine());
		        	w = Integer.parseInt(st.nextToken()); // 넓이
		        	h= Integer.parseInt(st.nextToken()); // 높이
		        	
		        	init();
		        	
		        	for(int i=0; i<h; i++) {
		        		String a =br.readLine();
		        		for(int j=0; j<w; j++) {
		        			map[i][j] = a.charAt(j);
		        			
		        			if(map[i][j] =='@')sang.add(new Node(i,j));
		        			if(map[i][j] =='*')fire.add(new Node(i,j));
		        		}
		        	}// insert
		        	
		        	int ans=-1;
		        	boolean ret = false;
		        	while(!sang.isEmpty() && !ret) {
		        		ans++;
		        		
		        		//fire move
		        		if(!fire.isEmpty()) {
		        		int size = fire.size();
		        		for(int i=0; i<size; i++) {
		        			Node curNode = fire.poll();
		        			
		        			for(int j=0; j<4; j++) {
		        				int nextX = curNode.x + dx[j];
		        				int nextY = curNode.y + dy[j];
		        				
		        				if(nextX <0 || nextX >=h || nextY <0 || nextY>w)continue;
		        				if(firevisit[nextX][nextY])continue;
		        				if(map[nextX][nextY] == '#')continue;
		        				
		        				map[nextX][nextY] = '*';
		        				firevisit[nextX][nextY]=true;
		        				fire.add(new Node(nextX, nextY));
		        			}
		        		}
		        	}
		        		
		        		// 상근 이 움직임
		        		int size = sang.size();
		        		for(int i=0; i<size; i++) {
		        			Node cur = sang.poll();
		        if(cur.x ==0 || cur.y ==0 || cur.x ==h-1 || cur.y ==w-1) {
		        	bw.write(String.valueOf(ans+1+"\n"));
		        	ret=true;
		        	break;
		        }
		        			for(int j=0; j<4; j++) {
		        				int nextX = cur.x+ dx[j];
		        				int nextY = cur.y+ dy[j];
		        				
		        				if(nextX <0 || nextX >=h || nextY <0 || nextY>w)continue;
		        				if(visit[nextX][nextY])continue;
		        				if(map[nextX][nextY] == '#' ||map[nextX][nextY] == '*' )continue;
		        				visit[nextX][nextY]=true;
		        				sang.add(new Node(nextX, nextY));
		        				
		        			}
		        		}
		        		
		        		
		        	
		        	} // while end
		        	
		        	if(!ret)bw.write(String.valueOf("IMPOSSIBLE\n"));
			}//test_case
		    bw.flush();
		}//main();
				private static void init() {
				
				// TODO Auto-generated method stub
				for(int i=0; i<h; i++) {
				Arrays.fill(visit[i], false);
				Arrays.fill(firevisit[i], false);
				Arrays.fill(map[i], ' ');
				}
			}
		}
		
		class Node{
			int x,y;
			public Node(int x, int y) {
				// TODO Auto-generated constructor stub
				this.x =x;
				this.y =y;
			}
		}
		