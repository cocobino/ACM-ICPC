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
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int x = Integer.parseInt(st.nextToken());
    	int y = Integer.parseInt(st.nextToken());
    	
    	int rx = Integer.parseInt(st.nextToken());
    	int ry = Integer.parseInt(st.nextToken());
    	
    	int hor = -1;
    	int ver = -1;
    	
    	if(x >rx/2) hor = Math.abs(rx-x);
    	else hor =x;
    	if(y>ry/2) ver = Math.abs(ry-y);
    	else ver =y;
    	
    	bw.write(String.valueOf(hor > ver ? ver : hor));
    	bw.flush();
    }
}


    }
}
