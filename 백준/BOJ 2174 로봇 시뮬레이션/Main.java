import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static char rotate[] = {'N', 'E', 'S', 'W'};
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static int A,B,N,M;
	static int map[][] = new int[102][102];
	static robot rb[] = new robot[102];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<102; i++)rb[i] = new robot(0, 0, 0);
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken()); //행
		B = Integer.parseInt(st.nextToken()); //열
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 로봇 개수와 위치
		M = Integer.parseInt(st.nextToken()); // 명령개수
		
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			String a = st.nextToken();
			char dirTmp = a.charAt(0);
			rb[i].x =x;
			rb[i].y =y;
			rb[i].dir = matching(dirTmp);
			map[x][y]=i;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			String command = st.nextToken();
			int cnt = Integer.parseInt(st.nextToken());
			
			if(command.equals("L")) {
				turnL(number,cnt);
			}
			else if(command.equals("R")) {
				turnR(number,cnt);
				}
			else if(command.equals("F")) {
				int rst = move(number,cnt);
				if(rst ==1) {
					bw.write(String.valueOf("Robot "+number+" crashes into the wall"+"\n"));
					bw.flush();
					System.exit(0);
				}
				else if(rst>1000) {
					bw.write(String.valueOf("Robot "+rst/1000+" crashes into robot "+ rst%1000+"\n"));
					bw.flush();
					System.exit(0);
				}
			}
		}
		bw.write(String.valueOf("OK"));
		bw.flush();
	}//main

	private static int move(int number, int cnt) {
		// TODO Auto-generated method stub
		for(int i=0; i<cnt; i++) {
			int x = rb[number].x;
			int y = rb[number].y;
			
			int nx = rb[number].x + dx[rb[number].dir];
			int ny = rb[number].y + dy[rb[number].dir];
			
			int pos = map[nx][ny];
			if(nx >=1 && ny>=1 && nx<=B && ny <=A) {
				if(pos==0) {
					map[x][y]=0;
					map[nx][ny] = number;
					rb[number].x = nx;
					rb[number].y = ny;
				}else
					return number*1000+pos;
			}
			else return 1;
		}
		return 0;
	}

	private static void turnR(int number, int cnt) {
		// TODO Auto-generated method stub
		int tmp = rb[number].dir + (cnt%4);
		rb[number].dir= tmp > 3 ? tmp-4 : tmp;
	}

	private static void turnL(int number, int cnt) {
		// TODO Auto-generated method stub
		int tmp = rb[number].dir - (cnt%4);
		rb[number].dir= tmp <0 ? tmp+4 : tmp;
	}

	private static int matching(char dirTmp) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			if(rotate[i]==dirTmp) return i;
		}
		return 0;
	}

}

class robot{
	int x,y,dir;
	public robot(int x, int y, int dir) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y =y;
		this.dir =dir;
	}
}