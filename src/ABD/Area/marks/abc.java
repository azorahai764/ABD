package ABD.Area.marks;
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a marks");
        int a=sc.nextInt();
        System.out.println("enter b marks");
        int b=sc.nextInt();
        System.out.println("enter c marks");
        int c=sc.nextInt();
        System.out.println("enter d marks");
        int d=sc.nextInt();
        System.out.println("enter e marks");
        int e=sc.nextInt();
        float avg=(a+b+c+d+e)/5f;
        String result=(avg>=45)?"pass":"fail";
        System.out.println(result);
    }
}
