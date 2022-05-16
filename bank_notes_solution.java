import java.util.Scanner;

public class bank_notes_solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        // 123
        int hundred_taka_note = amount/100;
        int rest_of_the_amount = amount%100;
        System.out.println("১০০ টাকার নোট  : "+hundred_taka_note+"টা");
        int fifty_taka_note = rest_of_the_amount/50;
        rest_of_the_amount = rest_of_the_amount%50;
        System.out.println("৫০ টাকার নোটঃ "+fifty_taka_note+"টা ");
        int twenty_taka_note = rest_of_the_amount/20;
        rest_of_the_amount = rest_of_the_amount%20;
        System.out.println("২০ টাকার নোটঃ "+twenty_taka_note+"টা ");

        int ten_taka_note = rest_of_the_amount/10;
        rest_of_the_amount = rest_of_the_amount%10;
        System.out.println("১০ টাকার নোটঃ "+ten_taka_note+"টা ");

        int five_taka_note = rest_of_the_amount/5;
        rest_of_the_amount = rest_of_the_amount%5;
        System.out.println("৫ টাকার নোটঃ "+five_taka_note+"টা ");

        int two_taka_note = rest_of_the_amount/2;
        rest_of_the_amount = rest_of_the_amount%2;
        System.out.println("২ টাকার নোটঃ "+two_taka_note+"টা ");

        int one_taka_note = rest_of_the_amount/1;
        rest_of_the_amount = rest_of_the_amount%1;
        System.out.println("১  টাকার নোটঃ "+one_taka_note+"টা ");
    }
}
// homework
//// 123
//
////digit count + digit sum
//output : 3  digits
//         digits sum = 1+2+3 = 5
//
//// 1050, 4 digits and sum = 1+0+5+0 = 6


