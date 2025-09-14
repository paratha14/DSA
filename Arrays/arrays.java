import java.util.Arrays;
import java.util.Scanner;
class arrays{
    public static void main(String[] args) {
        arrays obj = new arrays();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter range of array");
        int r = sc.nextInt();
        int[] arr = new int[r];
        System.out.println("enter elements");
        for (int i = 0; i < r; i++) {
            System.out.println("enter element at index: " + i);
            arr[i] = sc.nextInt();
        }

        int ma= obj.max_value(arr);
        System.out.println("max value in the array is : "+ma);
        System.out.println("reversed array is: ");
        obj.reverse(arr);
    }


    int max_value(int[] arr){
        int max=arr[0];
        for(int i: arr){
            if(i>max){
                max=i;
            }
        }
        return max;

    }

    void reverse(int[] arr){
        int l= arr.length;
        int mid= l/2;
        for(int i=0;i<mid;i++){
            int temp= arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]= temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}