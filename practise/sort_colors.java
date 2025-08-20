import java.util.Arrays;
class Solution {
    public int[] sortColors(int[] nums) {
        int[] k= new int[3];
        for(int i: nums){
            if(i==0){
                k[0]=k[0]+1;
            }
            else if(i==1){
                k[1]=k[1]+1;
            }
            else{
                k[2]=k[2]+1;
            }
        }

        int j=0;
        for(int i=0;i<k.length;i++){
            int c=0;
            while(c<k[i]){

                nums[j]=i;
                c++;
                j++;


            }

        }
        return nums;
    }
}