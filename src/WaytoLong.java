import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WaytoLong {
    static String solver(String ip){
        if(ip.length()>10)
            return ip.charAt(0)+""+(ip.length()-2)+""+ip.charAt(ip.length()-1);
        else
            return ip;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0 ; testcase--) {
            s.append(solver(br.readLine())).append('\n');

        }
        System.out.print(s);

    }
}

