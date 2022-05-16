import java.util.Scanner;

public class area_of_a_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        float radious = in.nextFloat();
        float area = (float) pi*radious*radious;
        System.out.println("A="+area);
    }

}