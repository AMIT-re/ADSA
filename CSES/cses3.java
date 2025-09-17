package CSES;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
public class cses3 {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int max=1;
        int maxlen=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                max++;
            }
            else {
                max=1;
            }
            maxlen=Math.max(maxlen,max);

        }
        System.out.println(maxlen);
    }
    
}
