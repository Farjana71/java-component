import java.util.Scanner;

public class eighth_class_assignment_solutions_pattern
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int row = in.nextInt(); // 4
//        int col = in.nextInt(); // 4

        // ****
        // **
        // ****
        for(int i =1;i<=6;i++){
            if(i%2==0) { // Even | 2 Star
                for (int j = 1; j <=6/2 ; j++) {
                    System.out.print("*");
                }

            }
            else{ // ODD Condition  // 4 star
                for (int j = 1; j <=6 ; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
// row =5, col =11
//          1
//        1 2 3
//      1 2 3 4 5
//    1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8 9 10 11
// row = 6, col=6
//          1
//        1 2
//      1 2 3
//    1 2 3 4
//  1 2 3 4 5
//1 2 3 4 5 6