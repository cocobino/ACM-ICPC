import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static char map[][] = new char[10][10];
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[r][c];
		
		for(int i=0; i<r; i++) {
			String a =br.readLine();
			for(int j=0; j<c; j++) {
				map[i][j] = a.charAt(j);
			}
		}//insert
		
		for(int i=c-1; i>=0; i--) {
			for(int j=0; j<r; j++) {
				switch(map[j][i]) {
				case '.':
					System.out.print(".");
					break;
				case 'O':
					System.out.print("O");
					break;
				case '-':
					System.out.print("|");
					break;
				case '|':
					System.out.print("-");
					break;
				case '/':
					System.out.print("\\");
					break;
				case '\\':
					System.out.print("/");
					break;
				case '^':
					System.out.print("<");
					break;
				case '<':
					System.out.print("v");
					break;
				case 'v':
					System.out.print(">");
					break;
				case '>':
					System.out.print("^");
					break;
					
				}
			}
			System.out.println();
		}
		
		
		
	}// main
	

}// class
