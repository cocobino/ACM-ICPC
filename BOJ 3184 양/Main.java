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

    static int n,m;
	static int map[][], tmp[][];
	static boolean numbervisit[][];
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static final int o = -1;
	static final int v = -2;
	static final int wall = -3;
	static final int blank = 0;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        map = new int[n][m];
        tmp = new int[n][m];
        numbervisit = new boolean[n][m];
        
        for(int i=0; i<n; i++) {
        	String a = br.readLine();
        	for(int j=0; j<m; j++) {
        		char b = a.charAt(j);
        		switch (b) {
        		case '#':
        			map[i][j] = wall;
        			break;
        		case 'o':
        			map[i][j] = o;
        			break;
        		case 'v':
        			map[i][j] = v;
        			break;
        		case '.':
        			map[i][j] =blank;
        			break;
        		}
        		
        	}
        }// insert
        int numbering=0;
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++) {
        		if( (map[i][j] == o || map[i][j] ==v || map[i][j] == blank) && !numbervisit[i][j]) {
        			numbering++;
        			tmp[i][j]=numbering;
        			number(i,j, numbering);
        		}
        	}
        }
       /* 
        //  그래프 넘버링 상태좀 확인 ㅇ_ㅇ
        for(int i=0; i<n; i++) {
        	for(int j=0; j<m; j++) {
        		bw.write(String.valueOf(tmp[i][j]+" "));
        	}
        	bw.write(String.valueOf("\n"));
        }
        bw.flush();
        */
       int Ocnt =0; int Vcnt=0;
       int rsto =0; int rstv=0;
       for(int i=1; i<=numbering; i++) {
    	   Ocnt =0; Vcnt=0;
    	   for(int j=0; j<n; j++) {
    		   for(int k=0; k<m; k++) {
    			   if(tmp[j][k]==i && map[j][k]==o)Ocnt++;
    			   if(tmp[j][k]==i && map[j][k]==v)Vcnt++;
    		   }
    	   }
    	 if(Ocnt>Vcnt) {
    		 Vcnt=0;
    		 rsto +=Ocnt;
    	 }
    	 if(Ocnt<Vcnt) {
    		 Ocnt=0;
    		 rstv +=Vcnt;
    	 }
    	 else {
    		 Ocnt=0;
    		 rstv+=Vcnt;
    	 }
       }
        
       bw.write(String.valueOf(rsto+" "+rstv));
       bw.flush();
       

       
	}

	private static void number(int x, int y, int numbering) {
		// TODO Auto-generated method stub
		if(numbervisit[x][y])return;
		numbervisit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x+ dx[i];
			int ny = y+ dy[i];
			
			if(nx<0 || ny<0 || nx>=n || ny>=m)continue;
			if(map[nx][ny]==wall)continue;
			if(numbervisit[nx][ny])continue;
			tmp[nx][ny]=numbering;
			number(nx,ny, numbering);
		}
		
		
	}
}

