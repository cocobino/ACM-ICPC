import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int n,m,curx=0,cury=0;
	 
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 
	 String s = br.readLine();
	 
	 int fingers[] = new int[8];
	 
	 for(int i=0; i<s.length(); i++) {
		  switch (s.charAt(i))

          {

          case '1':

          case 'Q':

          case 'A':

          case 'Z':

                  fingers[0]++;

                  break;

          case '2':

          case 'W':

          case 'S':

          case 'X':

                  fingers[1]++;

                  break;

          case '3':

          case 'E':

          case 'D':

          case 'C':

                  fingers[2]++;

                  break;

          case '4':

          case 'R':

          case 'F':

          case 'V':

          case '5':

          case 'T':

          case 'G':

          case 'B':

                  fingers[3]++;

                  break;

          case '6':

          case 'Y':

          case 'H':

          case 'N':

          case '7':

          case 'U':

          case 'J':

          case 'M':

                  fingers[4]++;

                  break;

          case '8':

          case 'I':

          case 'K':

          case ',':

                  fingers[5]++;

                  break;

          case '9':

          case 'O':

          case 'L':

          case '.':

                  fingers[6]++;

                  break;

          default:

                  fingers[7]++;

                  break;

          }
	 }
	 
	 
	 for(int i=0; i<8; i++) {
		 bw.write(String.valueOf(fingers[i]));
		 bw.newLine();
		 bw.flush();
	 }
	}//main 
 
	
	
}//class
 