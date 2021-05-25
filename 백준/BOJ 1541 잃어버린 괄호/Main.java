import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int map[][];
	static final int ON = 1;
	static final int OFF = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		st =  new StringTokenizer(br.readLine());
		ArrayList<String> arr = new ArrayList<String>();
		
		String a = br.readLine();
		String tmp = "";
		
		for(int i=0; i<a.length(); i++) {
			if('0'<= a.charAt(i) && a.charAt(i) <= '9') {
				tmp+=a.charAt(i);
				if(i == a.length()-1) {
					arr.add(tmp);
				}
			} else {
				arr.add(tmp);
				arr.add(""+a.charAt(i));
				tmp ="";
				
			}
		}
				
		//sol
		int rst =0, acc =0, mode=0;
		for(int i=0; i<arr.size(); i++) {
			String cur = arr.get(i);
			switch(cur) {
			case "+" :
				if(acc == 0) mode = 0;
				break;
			case "-" :
				mode = -1;
				break;
			default :
				if(mode == 0) {
					rst += Integer.parseInt(cur);
				}
				if(mode == -1) {
					acc += Integer.parseInt(cur);
				}
				break;
			}
		}
		System.out.println(rst -acc);
	}
}