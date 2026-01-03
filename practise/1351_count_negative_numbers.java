class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int j=0;j<grid.length;j++){
            for(int i: grid[j]){
                if(i<0){
                    c++;
                }
            }
        }
        return c;
    }
}