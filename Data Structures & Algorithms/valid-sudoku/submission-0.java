class Solution {
    public boolean isValidSudoku(char[][] board) {
    Set<Character> seen = new HashSet<>();
    int n = board[0].length;
    int m = board.length;
    for (int i = 0 ; i < n ; i++){
        seen.clear();
        for (int j = 0 ; j < m ; j++ ){
                if(board[i][j] != '.'){
                    if (seen.contains(board[i][j] )){
                        return false;}
                    else {seen.add(board[i][j]);}
                        }
                    }
                }
        seen.clear();
     for (int i = 0 ; i < n ; i++){
        seen.clear();
        for (int j = 0 ; j < m ; j++ ){
                if(board[j][i] != '.'){
                    if (seen.contains(board[j][i])){
                        return false;}
                    else {seen.add(board[j][i]);}
                        }
                    }
                }
            for (int block = 0; block < 9; block++) {
            seen.clear();
            int rowStart = (block / 3) * 3;
            int colStart = (block % 3) * 3;
            for (int i = rowStart; i < rowStart + 3; i++) {
                for (int j = colStart; j < colStart + 3; j++) {
                if(board[i][j] != '.'){
                    if (seen.contains(board[i][j])) {
                        return false;
                    } else {
                        seen.add(board[i][j]);
                    }
                }
            }
        }
    }
        return true;
    }
}