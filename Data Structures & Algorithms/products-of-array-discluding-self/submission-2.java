class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0 ; i < n ; i++){
            int count = 1;
            for (int j = 0 ; j < n ; j++){
                if (i != j){
                    count = count*nums[j];
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}