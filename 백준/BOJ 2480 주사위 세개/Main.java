import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int r, c, n;
	static int map[][];
	static boolean readvis[][];

	static int dx[] = { 1, 0, -1, 0 }; // го , ©Л, ╩С, аб
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int rst = 0;
		if (a == b && b == c && c == a) {
			rst += 10000 + (1000) * a;
		} else if (a == b && b != c && a != c) {
			rst += 1000 + (100) * a;
		} else if (a != b && b == c && a != c) {
			rst += 1000 + (100) * b;
		} else if (a != b && b != c && a == c) {
			rst += 1000 + (100) * c; 
		} else if  (a != b && b != c && a != c) {
			int max = Math.max(c, Math.max(a, b));
			rst += max*100;
		}

		System.out.println(rst);
	}// main
}// class
