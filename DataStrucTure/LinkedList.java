
public class LinkedList {

}


class LinkList{
	private Node head,tail;
	private int size=0;
	private class Node{
		Object data;
		Node next;
		public Node(Object data) {
			this.data = data;
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		
		head.next = newNode;
		head = newNode;
		size++;
		
		if(head.next==null)tail=head;
	}
	
	public void addLast(Object input) {
		if(size==0)addFirst(input);
		else {
			
			Node newNode = new Node(input);
			
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int k, Object input) {
		if(k==0)addFirst(input);
		else {
			Node tmp1 =  node(k-1);
			Node tmp2 = node(k);
			
			Node newNode = new Node(input);
			
			tmp1.next = newNode;
			newNode.next = tmp2;
			size++;
			
			if(newNode.next ==null)tail = newNode;
			
		}
	}
	
	public Object get(int k) {
		Object returnData =  node(k).data;
		return returnData;
	}
	
	public Object removeFirst() {
		Node tmp = head;
		head = tmp.next;
		
		Object returnData = tmp.data;
		tmp = null;
		size--;
		
		return returnData;
	}
	
	public Object remove(int k) {
		if(k==0)return removeFirst();
		
		Node tmp = node(k-1);
		Node del = tmp.next;
		
		tmp.next = tmp.next.next;
		Object returnData = del.data;
		
		if(del == tail)tail = tmp;
		
		del=null;
		size--;
		return returnData;
		
	}
	
	Node node(int idx) {
		Node x = head;
		for(int i=0; i<idx; i++) {
			x = x.next;
		}
		return x;
	}
	
}