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
		 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int pointer =1; //���� �ֻ��� ��ġ
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N =Integer.parseInt(st.nextToken()); //n ����
		int M =Integer.parseInt(st.nextToken()); // �ֻ��� ����
		
		int line[] = new int[1001];
		for(int i=1; i<=N; i++) {
			line[i]=Integer.parseInt(br.readLine());
		}
		int ans=0;
		for(int i=1; i<=M; i++) {
			int dice = Integer.parseInt(br.readLine());
			ans++; //�ֻ����� ������ �� ���
			pointer += dice; //�ֻ��� ��ġ��ŭ�̵�
			
			if(pointer>=N) {//N ĭ�� ������ ����� ����
				bw.write(String.valueOf(i));
				bw.flush();
				System.exit(0);
			}
			pointer += line[pointer]; // �ش� ĭ���� 1�� ���븸ŭ �̵�
			
			if(pointer>=N) {//N ĭ�� ������ ����� ����
				bw.write(String.valueOf(i));
				bw.flush();
				System.exit(0);
			}
			
			
			
			
			 
		}
		
		
	}
}