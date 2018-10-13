import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_Task {
    static String solver(String ip) {
        ip.toLowerCase();
        return "";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        String ip = br.readLine();
        s.append(solver(ip));
        System.out.print(s);

    }
}
