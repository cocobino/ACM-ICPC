import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int n,m,k;
	static int map[][],add[][];
	static ArrayList<ArrayList<ArrayList<Tree>>> tree = new ArrayList<>();
	
	static int dx[] = {0, 0,-1, 1, 1,1,-1,-1};
	static int dy[] = {1,-1, 0, 0,-1,1, 1,-1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 st = new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken()); //�࿭
		 m = Integer.parseInt(st.nextToken()); // m�� ����
		 k = Integer.parseInt(st.nextToken()); //k �⵵��
		 
		 map = new int [n][n];
		 add = new int [n][n];
		 
		 for(int i=0; i<n; i++) {
			 tree.add(new ArrayList<>());
			 for(int j=0; j<n; j++) {
				 tree.get(i).add(new ArrayList<Tree>());
			 }
		 }
		 
		 for(int i=0; i<n; i++) {
			 st= new StringTokenizer(br.readLine());
			 for(int j=0; j<n; j++) {
				 add[i][j] = Integer.parseInt(st.nextToken());
			 }
		 }//insert
		 
		 
		 
		 for(int i=0; i<m; i++) {
			 st = new StringTokenizer(br.readLine());
			 int x= Integer.parseInt(st.nextToken())-1;
			 int y = Integer.parseInt(st.nextToken())-1;
			 int year = Integer.parseInt(st.nextToken());	 
			 
			tree.get(x).get(y).add(new Tree(x,y,year,true));
			 
		 }//insert tree 
		
		 for(int i=0; i<n; i++)Arrays.fill(map[i], 5);
		 
		 /*
		  * sol : simulation
		  */
		 
		 for(int i=0; i<k; i++) {
			 Spring();
			 summer();
			 fall();
			 winter();
		 }
		 
		 //print
		 int rst=0;
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<n; j++) {
				 rst += tree.get(i).get(j).size();
			 }
		 }
		 
		bw.write(String.valueOf(rst));
		bw.flush();
		
	}// main

	private static void winter() {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				map[i][j]+=add[i][j];
	}

	private static void fall() {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//�������� %5 ==0 �̸� �����ϱ�
				if(tree.get(i).get(j).size() !=0) {
					for(int k=0; k<tree.get(i).get(j).size(); k++) {
						if(tree.get(i).get(j).get(k).year %5 ==0) {
							addTree(i,j);
						}
					}
				}
			}
		}
	}

	private static void addTree(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0; i<8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			//������
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
			tree.get(nx).get(ny).add(0,new Tree(nx,ny,1,true));	
			}
			
		}
	}

	private static void summer() {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//������ �ش� ��ġ�� �ֵ���
				if(tree.get(i).get(j).size() !=0) {
					for(int k=0; k<tree.get(i).get(j).size(); k++) {
						//������ �׾�����
						if(tree.get(i).get(j).get(k).live==false) {
							//���� �������
							 map[i][j] +=tree.get(i).get(j).get(k).year/2;
							 //���� ����
							 tree.get(i).get(j).remove(k);
							 k--;
						}
					}
				}
			}
		}
		
	}

	private static void Spring() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				//������ �ش���ġ�� �ִٸ�
				if(tree.get(i).get(j).size() !=0) {
					for(int k=0; k<tree.get(i).get(j).size(); k++) {
						Collections.sort(tree.get(i).get(j));
						// Ʈ�� ���̺��� ����� ũ�� ��о��ְ�  => ���� ++
						if(map[i][j] >=tree.get(i).get(j).get(k).year && tree.get(i).get(j).get(k).live) {
							map[i][j] -=tree.get(i).get(j).get(k).year;
							tree.get(i).get(j).get(k).year++;
						}else if(map[i][j] <tree.get(i).get(j).get(k).year && tree.get(i).get(j).get(k).live){
							//Ʈ�� ���̺��� ����� ������
							tree.get(i).get(j).get(k).live=false;	
							
						}
					}
				}
			}
		}
	}// func : Spring
 

}// class
 

class Tree implements Comparable<Tree>{
	int x,y,year;
	boolean live;
	public Tree(int x, int y, int year, boolean live) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.year=year;
		this.live=live;
	}
	@Override
	public int compareTo(Tree o) {
		// TODO Auto-generated method stub
		return this.year < o.year ? -1 : 1 ;
	}
 
}