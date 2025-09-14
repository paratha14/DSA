import java.util.Arrays;
class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int pos=arr[i];
            if(arr[i]==arr.length){
                i++;
            }
            else if(arr[i]!= arr[pos]){
                int temp= arr[i];
                arr[i]= arr[pos];
                arr[pos]= temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;

    }
}

