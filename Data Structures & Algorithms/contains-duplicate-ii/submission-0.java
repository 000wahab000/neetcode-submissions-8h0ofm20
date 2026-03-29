class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int right = 0;
        int n = nums.length;

        while(right < n){
        
            if (h1.containsKey(nums[right])) {
                int prevIndex = h1.get(nums[right]);
                    if (right - prevIndex <= k) return true;
                }
                h1.put(nums[right],right);
                right++;
            }
            return false;
        }
    }