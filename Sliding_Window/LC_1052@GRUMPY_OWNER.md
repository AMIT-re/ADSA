
##CODE
https://leetcode.com/problems/grumpy-bookstore-owner/submissions/1773707846

```
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        
        // Step 1: base satisfied customers
        int base = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                base += customers[i];
            }
        }

        // Step 2: sliding window on unsatisfied customers
        int csum = 0, max = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                csum += customers[i];
            }
        }
        max = csum;

        for (int i = minutes; i < n; i++) {
            if (grumpy[i] == 1) {
                csum += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                csum -= customers[i - minutes];
            }
            max = Math.max(max, csum);
        }

        // Step 3: total satisfied customers
        return base + max;
    }
}
