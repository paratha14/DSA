class pattern{
    public static void main(String[] args) {
        pattern1(4);
        System.out.println("\n Next Pattern: \n");
        pattern2(5);
        System.out.println("\n Next Pattern: \n");
        pattern3(5);
    }

/*          printing
            *
            * *
            * * *
            * * * * */

    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* printing

     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *

     */

    public static void pattern2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

    public static void pattern3(int n){
        for (int i = n; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");

            }
            System.out.println();


        }
    }
}