class floor{
    public static void main(String[] args) {
        floor x= new floor();
        int[] b={1,3,7,8,9,12};
        System.out.println(x.floor_of_a_number(b,10));
    }

    int floor_of_a_number(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+ (end-start)/2;

            if(target<arr[mid]){

                end=mid-1;

            }
            else if(target>arr[mid]){

                start=mid+1;

            }
            else{
                return arr[mid];
            }

        }
        return arr[end];
    }
}