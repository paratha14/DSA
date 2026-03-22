class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i< image.length; i++){
            int[] sub= image[i];
            sub= reverse(sub);
            sub= invert(sub);
            image[i]=sub;
        }
        return image;
    }

    public static int[] reverse(int[] x){
        int s=0, e=x.length-1;
        while(s<e){
            int temp= x[s];
            x[s]=x[e];
            x[e]=temp;
            s++;
            e--;
        }
        return x;

    }

    public static int[] invert(int[] x){
        for(int i=0;i<x.length;i++){
            x[i]= x[i]^1;
        }
        return x;
    }
}