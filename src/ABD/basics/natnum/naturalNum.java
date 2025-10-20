package ABD.basics.natnum;
import java.util.Scanner;
class A{
    void sumOfNum(int num){
        int sum=0;
         for(int i = 1; i <= num; i++){
            sum+=i;
        }
        System.out.println("Sum of n natural numbers is: "+sum);
    }
}
public class naturalNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        A a=new A();
        System.out.print("enter a number: ");
        int x= sc.nextInt();
        a.sumOfNum(x);
    }
}
