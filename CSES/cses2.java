package CSES;
import java.io.*;

public class cses2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] arr=br.readLine().split(" ");
        long sum=0;
        for(String str:arr)
        {
            sum=sum+Long.parseLong(str);
                
        }
        long total=(long)n*(n+1)/2;
        System.out.println(total-sum);
        
        

    }
    
}
