package ABD.ifelse;
import java.util.Scanner;
public class minormajor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age: ");
    int age =sc.nextInt();
    if(age<18) {
        System.out.println("minor");

    }
    else{
        System.out.println("major");
    }
    }
}
