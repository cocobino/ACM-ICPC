import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	static int n,m;
	static char map[][];
	static int rst[][];
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //우,좌,하,상
	static int dy[] = {1,-1,0,0};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

	st = new StringTokenizer(br.readLine());
	
	n = Integer.parseInt(st.nextToken()); //경기수
	m = Integer.parseInt(st.nextToken()); //위원회
	
	int[] a = new int[n];
	int[] man = new int[m];
	for(int i=0; i<n; i++) {
		a[i] = Integer.parseInt(br.readLine());
	}
	
	for(int j=0; j<m; j++) {
		man[j] = Integer.parseInt(br.readLine());
	}
	
	int[] cnt = new int[n+1];
	
	//위원회 사람
	for(int i=0; i<m; i++) {
		//경기수를 찾기
		for(int j=0; j<n; j++) {
			if(man[i]>=a[j]) {
				cnt[j]++;
				break;
			}
		}
	}
	 
	
	int max  = Integer.MIN_VALUE;
	
	for(int i=0; i<cnt.length; i++)max =Math.max(max, cnt[i]);
	for(int i=0; i<cnt.length; i++) {
		if(max == cnt[i]) {
			bw.write(String.valueOf(i+1));
			break;
		}
	}

	bw.flush();
	
	}//main 
 
}// classg
  