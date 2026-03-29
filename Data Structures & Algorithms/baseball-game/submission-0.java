class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1 = new Stack<>();
        
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                s1.pop();
            } else if (operations[i].equals("D")) {
                s1.push(s1.peek() * 2);
            } else if (operations[i].equals("+")) {
                int k = s1.pop();
                int m = s1.peek() + k;
                s1.push(k);
                s1.push(m);
            } else {
                s1.push(Integer.parseInt(operations[i]));
            }
        }
        
        int ans = 0;
        while (!s1.isEmpty()) ans += s1.pop();
        return ans;
    }
}
