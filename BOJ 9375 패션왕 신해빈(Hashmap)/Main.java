import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testcase = Integer.parseInt(br.readLine());

        while (testcase-- > 0) {
            HashMap<String, Integer> hp = new HashMap<>();
            
            int N = Integer.parseInt(br.readLine());
            
            for (int i = 0; i < N; i++) {
                String type = br.readLine().split(" ")[1];
                Integer value = hp.get(type);
                
                if (value == null) value = 1;
                else value++;
                hp.put(type, value);
            }
            
            int result = 1;
            for (int v : hp.values()) {
                result *= v + 1; 
                /*
                 * case 1 : (1,2,3)
                 * case 2 : 1,2,3
                 * case 3 : (1,2),(2,3) 1->1,2로 변할시 1 값 +1
                 * 
                 */
            }
            bw.write((result - 1) + "\n");
        }

        bw.flush();
    }
}