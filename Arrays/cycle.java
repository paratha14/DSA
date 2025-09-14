import java.util.Arrays;
class cycle{
    public static void main(String[] args) {
        int[] test={3,5,2,1,4};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(test)+"\n");
        cycle obj= new cycle();
        System.out.println("after sorting");
        obj.cycle_Sort(test);

    }
    public void cycle_Sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int pos= arr[i]-1;
            if(arr[i] != arr[pos]){
                int temp= arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }
            else{
             i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}