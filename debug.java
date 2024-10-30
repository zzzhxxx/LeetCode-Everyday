class debug {
        public void moveZeroes(int[] nums) {
            int idx =0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[idx]=nums[i];
                    idx++;
                }
            }
            for(int i=idx;i<nums.length;i++){
                nums[i]=0;
            }
        }
    public static void main(String[] args) {
        debug d = new debug();
        int[] a=new int[]{0};
        d.moveZeroes(a);
    }
    
}



