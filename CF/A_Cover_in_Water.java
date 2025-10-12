import java.util.Scanner;

public class A_Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            int i = 0;
            while (i < n) {
                if (s.charAt(i) == '.') {
                    int len = 0;
                    while (i < n && s.charAt(i) == '.') {
                        len++;
                        i++;
                    }
                    ans += (len + 2) / 3;  // minimum water sources for this segment
                } else {
                    i++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
