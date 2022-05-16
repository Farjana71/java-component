import java.util.Scanner;

public class sms_typing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // test case // Line
        int test_case = in.nextInt();
        String temp = in.nextLine();
/*      while(test_case--!=0){

        }*/
        String one = "abc ";
        String two = "def ";
        String three = "ghi ";
        String four = "jkl ";
        String five = "mno ";
        String six ="pqrs";
        String seven ="tuv ";
        String eight = "wxyz";
        String nine = " ";
        int i =1;
        // While Loop // 2  test_case = test_case-1;
        while (test_case-->0){ // test_case-- !=0
            int count_character = 0;
            String typeing_input = in.nextLine(); // hello
            //System.out.println(typeing_input);
            int index=0;
            for (int j = 0; j <typeing_input.length() ; j++) {
                for (int k = 0; k <4 ; k++) {
                    if(typeing_input.charAt(j)==one.charAt(k) ||typeing_input.charAt(j)==two.charAt(k)
                            || typeing_input.charAt(j)==three.charAt(k) || typeing_input.charAt(j)==four.charAt(k)
                            || typeing_input.charAt(j)==five.charAt(k) || typeing_input.charAt(j)==six.charAt(k)
                            || typeing_input.charAt(j)==seven.charAt(k) || typeing_input.charAt(j)==eight.charAt(k)
                            || typeing_input.charAt(j)==nine.charAt(0)) {
                        count_character = count_character + (k + 1);
                        break;
                    }
//                    else
//                    {
//                        count_character=count_character+4;
//                        break;
//                    }
                }

            }
            System.out.printf("Case #%d: %d\n",i++,count_character);

        }
        // For Loop
//        for (int i = 1; i <=test_case ; i++) {
//            int count_character = 0;
//            String typeing_input = in.nextLine(); // hello
//            //System.out.println(typeing_input);
//            int index=0;
//            for (int j = 0; j <typeing_input.length() ; j++) {
//                for (int k = 0; k <4 ; k++) {
//                    if(typeing_input.charAt(j)==one.charAt(k) ||typeing_input.charAt(j)==two.charAt(k)
//                    || typeing_input.charAt(j)==three.charAt(k) || typeing_input.charAt(j)==four.charAt(k)
//                    || typeing_input.charAt(j)==five.charAt(k) || typeing_input.charAt(j)==six.charAt(k)
//                    || typeing_input.charAt(j)==seven.charAt(k) || typeing_input.charAt(j)==eight.charAt(k)
//                    || typeing_input.charAt(j)==nine.charAt(0)) {
//                        count_character = count_character + (k + 1);
//                        break;
//                    }
////                    else
////                    {
////                        count_character=count_character+4;
////                        break;
////                    }
//                }
//
//            }
//            System.out.printf("Case #%d: %d\n",i,count_character);
//        }
    }
}