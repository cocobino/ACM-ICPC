import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		 
	static pole[] p;	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	 	 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //��ȣ���
		int L = Integer.parseInt(st.nextToken()); //���ΰŸ�
		p = new pole[1000];
		for(int i=0; i<1000; i++) p[i]=new pole(0,0);
		int way[] = new int[L];
		int light[] = new int[L];
		for(int i=0; i<N; i++) {
		st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken())-1;
		int R = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		//��ȣ�� ��ġ����
		//p[i].D =D;
		p[D].R =R;
		p[D].G =G;
		light[D]=1; //��ȣ�� ǥ��
		}
		int cnt=0;
		move(0,L,way,light,cnt);
		bw.write(String.valueOf(way[L-1]));
		bw.flush();
		
	}	
							// ������ġ,  ���α���, �ð�������,    ��ȣ�� ��ġ, �ð� ++;
	private static void move(int cur, int L, int[] way, int[] light, int cnt) {
		// TODO Auto-generated method stub
		cnt++;
		if(cur==L)return;
		if(light[cur] ==0 && cur<L) {//��ȣ���� ���� ������ġ�� ��������������� �̵�
			way[cur]=cnt;  
			move(cur+1, L, way, light,cnt);
		}
		else if(light[cur] !=0 && cur<L) {//��ȣ���� �ְ� ������ġ�� ���� ����� ������
			boolean lamp[] = new boolean[p[cur].R + p[cur].G];
			for(int i=0; i<p[cur].R; i++) {
				lamp[i]=true; //������
			}
			if(lamp[cnt%(p[cur].R+p[cur].G)]) {//���� ��ġ�� ��ȣ�� �������̶��
				way[cur]=cnt;
				move(cur,L,way,light,cnt); //��ٷ�����
			}else if(!lamp[cnt%(p[cur].R+p[cur].G)]) {//���� ��ġ ��ȣ�� �ʷ��̶��
				way[cur]=cnt;
				move(cur+1,L,way,light,cnt); //�̵�
			}
		}
		
	}
	 
}
 
class pole{
	int R,G;
	public pole( int R, int G) {
		// TODO Auto-generated constructor stub
		
		this.R=R;
		this.G=G;
	}
}