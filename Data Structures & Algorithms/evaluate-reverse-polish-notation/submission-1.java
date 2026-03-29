class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1 = new Stack<>();
        int f = tokens.length;
        for (int i = 0 ; i < f ; i++){
            if (tokens[i].equals("+")){
                int n = s1.pop();
                int m = s1.pop();
                int k = m + n;
                s1.push(k);
            }
            else if (tokens[i].equals("-")){
                int n = s1.pop();
                int m = s1.pop();
                int k = m - n;
                s1.push(k);
            }
            else if (tokens[i].equals("/")){
                int n = s1.pop();
                int m = s1.pop();
                int k = m / n;
                s1.push(k);
            }
            else if (tokens[i].equals("*")){
                int n = s1.pop();
                int m = s1.pop();
                int k = m * n;
                s1.push(k);
            }
            else s1.push(Integer.parseInt(tokens[i]));
        }
        return s1.pop();
    }
}
