import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GAme_with_integers{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); 
        for(int i = 0; i < test; i++) {
            int n = Integer.parseInt(br.readLine());
            int g = solver(n);
            if(g == 0) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
    public static int solver(int n) {  
        int a = n + 1;
        int b = n - 1;
        if(a % 3 == 0) return 0;
        if(b % 3 == 0) return 0;
        return 1;
    }
}
