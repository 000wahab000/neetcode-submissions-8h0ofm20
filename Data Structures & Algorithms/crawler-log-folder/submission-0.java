class Solution {
    public int minOperations(String[] logs) {
    int n = logs.length;
    int depth = 0;
    for (int i = 0 ; i < n ; i++ ){
        if (logs[i].equals("../")){
            if(depth > 0 ){depth--;}
        }
        else if (!logs[i].equals("./")){
            depth++;
            }
        }
        return depth;
    }
}