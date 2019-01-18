import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	static int r,c,a,b,k;
	static int map[][];
	static int[][] dpice,dpjung,dpocean;
	
	static boolean visit[][];
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		 
		ArrayList<Point> arr =new ArrayList<Point>();
		
		for(int i=0 ;i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr.add(new Point(y,x));
		}
		
		Comparator<Point> yx =new Comparator<Point>(){
			@Override
			public int compare(Point p0, Point p1) {
				int result = p0.y - p1.y;
				if (p0.y == p1.y)
					result = p0.x - p1.x;
				return result;
			}
			
		};
		 
		Collections.sort(arr, yx);
		for(int i=0; i<arr.size(); i++) {
			bw.write(String.valueOf(arr.get(i).x +" "+arr.get(i).y+"\n"));
		}
		bw.flush();
	}//main
static class Point{
	int y,x;
	public Point(int y, int x) {
		// TODO Auto-generated constructor stub
		this.y=y;
		this.x=x;
	}

}
 
}//class

