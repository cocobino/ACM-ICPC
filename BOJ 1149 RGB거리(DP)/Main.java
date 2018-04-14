import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException { 

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//int T = Integer.parseInt(br.readLine());
		
		int[][] rgb = new int[T+1][3];
		int[][] a = new int[T+1][3];
	
	
		// RGB 가격 작성
		rgb[0][0]=rgb[0][1]=rgb[0][2]=0;
		a[0][0]=a[0][1]=a[0][2]=0;
		
		for(int i=1; i<=T;i++) {
			for(int j=0; j<=2; j++) {
				    a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<=T; i++) {
			rgb[i][0] = min(rgb[i-1][1],rgb[i-1][2])+a[i][0];
			rgb[i][1] = min(rgb[i-1][0],rgb[i-1][2])+a[i][1];
			rgb[i][2] = min(rgb[i-1][0], rgb[i-1][1])+a[i][2];
		}
		System.out.println(Math.min(min(rgb[T][0],rgb[T][1]),rgb[T][2]));
		
		sc.close();
		
		
			
		}

	public static int min(int i, int j) {
		// TODO Auto-generated method stub
				return i<j ? i : j;
	}
		
	
	}
	
	
