class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* aight so basically we dont sort it immediately we do is we make use of m 
        and n and then replace the 0 0  in the arrays it self

        */ 

        for ( int i = 0 ; i < n ; i++ ) {
            nums1[m + i] = nums2[i]; 
        }

        Arrays.sort(nums1);
        
    }
}