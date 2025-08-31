class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

                int s=hm.get(nums[i]);
                if(s>(nums.length/2))
                {
                    return nums[i];
                }

        }

        return 0;
        
    }
}



class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {     
            if(count==0)
            {
                el=nums[i];
            }
            if(nums[i]==el)
            {
                count++;
            }
            else{
                count--;
            }
            if(count>nums.length/2){
            return el;
        }
        }

        return el;
        
    }
}


