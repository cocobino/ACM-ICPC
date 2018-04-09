import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.LinkedList;
	
	public class Main { 
		
		public static void main(String[] args) throws IOException { 
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
			String[] nm = bf.readLine().split(" ");
			String[] seq = bf.readLine().split(" ");
			
			int N = Integer.parseInt(nm[0]); 
			
			CircleQueue q = new CircleQueue(N, seq); 
			System.out.println(q.getCount()); 
			bf.close();
			} 
		} 
	
	class CircleQueue { 
		private LinkedList<Integer> list = new LinkedList<Integer>();
		private int count = 0;
		private String[] seq; 
		CircleQueue(int size, String[] seq) {
	for (int i = 1; i <= size; i++) {
		list.add(i);
		}
	this.seq = seq;
	start();
	} 
		
		private void start() { 
			int length = seq.length; 
			for (int i = 0; i < length; i++) {
				int n = Integer.parseInt(seq[i]);
				operate(n); 
				}
			} 
		
		private void operate(int num) { 
			while (true) { 
				int pos = list.indexOf(num); //1의 인덱스넘버
				int size = list.size(); 
				int left = pos; // 1의 왼쪽 길이
				int right = size - pos - 1; //1의 오른쪽 길이 
				if (left == 0) { 
					list.remove(pos);
					break; 
					} 
				if (left <= right) { 
					list.addLast(list.removeFirst());
					++count; }
				else {  list.addFirst(list.removeLast()); 
				++count; } 
				} 
			} public int getCount() {
				return count;
				} 
			}
	
