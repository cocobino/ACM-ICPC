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
	 
	static int map[][] = new int[5][9];
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int cnt=0;
	static int ans=0, pincnt=0;
	
	static final int pin = 1;
	static final int wall =2;
	static final int blank =0;
	
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
		int test_case = Integer.parseInt(br.readLine());
		
		for(int T=0; T<test_case; T++) {
			cnt=0;
			for(int i=0; i<5; i++) {
				String a = br.readLine();
				for(int j=0; j<9; j++) {
					switch(a.charAt(j)) {
					case '#':
						map[i][j] = wall;
						break;
					case '.':
						map[i][j] = blank;
						break;
					case 'o':
						map[i][j] = pin;
						cnt++;
						break;
					}
				}
			}
			br.readLine();
			// insert
			
			
			pincnt = cnt; //전체핀 개수
			ans = cnt; 	// 남아있는 핀 개수
			for(int i=0; i<5; i++) {		
				for(int j=0; j<9; j++) {
					if(map[i][j] == pin)back(i,j);
				}
			}
			
			
			bw.write(String.valueOf(ans + " "+ (pincnt-ans)+"\n"));
			bw.flush();
		}// test_case
		
		
	}



	private static void back(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y + dy[i];
			int nnx =  nx+dx[i];
			int nny = ny+dy[i];
			
			if(nx>=0 && ny>=0 && nx<5 && ny<9 && map[nx][ny] ==pin) {
				if(nnx>=0 && nny>=0 && nnx<5 && nny<9 && map[nnx][nny]==blank) {
					map[x][y]=0;
					map[nx][ny]=0;
					map[nnx][nny]=1;
					cnt--;
					for(int j=0; j<5; j++) {
						for(int k=0; k<9; k++) {
							if(map[j][k]==pin)back(j,k);
						}
					}
					ans = Math.min(ans,cnt);
					map[x][y]=1;
					map[nx][ny]=1;
					map[nnx][nny]=0;
					cnt++;
				}
			}
		}
	}

 
}