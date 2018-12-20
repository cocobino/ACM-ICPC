import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	 
	
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
		
		Node point[] = new Node[3];
		for(int i=0; i<3; i++)point[i] = new Node(0,0);
		
		for(int i=0; i<3; i++) {
	 st = new StringTokenizer(br.readLine());
	 point[i].x = Integer.parseInt(st.nextToken());
	 point[i].y = Integer.parseInt(st.nextToken());
		} // insert
		
		bw.write(String.valueOf(go(point[0].x, point[0].y, point[1].x, point[1].y, point[2].x , point[2].y)));
		bw.flush();
	}//main



	private static int go(int x1, int y1, int x2, int y2, int x3, int y3) {
		// TODO Auto-generated method stub
		int temp = x1*y2 + x2*y3 + x3*y1;
	    temp = temp - y1*x2 - y2*x3 - y3*x1;
	    
	    if(temp > 0){
	        return 1;
	    }else if(temp < 0){
	        return -1;
	    }else {
	        return 0;
	    }

 
	}
 
  
}//class
 
class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		x=this.x;
		y=this.y;
	}
}