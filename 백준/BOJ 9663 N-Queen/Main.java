import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int[] iarr;
	static int cnt;
	static int test_case;
		
    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	int test_case = Integer.parseInt(br.readLine());
	
	iarr = new int[test_case];
	nQueen(iarr, test_case, 0);
	bw.write(String.valueOf(cnt));
	bw.flush();
	}

	private static void nQueen(int[] iarr, int test_case, int row) {
		// TODO Auto-generated method stub
		for(int i=0;i<test_case; i++) {
			iarr[row] =i;
			
			if(rule(iarr, test_case, row)) {
				if(row ==test_case-1)cnt ++;
				else {
					nQueen(iarr, test_case, row+1);
				}
			}
		
	}
	
    }

	private static boolean rule(int[] iarr, int test_case, int row) {
		// TODO Auto-generated method stub
		for(int i=0; i<row; i++) {
			if(iarr[row] == iarr[i] || row-i ==Math.abs(iarr[row]-iarr[i])) {
				return false;
			}
		}
		return true;
	}
    
}