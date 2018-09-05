import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
 
public class Main {
	static int rst[];
	static char list[];
	static int L,C;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	L = Integer.parseInt(st.nextToken());
    	C = Integer.parseInt(st.nextToken());
    	String str[] = br.readLine().split(" ");
    	list =new char[C];
    	rst = new int[C];
    	
    	for(int i=0; i<C; i++)list[i] = str[i].charAt(0);
    	//insert
    	Arrays.sort(list);
    	dfs(0,0,0,0);
    	
	}//main

	private static void dfs(int start, int end, int alpha, int beta) {
		// TODO Auto-generated method stub
		for(int i=start; i<C; i++) {
			rst[i]=1;
			dfs(i+1,end+1, alpha+ (!check(list[i]) ? 1 : 0) , beta +  (!check(list[i]) ? 0 : 1));
			rst[i]=0;
		}
		
		if(end ==L && alpha>=2 && beta>=1) {
			print();
		}
		
		
	}

	private static void print() {
		// TODO Auto-generated method stub
		for(int i=0; i<C; i++) {
			if(rst[i]==1) {
				System.out.print(list[i]);
			}
		}
		System.out.println();
	}

	private static boolean check(char a) {
		// TODO Auto-generated method stub
		if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u')return true;
		else return false;
	}

	 
  
}