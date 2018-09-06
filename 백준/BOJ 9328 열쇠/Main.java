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

class Main{ // ���� ���� 
	 // -> �ܺο��� �������� �������̱� ������ 
	 // -> �ƿ� �迭 ũ�⸦ +2 �� �ؼ� ���������� �� '.'���� �ٲ��ְ� ���� 
	 // - > �׷��� 0,0 ���� �����ؼ��� �� �� Ȯ�� 
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
		
		for(int i =0 ; i< n+2 ; i++){ // �ٱ����� '.'���� ����� 
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
		 if(str.charAt(0)!='0'){ // 0�� �ƴҶ� �ҹ��� �� ���� �������ִ�(true)�� �ٲ� 
			 alpha[str.charAt(i)-'a'] = true;
		 }
		}
		
		result =0; // �ʱ�
		q.offer(new n_9328(0,0)); // 0,0 ���� ���� �ؼ� 
		
		while(!q.isEmpty()){
			n_9328 p = q.poll();
		
		  for(int i =0; i<4; i++){
			  int x = p.x+dx[i];
			  int y = p.y+dy[i];
			  if(x>=0 && y>=0 && x<n+2 && y<m+2 && map[x][y] != '*'){
				  if(visit[x][y] == false){
					  visit[x][y] = true;
					 
					  if(map[x][y] =='.'){ // '.' �̸� ������
							  q.offer(new n_9328(x,y));
					  }
					  else if(map[x][y] =='$'){ // ���� ������ result ���� �ϰ� '.'�� �ٲ��ش� 
						  result ++;
						  map[x][y] = '.';
							  q.offer(new n_9328(x,y));
					  }
					  else if(map[x][y] >='a' && map[x][y] <='z'){ //�ҹ��� �� �����϶��� alpha �迭 true�� �ϰ� '.'���� �ٲ��ش� .
						  alpha[map[x][y]-'a'] = true;
						  map[x][y] = '.';
						  
						 q.clear(); // ���迡 �����ϸ� ��� ť�� �ִ°� Ŭ���� �� 
						  //�湮 �迭 �� �ʱ�ȸ �� �ű���� �� �� ���� 
						  visit = new boolean[n+2][m+2];
					      visit[x][y] = true;
					     
						   q.offer(new n_9328(x,y));  
					      
					  }
					  
					  else{
						  if(alpha[map[x][y] - 'A']==true){ // �빮�� �� ���϶��� �ű⿡ �´� ���谡 �ִ��� ���� ������ '.'���� �ٲ��ش� 
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