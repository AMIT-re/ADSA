## CODE
https://leetcode.com/problems/count-hills-and-valleys-in-an-array/submissions/1754272200
```

class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        int m = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[m] = nums[i];
                m++;
            }
        }
        for(int i=1;i<m-1;i++)
        {
            if( nums[i]>nums[i+1] && nums[i]>nums[i-1])
            {
                count++;
            }
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                count++;

            }
        }
        
        return count;
    }
}