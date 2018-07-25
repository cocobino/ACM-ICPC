import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 
 

public class Main {
	
		static int N,M;
		static char map[][];
		static boolean visit[][][][];
		static int dx[] = {-1,1,0,0};
		static int dy[] = {0,0,-1,1};
		
		
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	 StringTokenizer st = new StringTokenizer(br.readLine());
    	 N = Integer.parseInt(st.nextToken());
    	 M = Integer.parseInt(st.nextToken());
    	 
    	 map = new char[N][M];
    	 int rx = 0,ry=0,bx=0,by=0;
    	 for(int i=0; i<N ; i++) {
    		 String a = br.readLine();
    		 for(int j=0; j<M; j++) {
    			 map[i][j]= a.charAt(j);
    			 if(map[i][j] == 'R') {
    				 rx = i;
    				 ry = j;
    			 }
    			 else if(map[i][j] =='B') {
    				 bx =i;
    				 by =j;
    			 }
    			 
    		 }
    	 }
    	 
    	 Queue<Node> q = new LinkedList<Node>();
    	 visit = new boolean[11][11][11][11];
    	 q.offer(new Node(rx, ry, bx, by,0));
    	 visit[rx][ry][bx][by] = true;
    	 
    	 boolean chkR, chkB; // �Ķ����� ���������� ���ۿ� ������ ?
    	 
    	int nbx=0, nby=0, nrx=0, nry=0;
    	while(!q.isEmpty()) {
    		Node curNode = q.poll();  
    		for(int i=0; i<4; i++) {
    			int  cnt =1;
    			chkR =false; chkB =false;
    			
    			while(true) {
    				nbx = curNode.bx +dx[i]*cnt;
    				nby = curNode.by +dy[i]*cnt;
    				
    				if(map[nbx][nby] =='#') {
    					nbx = nbx -dx[i];
    					nby = nby -dy[i];
    					break; // �����ڸ��� ���ư��� �׸� ������
    				}
    				else if(map[nbx][nby]=='O') {
    					chkB = true;
    					break;
    				}
    				cnt++;
    				
    			}//�Ķ��� ������
    			cnt=1;
    			
    			while(true) {
    				nrx = curNode.rx + dx[i]*cnt;
    				nry = curNode.ry + dy[i]*cnt;
    				
    				if(map[nrx][nry] =='#') {
    					nrx = nrx -dx[i];
    					nry = nry -dy[i];
    					break;
    				}else if(map[nrx][nry]== 'O') {
    					chkR =true;
    					break;
    				}
    				
    				cnt++;
    			}// ������ ������
    			
    			if(chkB = true) {
    				continue;
    			}
    			if(chkR =true) {
    				if(curNode.count+1 <=10) {
    					bw.write(String.valueOf(curNode.count+1));
    					bw.flush();
    					System.exit(0);
    				}else {
    					bw.write(String.valueOf("-1"));
    					bw.flush();
    					System.exit(0);
    				}
    			}
    			
    			if(nbx == nrx && nby == nry)
				{
					//�����̱� ���� ���� ������ ��ġ ���
					
					//���� �Ķ������̶� ���� ������ ���� x��ǥ�� �ִ� �����ε�
					if(curNode.bx == curNode.rx)
					{
						//������ �������� �������� ���
						if(i == 3)
						{
							//���� R B ��ġ���ٸ�
							if(curNode.by > curNode.ry)
							{
								nry = nry - dy[i]; //R������ ��ĭ �������� �ű��
							}
							//���� B R ��ġ���ٸ�
							else if(curNode.by < curNode.ry)
							{
								nby = nby - dy[i]; //B������ ��ĭ �������� �ű��
							}
						}
						//���� �������� �������� ���
						else if(i == 2)
						{
							//���� R B ��ġ���ٸ�
							if(curNode.by > curNode.ry)
								nby = nby - dy[i]; //B������ ��ĭ ��������
							//���� B R ��ġ���ٸ�
							else if(curNode.by < curNode.ry)
								nry = nry - dy[i]; //R������ ��ĭ ��������
						}
					}
					//���� �Ķ������� ���� ������ ���� y��ǥ�� �ִ� ���¿�����
					else if(curNode.by == curNode.ry)
					{
						//���� �������� ���
						if(i == 0)
						{
							/*
							 * ����
							 * R
							 * B ������
							 */
							if(curNode.bx > curNode.rx)
								nbx = nbx - dx[i]; //B������ ��ĭ ������ 
							/*
							 * ����
							 * B
							 * R ������
							 */
							else if(curNode.bx < curNode.rx)
								nrx = nrx - dx[i]; //R������ ��ĭ ������
						}
						//�Ʒ��� �������� ���
						else if(i == 1)
						{
							/*
							 * ����
							 * R
							 * B ������
							 */
							if(curNode.bx > curNode.rx)
								nrx = nrx - dx[i]; //R������ ��ĭ ����
							/*
							 * ���� 
							 * B
							 * R ������
							 */
							else if(curNode.bx < curNode.rx)
								nbx = nbx - dx[i]; //B������ ��ĭ ����
						}
					}
				}
				
				//�̹� �湮�ߴٸ�...
				if(visit[nrx][nry][nbx][nby] == true)
					continue;
				
				//�ƴ϶��...
				visit[nrx][nry][nbx][nby] = true;
				q.offer(new Node(nrx, nry, nbx, nby, curNode.count+1)); //�������� ���� ���������� �Ķ����� ��ǥ �ְ� count �ϳ� ����
			}
		}
		
		System.out.println(-1);
 	}
 }


class Node {
	int rx,ry, bx, by, count;
	public Node(int rx, int ry, int bx, int by, int count) {
		// TODO Auto-generated constructor stub
		this.rx =rx;
		this.ry =ry;
		this.bx =bx;
		this.by =by;
		this.count = count;
		
	}
}