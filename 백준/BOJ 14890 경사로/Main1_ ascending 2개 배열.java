import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Main main = new Main();
		main.solve();
 
 }
	static int[][] road;
	static int[] height;
	static int n, l;
	 
	private void solve() {
		Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    l = sc.nextInt();
	    road = new int[n * 2][n];
	    int ans = n * 2;
	 
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            road[i][j] = sc.nextInt();
	        }
	    }
	 
	    for (int i = n; i < n * 2; i++) {
	        for (int j = 0; j < n; j++) {
	            road[i][j] = road[j][i - n];
	        }
	    }
	 
	    // ���� ĭ�� ������ ��� => ������ ���� ���� ���� ��ġ �Ǵ� ����.
	    // ���� ĭ�� ������ ��� => ���� ĭ���� ���� �������鼭 ���θ� ��ġ�� �� �ִ� �� �Ǵ��ؾ���.
	 
	    for (int i = 0; i < n * 2; i++) {
	        int target = road[i][0];
	        height = new int[11];
	        height[target] = 1;
	        int j = 1;
	        while (j < n) {
	            int next = road[i][j];
	            if (!vaildHeight(target, next)) {
	                // ���� ���� 1���� ũ�� ���� ��ġ �Ұ���
	                --ans;
	                break;
	            }
	            if (target != next) {
	                if (target < next) {
	                    // ���� ĭ ������ ���
	                    if (!high(target, next)) {
	                        --ans;
	                        break;
	                    }
	                } else {
	                    // ���� ĭ ������ ���
	                    if (!low(i, j, target, next)) {
	                        --ans;
	                        break;
	                    }
	                    j += l - 1;
	                }
	                // ������ �Ǵ� ĭ ����
	                target = next;
	            } else {
	                // ���� ������ ĭ�� ���ϱ� ������, L�� ���̸� ���� ���� ��ġ �Ǵ��� ���� ī���� ����
	                height[target]++;
	            }
	            j++;
	        }
	    }
	    System.out.println(ans);
	}
	 
	public static boolean low(int i, int j, int target, int next) {
	    // ���̰� L�� ���θ� ���� �� �ִ����� �Ǵ��ϸ� �Ǳ⿡ l ��ŭ ������.
	    for (int k = 0; k < l; k++) {
	        if (j + k == n) {
	            break;
	        }
	        if (road[i][j + k] == next) {
	            height[next]++;
	        }
	    }
	    if (height[next] < l) {
	        return false;
	    }
	    height[next] -= l;
	    return true;
	}
	 
	public static boolean high(int target, int next) {
	    if (height[target] < l) {
	        return false;
	    }
	    // ������ ���� ī���� �迭 ����
	    height[target] = 0;
	    height[next] = 1;
	    return true;
	}
	 
	public static boolean vaildHeight(int a, int b) {
	    int gap = Math.abs(a - b);
	    if (gap > 1) {
	        return false;
	    }
	    return true;
	}    



}