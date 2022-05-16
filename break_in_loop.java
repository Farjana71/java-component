import java.util.Scanner;

public class break_in_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = 4;
        int col = 4;
// 4*4 = 16
        for (int index_A =1;index_A<=row;index_A++ ){
            System.out.print("1");
            //System.out.printf("1 : index_A:%d \n",index_A);
            for (int index_B = 1; index_B<=col;index_B++){
                //System.out.printf("I'm in the 2nd loop : 1 : index_B : %d \n",index_B);
                System.out.print("1");
            }
            System.out.println();
        }

        // 2D array
//        1111
//        1111
//        1111
//        1111

        for (int i =1;i<=4;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//Homework:
//1234
//123
//12
//1