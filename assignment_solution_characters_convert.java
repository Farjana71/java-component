import java.util.Scanner;

public class assignment_solution_characters_convert {

    // A-> a
    // B -> b
    // C -> c
//    ..........
//            ............
//
    // Using ASCII Table

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Please Enter a UpperCase character : ");
        // char character_input = in.next().charAt(0);
        //System.out.println("LowerCase character : "+(char)(character_input+32));

        // Array --------> Data storage
//        char a ='A';
//        char b = 'B';
//
        char[] array_characters_upper_case = new char[26];
        //index start =0
        // index end = array_size-1
        // 0 1 2 3 4 5 .... 25
        // Structure
        // datatype(int/char/String/Double/Float) [] variable_name = new datatype [array_size]
        // int [] array_intergers = new int[10]
        // float [] array_float = new float[10]
        int index_of_array = 0;
        for (int i = 65; i <=90 ; i++) {
            //System.out.printf("%c \t",(char)(i+32));
            array_characters_upper_case [index_of_array]= (char)i;
            index_of_array= index_of_array+1;

        }
//        for (int i = 0; i <26 ; i++) {
//
//            System.out.printf("index : %d , value : %c \n ",i,array_characters[i]);
//        }

        char array_characters_lower_case[] = new char[26];

        for (int i = 0; i <26 ; i++) {
            array_characters_lower_case[i]= (char)(array_characters_upper_case[i]+32);

        }
        for (int i = 0; i < 26; i++) {
            System.out.printf("index : %d , value_Lower_case : %c \n ",i,array_characters_lower_case[i]);

        }

//
        //////// **********
        //////// *****
        //////// **********
        ///////  *****
        //////   **********

    }
}