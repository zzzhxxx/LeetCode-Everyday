class debug {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        debug d = new debug();
        System.out.println(d.removeDuplicates((new int[]{1,1,2})));
    }
    
}