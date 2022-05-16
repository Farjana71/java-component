import java.util.Scanner;
public class salary {

    public static void main(String[] args)  {

        Scanner in = new Scanner (System.in);

        // Input
        int employees_number = in.nextInt();
        int worked_hours = in.nextInt();
        float payment = in.nextFloat();
        System.out.println("NUMBER = "+employees_number);
        System.out.printf("SALARY = U$ %.2f\n",worked_hours*payment);


    }

}