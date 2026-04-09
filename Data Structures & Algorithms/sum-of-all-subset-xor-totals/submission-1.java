class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        for (int k : nums){
            res = res | k;
        }
        return res << (nums.length - 1);
    }
}