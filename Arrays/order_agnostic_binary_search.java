class order_agnostic_binary_search{
    public static void main(String[] args) {
        order_agnostic_binary_search x= new order_agnostic_binary_search();
        int[] b= {69,60,52,39,21,11,7};
        x.order_agnostic_search(b,11);

    }

    void order_agnostic_search(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        if(arr[start]<arr[end]){
            //ascending order sorted array
            while(start<=end){
                int mid= end-start/2;
                if(arr[mid]==target){
                    System.out.println("element found, at position: "+mid);
                    return;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target> arr[mid]){
                    start=mid+1;
                }
            }
            System.out.println("element not found");
        }

        else{
            //descending order sorted array
            while(start<=end){
                int mid= end-start/2;
                if(arr[mid]==target){
                    System.out.println("element found, at position: "+mid);
                    return;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
                else if(target> arr[mid]){
                    end=end-1;
                }
            }
            System.out.println("element not found");
        }
    }
}