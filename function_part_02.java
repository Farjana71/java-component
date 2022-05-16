public class function_part_02 {


    static void hello(){ //(Parameter = datatype variable_name )
        System.out.println("Hello! World");

    }
    static  int odd(int num){
        if(num%2!=0){
            return num;
        }
        else return 0;

    }
    public static void main(String[] args) {
        hello();
        int check = odd(15);
        System.out.println("ODD: "+check);
    }
}