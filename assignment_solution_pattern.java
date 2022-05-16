public  class assignment_solution_pattern
{

    //assignment:
//1234
//123
//12
//1
    public static void main(String[] args) {
        for (int i = 4; i >=1 ; i--) {
            System.out.println("i: "+i);
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}