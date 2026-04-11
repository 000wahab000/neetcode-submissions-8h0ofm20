class Solution {
    public int islandPerimeter(int[][] grid) {
        int col = grid.length;
        int row = grid[0].length;
        int perimeter = 0;

        for (int i = 0 ; i < col ; i++){
            for (int j = 0 ; j < row ; j++){
                if (grid[i][j] == 1){

                        if (i == 0 || grid[i-1][j] == 0){perimeter++;}
                        if (j == 0 || grid[i][j-1] == 0){perimeter++;}
                        if (i == col - 1 || grid[i+1][j] == 0){perimeter++;}
                        if (j == row - 1 || grid[i][j+1] == 0){perimeter++;}
                }
            }
        }
        return perimeter;
    }
}