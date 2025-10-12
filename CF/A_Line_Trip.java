import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Line_Trip {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        for (int test = 0; test < n1; test++) 
        {   int m=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int[] arr = new int[n+1];
            arr[0]=0;
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int maxtank=(m-arr[arr.length-1])*2;
            for(int i=arr.length-1;i>0;i--)
            {
                maxtank=Math.max(maxtank,arr[i]-arr[i-1]);
            }
            System.out.println(maxtank);
            
        }
        



    }
}