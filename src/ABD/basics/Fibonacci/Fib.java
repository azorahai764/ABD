package ABD.basics.Fibonacci;
import java.util.Scanner;
class A{
    long fibonacci(long n){
        if (n==0){
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
public class Fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A a=new A();
        System.out.println("Enter a number");
        long x= sc.nextInt();
        long y= a.fibonacci(x);
        System.out.println("Fibonacci of "+x+" is: "+y);
    }
}