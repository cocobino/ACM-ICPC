import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
  
   
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();

		while (testCase-- > 0) {
			char[] command = input.next().toCharArray();
			int size = input.nextInt();
			ArrayList<Integer> array = new ArrayList<Integer>();
			String[] value = input.next().replaceAll("\\[|\\]", "").split(",");

			for (int i = 0; i < size; i++)
				array.add(Integer.parseInt(value[i]));

			boolean reverse = true;
			boolean check = false;
			for (int i = 0; i < command.length; i++) {
				if (command[i] == 'R')
					reverse = !reverse;

				if (command[i] == 'D') {
					if (array.size() != 0) {
						if (reverse)
							array.remove(0);
						else
							array.remove(array.size() - 1);
					} else {
						check = true;
						break;
					}
				}
			}

			if (check)
				System.out.println("error");
			else {
				if (reverse) {
					System.out.print("[" + (array.size() != 0 ? array.get(0) : ""));
					for (int i = 1; i < array.size(); i++)
						System.out.print("," + array.get(i));
				} else {
					System.out.print("[" + (array.size() != 0 ? array.get(array.size() - 1) : ""));
					for (int i = array.size() - 2; i >= 0; i--)
						System.out.print("," + array.get(i));
				}
				System.out.println("]");
			}
		}
	}
}//class