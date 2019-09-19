
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("test");
        String a = br.readLine();

        if(a.length()<=2){
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
            return;
        }
        int cnt = a.charAt(1)-a.charAt(0);
        boolean flag =false;

        for(int i=0; i<a.length()-1; i++){
            if(a.charAt(i+1) - a.charAt(i) != cnt){
                flag = true;
            }
        }

        System.out.println( flag == false ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");

    }
}
