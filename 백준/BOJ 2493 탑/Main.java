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
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	 
	static int n;
	static int map[], rst[], stack[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		n = Integer.parseInt(br.readLine());
		map = new int[n+1];
		rst = new int[n+1];
		stack = new int[n+1];
		
		 
		st =new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}//insert
		
		int p=0;
		for(int i=n-1; i>=0; i--) {
			//������ ��������ʰ� ������ �ֻ����� �ε����ٸ�
			
			while(p>0 && map[i] >= map[stack[p-1]] ) {
				int chk = map[stack[p-1]];
				//���� ���� �ε����� ���������� �ݺ�
						//pop
				int idx =stack[(p--)-1];
				
				rst[idx]=i+1;
			}
			//stack���� �ε�������
			stack[p++]=i;
		}
		
		for(int i=0; i<n; i++) {
			bw.write(String.valueOf(rst[i]+" "));
		}
		bw.flush();
		
		bw.newLine();
		
	 
		
	}//main

}//class
 