import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
			
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		Node node = new Node(in);
		while(sc.hasNext()) {
			try {
				in = sc.nextInt(); 
				node = nodeInster(node, in); 
				} catch (Exception e) { 
					System.out.println("숫자만을 입력해야 합니다. 종료합니다."); 
					break; }

			
		}
		Main main = new Main();
		main.findNode(node);
		
		
		
}

	private static Node findNode(Node node) {
		// TODO Auto-generated method stub
		Node curNode = null;
		
		if(node.left != null && node.right != null) {
			node.left = findNode(node.left);
			node.right = findNode(node.right);
		}
		if(node.left ==null && node.right == null) {
			System.out.println(node.cost);
			node = null;
		}else if(node.left ==null && node.right != null) {
			findNode(node.right);
			System.out.println(node.cost);
			node =null;
		}else if(node.left != null && node.right == null) {
			findNode(node.left);
			System.out.println(node.cost);
			node = null;
		}
		
		return node;
		
		
	}

	private static Node nodeInster(Node node, int in) {
		// TODO Auto-generated method stub
		
		Node curNode = null;
		
		if(node ==null) {
			return new Node(in);
		}
		if(node.cost > in) {
			curNode = nodeInster(node.left, in);
			node.left = curNode;
		}else if(node.cost < in){
			curNode = nodeInster(node.right, in);
			node.right = curNode;
		}
		return node;
	} // end
	
	
	
}

class Node {
	Node right;
	Node left;
	int cost;
	public Node(int cost) {
		// TODO Auto-generated constructor stub
		this.cost = cost;
	}
}