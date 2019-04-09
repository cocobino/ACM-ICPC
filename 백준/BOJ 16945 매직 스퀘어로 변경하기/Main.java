import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };
	
	static boolean vis[];
	static int map[];
	static int s[];
	static int max=1234567890;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		map = new int[9];
		vis = new boolean[10];
		s = new int[9];
		
		 
		for(int i=0; i<9; i++) {
			map[i] = sc.nextInt();
		}
		//sol
		for(int i=0; i<9; i++) {
			s[i] = i+1;
		}
		
		perm(0,s);
	
		System.out.println(max);
		
	}// main
private static void perm(int cur, int[] s) {
	if(cur==s.length) {
		if(possible()) {
			int rst=0;
			for(int i=0; i<9; i++)rst+=Math.abs(map[i]-s[i]);
			max = Math.min(max, rst);
		}
		return;
	}
		
	for(int i=cur; i<s.length; i++) {
		swap(cur,i,s);
		perm(cur+1,s);
		swap(cur,i,s);
	}
	
	}//fucn : perm
private static void swap(int a, int b, int[] s) {
	// TODO Auto-generated method stub
	int tmp = s[a];
	s[a]=s[b];
	s[b]=tmp;
	
}
/*
 * if(depth==9) {
			if(possible()) {
				int rst=0;
				for(int i=0; i<9; i++)rst+=Math.abs(map[i]-s[i]);
				max = Math.min(max, rst);
			}
			return;
		}
 */
	 

	private static boolean possible() {
		int r = s[0] + s[1] + s[2];

		for (int i = 3; i <= 6; i += 3) {
			int nr = s[i] + s[i + 1] + s[i + 2];

			if (nr != r)
				return false;
		}
		int c = s[0] + s[3] + s[6];

		for (int i = 1; i <= 2; i++) {
			int nc = s[i] + s[i + 3] + s[i + 6];

			if (nc != c)
				return false;
		}
		int d = s[0] + s[4] + s[8];
		int nd = s[2] + s[4] + s[6];
		if (d != nd)
			return false;

		return true;
	}
	  
}// class
 