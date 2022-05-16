import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //         Structure
//         while (condition):
//          {
//         statement 1 --------------- statment n
//
//         increment or decrement  // i++/i--
//
//        }
        int input = 10;
        while (input >= 0) {
            if (input % 2 == 0) {
                System.out.printf("Number : %d , Even\n",input);
            } else {
                System.out.printf("Number : %d , ODD\n",input);
            }
            input--;

        }

        // Do- while
        // Structure
//        do{
//            statement 1------------
//                -----------
//                ----------
//                statement n.
//                increment/decrement
//        }
//        while(condition )

        // Example
        int temporary =10;
        do{
            System.out.println("Hello");
            temporary--;
        }
        while (temporary>=1);
    }
}