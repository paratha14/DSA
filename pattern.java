class pattern{
    public static void main(String[] args) {
        pattern1(4);
        System.out.println("\n Next Pattern: \n");
        pattern2(5);
        System.out.println("\n Next Pattern: \n");
        pattern3(5);
        System.out.println("\n Next Pattern: \n");
        pattern4(5);
        System.out.println("\n Next Pattern: \n");
        pattern5(5);
        System.out.println("\n Next Pattern: \n");
        pattern6(5);
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


    /*
     printing:
     * * * * *
     * * * *
     * * *
     * *
     *

     */

    public static void pattern3(int n){
        for (int i = n; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {
                System.out.print("* ");

            }
            System.out.println();


        }
    }

    /*
    printing:
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */

    public static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
                System.out.println();
        }
    }

    /*
     printing
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    *
    *

      */

    public static void pattern5(int n){
        for (int i = 1; i <n*2 ; i++) {
            if(i<=n){
                for (int j = 1; j <=i ; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
            else if(i>n){
                for (int j = 1; j <=(n*2 - i) ; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }

        }
    }

    public static void pattern6(int n) {

        for (int i = 1; i <= n; i++) {

            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}