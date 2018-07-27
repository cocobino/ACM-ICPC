import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
    public static void main(String[] args) throws IOException {
    	int cas = 1;
    	while (true) {
    		int n = Integer.parseInt(br.readLine());
    		
    		if (n == 0)break;
    		int n1, n2, n3, n4;
    		n1 = 3 * n;
    		if (n1 % 2 == 0) {
    			n2 = n1 / 2;
    		}
    		else {
    			n2 = (n1 + 1) / 2;
    		}
    		n3 = 3 * n2;
    		n4 = n3 / 9;
    		if (n1 % 2 == 0) {
    			System.out.println((cas++)+". even "+ n4);
    		}
    		else {
    			System.out.println((cas++)+". odd "+ n4);
    		}
    	}
	}// main
    
}//class
