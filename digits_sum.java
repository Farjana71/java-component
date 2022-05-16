import java.util.Scanner;

public class digits_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int digits = in.nextInt();

//        int qou = digits/10;
//        int rem = digits%10;
//        System.out.println("Qou :"+qou);
//        System.out.println("Rem: "+rem);
//        for (;digits<0;)
        //Infinity Loop
//        for(;;){
//            System.out.println("I'm the infinity ");
//        }
        // while
//        while (true){
//            System.out.println("I'm the storm!");
//        }
        int sum = 0;
//        for(;digits>0;){ // 123 | 12 | 1 | Got 0 , the loop is ended ...
//            int rem = digits%10; //3 | 12%10 = 2 | 1%10 = 1 |
//            sum=sum+rem; // 0+3 =3 | 3+2 = 5 | 5+1 =6
//            digits = digits/10; // digits = 123/10= 12 | 12/10 = 1 | 1/10 =0
//        }
//

        // 123 = 1+2+3 =6 , 1+3 =4
//        while (digits>0){
//            int rem = digits%10; //3 | 12%10 = 2 | 1%10 = 1 |
//            sum=sum+rem; // 0+3 =3 | 3+2 = 5 | 5+1 =6
//            digits = digits/10; // digits = 123/10= 12 | 12/10 = 1 | 1/10 =0
//        }
//        System.out.println("Sum : "+sum);
        // odd digits sum

        while (digits > 0) {
            int digit = digits % 10;
            digits = digits / 10;
            if (digit % 2 == 0) ;
            else {
                sum = sum + digit;
            }
        }
        System.out.println("Sum = " + sum);
    }

}
