package ABD.basics.factorial;
import java.util.Scanner;
class A{
    int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n*fact(n-1);
       }
    }
}
public class Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A a=new A();
        System.out.print("enter a number: ");
        int x=sc.nextInt();
        int y= a.fact(x);
        System.out.print("Factorial of "+x+" is: "+y);
    }
}
