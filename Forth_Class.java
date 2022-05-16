import java.util.Scanner;

public class Forth_Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Even / ODD
        System.out.println(
                "Please Enter  a digit: "
        );
        int digit = in.nextInt();
        if (digit%2==0){
            System.out.println("Even");
        }
        else if (digit%3==0){
            System.out.println("this digit is divided by 3");
        }
        else{
            System.out.println("ODD");
        }

    }
}