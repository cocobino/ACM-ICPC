import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
  
	static int n,bx,by,dax,day,jx,jy;
	 
	 
	//static LinkedList<Integer> arr = new LinkedList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 
		
		st =new StringTokenizer(br.readLine());
		by = Integer.parseInt(st.nextToken());
		bx = Integer.parseInt(st.nextToken());
		
		st =new StringTokenizer(br.readLine());
		day = Integer.parseInt(st.nextToken());
		dax = Integer.parseInt(st.nextToken());
		
		st =new StringTokenizer(br.readLine());
		jy = Integer.parseInt(st.nextToken());
		jx = Integer.parseInt(st.nextToken());
		
		int br = Math.abs(jy-by);
		int bc = Math.abs(jx-bx);
		int dr = Math.abs(jy-day);
		int dc = Math.abs(jx-dax);
		
		int bgo = Math.max(br, bc);
		int dgo = dr+dc;
		
		if(bgo<dgo)bw.write(String.valueOf("bessie"));
		else if(bgo>dgo)bw.write(String.valueOf("daisy"));
		else bw.write(String.valueOf("tie"));
		bw.flush();
		
		
		
		 
	}// main
 


}//class
 
