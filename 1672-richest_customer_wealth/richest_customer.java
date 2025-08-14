
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int l= accounts.length;

        for(int[] i: accounts){

            int sum=0;
            for(int j: i){
                sum= sum+j;
            }
            if (sum >= max){
                max=sum;
            }
        }
        return max;
    }
}
