public class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> types = new HashSet<>();
            int j = i;

            while (j < n && (types.size() < 2 || types.contains(fruits[j]))) {
                types.add(fruits[j]);
                j++;
            }
            res = Math.max(res, j - i);
        }

        return res;
    }
}