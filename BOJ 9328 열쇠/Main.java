import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class n_9328{
	int x, y;
	n_9328(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Main{ // 열쇠 문제 
	 // -> 외부에서 시작점이 여러개이기 때문에 
	 // -> 아예 배열 크기를 +2 로 해서 끝에라인을 다 '.'으로 바꿔주고 시작 
	 // - > 그래서 0,0 부터 시작해서ㅈ 쭉 다 확인 
	static int n, m;
	static char map[][];
	static boolean visit[][];
	static boolean alpha[];
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static int result ;
	static Queue<n_9328> q;
 public static void main(String[] args) throws IOException{
	BufferedReader bf=  new BufferedReader(new InputStreamReader(System.in));
	int testcase = Integer.parseInt(bf.readLine());
	for(int t= 1; t<=testcase; t++){
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n+2][m+2];
		visit = new boolean [n+2][m+2];
		alpha = new boolean [26];
		q= new LinkedList<>();
		
		String str="";
		
		for(int i =0 ; i< n+2 ; i++){ // 바깥라인 '.'으로 만들고 
			map[i][0] = '.';
			map[i][m+1] = '.';
			if(i!=0 && i!= n+1){
			str = bf.readLine();
			}
			for(int j =0; j<m+2; j++){
			 map[0][j] = '.';
			 map[n+1][j] = '.';
			 if(i!=0 && i!=n+1 && j!=0 && j!=m+1){
				map[i][j] = str.charAt(j-1);
			 }
			}
		}

		
		str = bf.readLine();
		for(int i =0; i<str.length(); i++){
		 if(str.charAt(0)!='0'){ // 0이 아닐때 소문자 즉 열쇠 가지고있다(true)로 바꿈 
			 alpha[str.charAt(i)-'a'] = true;
		 }
		}
		
		result =0; // 초기
		q.offer(new n_9328(0,0)); // 0,0 부터 시작 해서 
		
		while(!q.isEmpty()){
			n_9328 p = q.poll();
		
		  for(int i =0; i<4; i++){
			  int x = p.x+dx[i];
			  int y = p.y+dy[i];
			  if(x>=0 && y>=0 && x<n+2 && y<m+2 && map[x][y] != '*'){
				  if(visit[x][y] == false){
					  visit[x][y] = true;
					 
					  if(map[x][y] =='.'){ // '.' 이면 갈수있
							  q.offer(new n_9328(x,y));
					  }
					  else if(map[x][y] =='$'){ // 문서 먹으면 result 증가 하고 '.'로 바꿔준다 
						  result ++;
						  map[x][y] = '.';
							  q.offer(new n_9328(x,y));
					  }
					  else if(map[x][y] >='a' && map[x][y] <='z'){ //소문자 즉 열쇠일때는 alpha 배열 true로 하고 '.'으로 바꿔준다 .
						  alpha[map[x][y]-'a'] = true;
						  map[x][y] = '.';
						  
						 q.clear(); // 열쇠에 도착하면 모든 큐에 있는거 클리어 후 
						  //방문 배열 또 초기회 후 거기부터 다 시 시작 
						  visit = new boolean[n+2][m+2];
					      visit[x][y] = true;
					     
						   q.offer(new n_9328(x,y));  
					      
					  }
					  
					  else{
						  if(alpha[map[x][y] - 'A']==true){ // 대문자 즉 문일때는 거기에 맞는 열쇠가 있는지 보고 있을시 '.'으로 바꿔준다 
							  map[x][y] = '.';
							  visit[x][y] =true;
							  q.offer(new n_9328(x,y));
						  }
					  }
					  
				  }
			  }
			  
		  }
		}
		
		System.out.println(result);
		
	}
 }

}