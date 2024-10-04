class Solution1 {
    public int majorityElement(int[] nums) {
        int m=0;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[m]){
                count++;
            }
            else{
                if(count>nums.length/2){
                    return nums[m];
                }
                else{
                    m=i;
                    count=1;
                }
            }
        }
        return nums[m];
    }
}

// Simplify

class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}