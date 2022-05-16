import java.util.Scanner;

public class java_class_part01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner on = new Scanner(System.in);

        object_oriented_class eshikhon = new object_oriented_class(100,50);
        int total = eshikhon.total_members();
        System.out.println("Total Members of Eshikhon : "+total);
        object_oriented_class Youtube = new object_oriented_class(1000,100);
        int result = Youtube.total_members();
        System.out.println("Total Members of Youtube : "+result);

    }
}
class object_oriented_class{
    int students;
    int instructor;

    object_oriented_class(int students,int instructor){
        this.instructor=instructor;
        this.students = students;
    }
    int total_members (){
        return instructor+students;
    }
}