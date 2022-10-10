class Solution {
  //my method
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        int index=-1;
        
        for(int i=0;i<nums.length;i++) {
            rightsum+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++) {
            rightsum-=nums[i];
            if(leftsum==rightsum) {
                return i;
            }
            leftsum+=nums[i];
        }
        return index;
    }
  //leetcode solution method 2
   public int pivotIndex(int[] nums) {
        int total = 0, sum = 0
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; sum += nums[i++])
            if (sum * 2 == total - nums[i]) return i;
        return -1;  
    }
}
