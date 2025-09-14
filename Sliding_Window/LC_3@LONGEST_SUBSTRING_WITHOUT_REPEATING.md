## CODE
https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1770458716
```

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(right<s.length())
        {
            if(hm.containsKey(s.charAt(right)))
            {
                left=Math.max(left,hm.get(s.charAt(right))+1);
            }
            hm.put(s.charAt(right),right);
            max=Math.max(max,right-left+1);
            right++;

        }
        return max;
        
    }
}