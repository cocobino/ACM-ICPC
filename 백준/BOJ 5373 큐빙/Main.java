import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
/*
public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	static int n,k;
	static boolean visit[][],chk[][];
	static int rst=0;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static char U[][],D[][],L[][],R[][],F[][],B[][];
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int test_case =Integer.parseInt(br.readLine());
		U = new char[3][3];
		D = new char[3][3];
		L = new char[3][3];
		R = new char[3][3];
		F = new char[3][3];
		B = new char[3][3];
		
		 
		for(int T=0; T<test_case; T++) {
			init();
			int n = Integer.parseInt(br.readLine());
			String com[] = br.readLine().split(" ");
			
			for(int i=0; i<com.length; i++) {
					 if(com[i].equals("L-")) leftminus();
				else if(com[i].equals("L+"))leftplus();
				else if(com[i].equals("U-"))upminus();
				else if(com[i].equals("U+"))upplus();
				else if(com[i].equals("D+"))backplus();
				else if(com[i].equals("D-"))backminus();
				else if(com[i].equals("R+"))rightplus();
				else if(com[i].equals("R-"))rightminus();
			}//for loop
			
			//print
			print();
			bw.flush();
			
		}//test_case
 
	}//main


	private static void rightminus() {
		// TODO Auto-generated method stub
		char tmp1[] = new char[3];
		  
		for(int i=0; i<3; i++)tmp1[i]=U[i][2];
		for(int i=0; i<3; i++)U[i][2]=F[i][2];
		for(int i=0; i<3; i++)F[i][2]=D[i][2];
		for(int i=0; i<3; i++)D[i][2]=B[i][2];
		for(int i=0; i<3; i++)B[i][2]=tmp1[i];
		
		
	}


	private static void rightplus() {
		// TODO Auto-generated method stub
		char tmp1[] = new char[3];
		 
		for(int i=0; i<3; i++)tmp1[i]=U[i][2]; 
		for(int i=0; i<3; i++)U[i][2]=B[i][2]; // 위 -> 뒤
		for(int i=0; i<3; i++)B[i][2]=D[i][2]; // 뒤 -> 아래
		for(int i=0; i<3; i++)D[i][2]=F[i][2]; // 아래 ->앞
		for(int i=0; i<3; i++)F[i][2]=tmp1[i]; // 앞->위
		
	}


	/*
	 * 바닥-> 앞뒤좌우
	 * */
	private static void backminus() {
		// TODO Auto-generated method stub
		char tmp[] = new char[3];
		
		for(int i=0; i<3; i++)tmp[i]=F[2][i];
		for(int i=0; i<3; i++)F[2][i]=L[0][i];
		for(int i=0; i<3; i++)L[2][i]=B[0][i];
		for(int i=0; i<3; i++)B[2][i]=R[0][i];
		for(int i=0; i<3; i++)R[2][i]=tmp[i];
	}//func 반시계



	private static void backplus() {
		// TODO Auto-generated method stub
		char tmp[] = new char[3];
		
		for(int i=0; i<3; i++)tmp[i]=F[2][i];
		for(int i=0; i<3; i++)F[2][i]=R[2][i];
		for(int i=0; i<3; i++)R[2][i]=B[2][i];
		for(int i=0; i<3; i++)B[2][i]=L[2][i];
		for(int i=0; i<3; i++)L[2][i]=tmp[i];
	}//func 시계



	/*
	 * 앞뒤좌우
	 * */
private static void upplus() {
		// TODO Auto-generated method stub
	char tmp[] = new char[3];
	
	for(int i=0; i<3; i++)tmp[i]=F[0][i];
	for(int i=0; i<3; i++)F[0][i]=R[0][i];
	for(int i=0; i<3; i++)R[0][i]=B[0][i];
	for(int i=0; i<3; i++)B[0][i]=L[0][i];
	for(int i=0; i<3; i++)L[0][i]=tmp[i];
	
	}// func 시계방향 




private static void upminus() {
		// TODO Auto-generated method stub
		char tmp[] = new char[3];
		
		for(int i=0; i<3; i++)tmp[i]=F[0][i];
		for(int i=0; i<3; i++)F[0][i]=L[0][i];
		for(int i=0; i<3; i++)L[0][i]=B[0][i];
		for(int i=0; i<3; i++)B[0][i]=R[0][i];
		for(int i=0; i<3; i++)R[0][i]=tmp[i];
	}// func 반시계




private static void print() throws IOException {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				bw.write(String.valueOf(U[i][j]));
			}
			bw.newLine();
		}
	}




/*
 * left -> 우아래앞뒤
 */
	private static void leftminus() {
		// TODO Auto-generated method stub
	char tmp1[] = new char[3];
	 
	
	 
	for(int i=0; i<3; i++)tmp1[i]=U[i][0];
	for(int i=0; i<3; i++)U[i][0]=F[i][0];
	for(int i=0; i<3; i++)F[i][0]=D[i][0];
	for(int i=0; i<3; i++)D[i][0]=B[i][0];
	for(int i=0; i<3; i++)B[i][0]=tmp1[i];
	
	}//func 시계방향(오른쪽)



	private static void leftplus() {
		// TODO Auto-generated method stub
		char tmp1[] = new char[3];
		 
		for(int i=0; i<3; i++)tmp1[i]=U[i][0]; 
		for(int i=0; i<3; i++)U[i][0]=B[i][0]; // 위 -> 뒤
		for(int i=0; i<3; i++)B[i][0]=D[i][0]; // 뒤 -> 아래
		for(int i=0; i<3; i++)D[i][0]=F[i][0]; // 아래 ->앞
		for(int i=0; i<3; i++)F[i][0]=tmp1[i]; // 앞->위
		
		
	}//func 반시계(왼쪽)





	private static void init() {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++)Arrays.fill(U[i], 'w');
		for(int i=0; i<3; i++)Arrays.fill(D[i], 'y');
		for(int i=0; i<3; i++)Arrays.fill(F[i], 'r');
		for(int i=0; i<3; i++)Arrays.fill(B[i], 'o');
		for(int i=0; i<3; i++)Arrays.fill(L[i], 'g');
		for(int i=0; i<3; i++)Arrays.fill(R[i], 'b');
		
	}

 
	
}//class

*/
 