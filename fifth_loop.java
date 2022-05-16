import java.util.Scanner;

public class fifth_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Hello World");
//        System.out.println("Hellow World");
//        System.out.println("Hello World");
//        System.out.println("Hello world");
//        System.out.println("Hello World");
//        System.out.println("Hellow World");
//        System.out.println("Hello World");
//        System.out.println("Hello world");
//        System.out.println("Hello World");
//        System.out.println("Hellow World");
//        System.out.println("Hello World");
//        System.out.println("Hello world");

        // Structure :
        //for ( variable (initialization), (x<=5)condition, increment, decrement)
        // i++ == i+=1 == i=i+1
        // i-- == i-=1 == i=i-1
//        //increment vs decrement
//       i =5;
//       i++ ==== i=i+1 = 5+1 =6
//       j =6;
//       j-- ==== j= j-1 = 6-1=5
        // 1 -100 - Sum
        int sum=0;
        for (int start =1;start<=100;start++){
            //System.out.printf("Hello World , Index : %d\n",start);
            System.out.println("Before Calculation : Number : "+start+" Sum: "+sum);
            sum = sum+start;
            System.out.println("After Calculation : Number : "+start+" Sum: "+sum);
        }
        System.out.println(sum);


    }
}