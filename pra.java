import java.util.Scanner;
import java.util.Arrays;
class pra{
    public static void main(String[] args) {
        int[] a={1,4,2,5,9};
        int[] res= prefixArray(a);
        System.out.println(Arrays.toString(res));
        int s=sum(a, 2,4);
        System.out.println(s);
    }

    public static int[] prefixArray(int[] arr){
        int n= arr.length;
        int[] pre= new int[n];
        pre[0]= arr[0];
        int s=arr[0];
        for(int i=1;i<n;i++){
            s+=arr[i];
            pre[i]=s;
        }
        return pre;
    }

    public static int sum(int[] x, int l, int r){
        int[] pre= prefixArray(x);
        int s=0;
        if(l==0){
            s= pre[r];
        }
        else{
            s= pre[r]-pre[l-1];;
        }
        return s;
    }
}