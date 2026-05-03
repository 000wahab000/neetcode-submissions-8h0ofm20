class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            if (nums[i] == target){
                return i;
            }
            i++;
        }
        return -1;
    }
}
