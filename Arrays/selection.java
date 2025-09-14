import java.util.Arrays;
class selection{
    public static void main(String[] args) {
        int[] h={3,1,23,5,4,2,7};
        selection obj= new selection();
        System.out.println(Arrays.toString(obj.selection_Sort(h)));
    }

    public int[] selection_Sort(int[] arr){
        for(int i= 0; i<arr.length;i++){
            int min=arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]<=min){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[i];
                    arr[i]= temp;

                    min=arr[j];
                }
            }
        }
        return arr;
    }
}