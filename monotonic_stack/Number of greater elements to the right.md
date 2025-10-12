## code

```
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int count =0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    count++;
                }
                
            }
            res[i]=count;
        }
        int n[]=new int[indices.length];
        for(int i=0;i<indices.length;i++)
        {
            n[i]=res[indices[i]];
        }
        return n;
    }
}
