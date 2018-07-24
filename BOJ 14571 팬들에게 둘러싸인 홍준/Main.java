import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 
 

public class Main {
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	 String a = br.readLine();
    	 
    	 bw.write(String.valueOf(":fan::fan::fan:" +"\n"));
    	 bw.write(String.valueOf(":fan::"+a+"::fan:" +"\n"));
    	 bw.write(String.valueOf(":fan::fan::fan:"));
    	 bw.flush();
    }

   
    }

