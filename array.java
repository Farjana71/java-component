import java.util.Scanner;

public  class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//          1D array
//        int array [] = new int[4];
//         //single input of array
//        array[0] = in.nextInt();
//        array[1]  = in.nextInt();
//        array[2] = in.nextInt();
//        array[3]  = in.nextInt();
//        System.out.printf("%d %d %d %d",array[0],array[1],array[2],array[3]);
//        // 0 1 2 3

        // Array input using Loop

//        for (int index = 0; index <=4 ; index++) { // 0 1 2 3 4 5
//            array[index] = in.nextInt() ;
//            System.out.printf("%d\n",array[index]);
//        }

        // 2D Array ----------
        // Structure
        // data_type [][] variable_name = new data_type [row][col]

        int [][] two_dimension_array = new int[2][2];

        // row =2 , col =2
//        |- - - - - -
//        0| 0  1
//        1| 0  1
//        |


        two_dimension_array [0][0] =10;
        two_dimension_array [0][1] =11;
        two_dimension_array [1][0] =12;
        two_dimension_array [1][1] =13;

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(two_dimension_array[i][j]+" ");
            }
            System.out.println();
        }




    }
}