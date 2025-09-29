import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JaggedSwaps {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); 
        
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] parts = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(parts[j]);
            }
            System.out.println(solver(arr));
        }
    }

    public static String solver(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return "NO"; 
            }
        }
        return "YES"; 
    }
}
