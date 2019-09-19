import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	 
	
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        LinkedList<Node> people = new LinkedList<>();
        Stack<Node> wait = new Stack<>();
        
        int idx =0;
        Node[] list = new Node[n*5];
        for(int i=0; i<n; i++) {
        	String a[] = br.readLine().split(" ");
        	for(int j=0; j<a.length; j++) {
        		String b[] = a[j].split("-");
        		people.add(new Node(b[0].charAt(0), Integer.parseInt(b[1])));
        		list[idx++] = new Node(b[0].charAt(0), Integer.parseInt(b[1]));
        	}
        }
        
        idx=0;
        Arrays.sort(list);
        int size = people.size();
      for(int i=0; i<size; i++) {    	  
    	 //1. �������� ����̸� ������
        	if(people.get(i).toString().equals(list[idx].toString())) {
        		idx++;
        	}
        //2. �������һ���� �ƴϸ� wait ����
        	else if(!wait.isEmpty()) {
        		//2-1. �������� ����� ��ٸ��� ����̸� wait�� �ֱ�
        		if(wait.peek().toString().equals(list[idx].toString())) {
        			i--;
        			idx++;
        			wait.pop();
        		}
        		else {
        			wait.add(people.get(i));
        		}
        	}
        //3. wait �� ��������� �׳� �ֱ�
        	else {
        		wait.add(people.get(i));
        	}
        }
        
        if(wait.isEmpty()) {
        	System.out.println("GOOD");
        }
        else {
        	while(!wait.isEmpty()) {
        		if(wait.peek().toString().equals(list[idx++].toString())) {
        			wait.pop();
        		}
        		else {
        			System.out.println("BAD");
        			return;
        		}
        		
        	}
        	System.out.println("GOOD");
        }
        
    }// main
	 
     
}// class
  

class Node implements Comparable<Node>{
	char alpa; int num;

	public Node(char alpa, int num) {
		super();
		this.alpa = alpa;
		this.num = num;
	}

	@Override
	public int compareTo(Node o) {
		if(this.alpa > o.alpa)return 1;
		else if(this.alpa < o.alpa)return -1;
		else {
			if(this.num > o.num)return 1;
			else if(this.num < o.num)return -1;
			else return 0;
		}
	}
	@Override
	public String toString() {

		return alpa + " "+num;
	}
}