import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Theatre_Square {
    static int solver(int n,int m,int a){
        return (int)(Math.ceil((double)n/a)*Math.ceil((double)m/a));
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        String sp=br.readLine();
        String s1[]=sp.split(" ");

        int n=Integer.parseInt(s1[0]);
        int m=Integer.parseInt(s1[1]);
        int a=Integer.parseInt(s1[2]);

        System.out.println(solver(n,m,a));

    }
}
