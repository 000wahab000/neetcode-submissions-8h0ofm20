class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n - 1 ; i++ ){
            int A1 = s.charAt(i);
            int A2 = s.charAt(i + 1);
            sum = sum + Math.abs(A1 - A2);
        }
        return sum;
    }
}