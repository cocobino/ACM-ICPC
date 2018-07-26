import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	long rst= 0;
    	String a = br.readLine();
    	String b = br.readLine();
    	String c = br.readLine();
    	int arr[][] = new int[10][2];
    	
    	for(int i=0; i<10; i++) {
    		arr[i][0]=i;
    	}
    	for(int j=0; j<10; j++) {
    		arr[j][1]=(int)Math.pow(10, j);
    	}
    	switch(a){
    	
    	case "black":
    		rst+=arr[0][0]*10;
    		break;
    	case "brown":
    		rst+=arr[1][0]*10;
    		break;
    	case "red":
    		rst+=arr[2][0]*10;
    		break;
    	case "orange":
    		rst+=arr[3][0]*10;
    		break;
    	case "yellow":
    		rst+=arr[4][0]*10;
    		break;
    	case "green":
    		rst+=arr[5][0]*10;
    		break;
    	case "blue":
    		rst+=arr[6][0]*10;
    		break;
    	case "violet":
    		rst+=arr[7][0]*10;
    		break;
    	case "grey":
    		rst+=arr[8][0]*10;
    		break;
    	case "white":
    		rst+=arr[9][0]*10;
    		break;
    	}
    	
    	switch(b){
    	
    	case "black":
    		rst+=arr[0][0];
    		break;
    	case "brown":
    		rst+=arr[1][0];
    		break;
    	case "red":
    		rst+=arr[2][0];
    		break;
    	case "orange":
    		rst+=arr[3][0];
    		break;
    	case "yellow":
    		rst+=arr[4][0];
    		break;
    	case "green":
    		rst+=arr[5][0];
    		break;
    	case "blue":
    		rst+=arr[6][0];
    		break;
    	case "violet":
    		rst+=arr[7][0];
    		break;
    	case "grey":
    		rst+=arr[8][0];
    		break;
    	case "white":
    		rst+=arr[9][0];
    		break;
    	}
	switch(c){
    	
    	case "black":
    		rst*=arr[0][1];
    		break;
    	case "brown":
    		rst*=arr[1][1];
    		break;
    	case "red":
    		rst*=arr[2][1];
    		break;
    	case "orange":
    		rst*=arr[3][1];
    		break;
    	case "yellow":
    		rst*=arr[4][1];
    		break;
    	case "green":
    		rst*=arr[5][1];
    		break;
    	case "blue":
    		rst*=arr[6][1];
    		break;
    	case "violet":
    		rst*=arr[7][1];
    		break;
    	case "grey":
    		rst*=arr[8][1];
    		break;
    	case "white":
    		rst*=arr[9][1];
    		break;
    	}
	bw.write(String.valueOf(rst));
	bw.flush();
    }
}
