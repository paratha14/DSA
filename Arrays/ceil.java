class ceil{
    public static void main(String[] args) {
        ceil x= new ceil();
        int[] b={1,3,7,8,9,12};
        System.out.println(x.ceiling_of_a_number(b,10));
    }

    int ceiling_of_a_number(int[] arr, int target){
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
                return mid;
            }

        }
        return arr[start];
    }
}