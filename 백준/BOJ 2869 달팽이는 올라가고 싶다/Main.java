import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	 
 	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		 st = new StringTokenizer(br.readLine());
		 
		 int a = Integer.parseInt(st.nextToken()); // ���� �ö󰡴� ��
		 int b = Integer.parseInt(st.nextToken()); // �㿡 �������� ��
		 int v = Integer.parseInt(st.nextToken()); // ����
		 
		 int rst=0;
		 int cnt=0;
		 while(true) {
			 cnt++;
			 rst+=a;
			 if(rst>=v)break;
			 rst-=b;
		 }
		
		 bw.write(String.valueOf(cnt));
		 bw.flush();
	}//main


 
}//class   