class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int fina = nums[0];
        for (int i = 0 ; i < n ; i++){
            if (fina > nums[i]){
                fina = nums[i];
            }
        }
        return fina;   
        
    }
}
