## CODE
https://leetcode.com/problems/majority-element-ii/submissions/1754345001
```

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        }
        for (int key : hm.keySet()) {
            if (hm.get(key) > nums.length / 3) {
                ll.add(key);
            }
        }

        return ll;
        
    }
}