class Solution {
    public int minBitFlips(int start, int goal) {
        int steps=0;
        int inter= start ^ goal;
        while(inter!= 0){
            if((inter & 1)==1){
                steps++;
                inter= inter>>1;
            }
            else{
                inter= inter>>1;
            }
        }
        return steps;
    }
}