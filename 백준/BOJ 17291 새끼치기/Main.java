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
		
		int n = Integer.parseInt(br.readLine());
		
		
		 
		ArrayList<Node> list = new ArrayList<>();
		
		list.add(new Node(1,0));
		for(int i=2; i<=n; i++) {
			//개체 추가
			int size = list.size();
			for(int j=0; j<size; j++) {
				list.add(new Node(i,-1));
			}
			//나이추가
			for(int j=0; j<list.size(); j++) {
				list.get(j).year++;
			}
			
			//제거
			for(int j=0; j<list.size(); j++) {
				//짝수
				if(list.get(j).birth %2 == 0) {
					if(list.get(j).year == 4) {
						list.remove(j);
						j--;
					}
				}
				//홀수
				else if(list.get(j).birth %2 !=0) {
					if(list.get(j).year == 3) {
						list.remove(j);
						j--;
					}
				}
			}
				
		}
		System.out.println(list.size());
		
	}// main

}// class

class Node{
	int birth, year;

	public Node(int birth, int year) {
		super();
		this.birth = birth;
		this.year = year;
	}
	
}