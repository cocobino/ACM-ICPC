import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
 
public class Solution {
		
		static int n,x,ans;
		static int map[][];
 		static boolean visit[];
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=0; T<test_case; T++) {
    		StringTokenizer st= new StringTokenizer(br.readLine());
    		n = Integer.parseInt(st.nextToken());
    		x = Integer.parseInt(st.nextToken());
    		ans=n*2;
    		map = new int[n*2][n];
    		
    		for(int i=0; i<n; i++) {
    			st= new StringTokenizer(br.readLine());
    			for(int j=0; j<n; j++) {
    				map[i][j] = Integer.parseInt(st.nextToken());
    			}
    		}
    		
    		for(int i=n; i<n*2; i++) {
    			for(int j=0; j<n; j++) {
    				map[i][j] = map[j][i-n];
    			}
    		}
    		//insert
    		
    		/*
    		 * solve
    		 */
    		
    		for(int i=0; i<n*2; i++) {
    			//�ش���� ���� 1�� ����
    			int hgt[] = new int[n];
    			visit = new boolean[n];
    			
    			for(int j=0; j<n; j++) {
    				hgt[j]=map[i][j];
    			}

    			//������ ���� ��ĭ�� Ž��
    			for(int k=0; k<n-1; k++) {
    				//����ĭ�̸� ����ĭŽ��
    				if(hgt[k]==hgt[k+1])continue;
    				//�������̰� 1�̰� �������̸� ���� xĭ�� �������� ������
    				else if(hgt[k]-hgt[k+1]==1) {
    					if(searchnext(hgt,k+1,x,visit)) {
    						
    						continue;
    					}
    					else {
    						ans--;
    						break;
    					}
    				}
    				//�������̰� 1�̰� �������̸� ������ xĭ�� �������� ������
    				else if(hgt[k]-hgt[k+1]==-1) {
    					if(searchpre(hgt,k+1,x,visit)) {
    						
    						continue;
    					}
    					else {
    						ans--;
    						break;
    					}
    				}
    				//�������̰� 2�̻��̸� ���ֱ�
    				else {
    					ans--;
    					break;
    				}
    			}
    			
    		}
    		bw.write(String.valueOf("#"+(T+1)+" "+ans+"\n"));
    		bw.flush();
    	}//test_case
    	
    	
	}// main

	private static boolean searchpre(int[] hgt, int cur, int x, boolean visit[]) {
		// TODO Auto-generated method stub
		//������ ������ ������ x ���̸�ŭ ��ġ�� �Ұ��� return false;
		if(cur-x<0)return false;
		//������ x��ŭ ���̰� �������� �ʴٸ� false
		for(int i= cur-1; i>=cur-x ;i--) {
			if(hgt[i] != hgt[cur-1])return false;
			if(visit[i])return false;
			visit[i]=true;
		}
		return true;
	}

	
	private static boolean searchnext(int[] hgt, int cur, int x, boolean visit[]) {
		// TODO Auto-generated method stub
		//������ ���������� x���̸�ŭ ��ֹ� ��ġ �Ұ��� return false
		if(cur+x-1>=n)return false;
		//���� x��ŭ ���̰� ���������ʴٸ�
		for(int i=cur; i<cur+x; i++) {
			if(hgt[i] != hgt[cur])return false;
			if(visit[i])return false;
			visit[i] = true;
		}
		return true;
	}

	 
}