import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigDecimal a = new BigDecimal(Integer.parseInt(st.nextToken()));
		BigDecimal b = new BigDecimal(Integer.parseInt(st.nextToken()));
		
		System.out.println(a.divide(b,1000,BigDecimal.ROUND_DOWN));
		
		
	
	}
}
