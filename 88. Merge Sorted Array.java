class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+N;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}

//Solution 2

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m+n-1;
        int i=m-1;
        int j=n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[p]=nums1[i];
                i--;
                p--;   
            }else{
                nums1[p]=nums2[j];
                j--;
                p--;
            }
        }
    }
}