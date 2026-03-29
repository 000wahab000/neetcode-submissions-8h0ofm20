class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0 ; i + 1 < n ; i++ ){
            if (nums[i+1] - nums[i] == 1 ){
                count++;
            }
            else if (nums[i+1] - nums[i] == 0) {
                continue;
            }
            else {
                a1.add(count);
                count = 1;
            }
        }
        a1.add(count);
        return Collections.max(a1);
    }
}
