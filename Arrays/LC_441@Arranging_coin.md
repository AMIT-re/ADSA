## CODE
https://leetcode.com/problems/arranging-coins/submissions/1754239671
```

class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int min=1;
        while(n>=min)
        {
            n=n-min;
            count++;
            min++;

        }

        return count;
        
    }
}