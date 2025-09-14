class d_binary{
    public static void main(String[] args) {
        int[][] x= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        d_binary obj= new d_binary();
        obj.searching(x, 9);
    }
    public void searching(int[][] arr, int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            int ele= arr[row][col];
            if(ele== target){
                System.out.println("taget "+target+" found!");
                return;
            }
            else if(ele>target){
                col--;
            }
            else if(ele< target){
                row++;
            }
        }
        System.out.println(target+" is not found in this array :) ");

    }
}