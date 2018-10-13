import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Next_round {
    static int solver(int n, int k, int scores[]) {
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= scores[k-1] && scores[i] > 0)
                count++;

        }
        return count;


    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        String l1[] = br.readLine().split(" ");
        int n = Integer.parseInt(l1[0]);
        int k = Integer.parseInt(l1[1]);
        String ip[] = br.readLine().split(" ");
        int scores[] = new int[ip.length];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(ip[i]);
        }
        //System.out.println(n + "" + k);
        s.append(solver(n, k, scores));
        System.out.print(s);

    }
}
