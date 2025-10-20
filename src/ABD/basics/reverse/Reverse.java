package ABD.basics.reverse;
import java.util.Scanner;
class A{
    void reverseNum(int n){
       int rev=0;
       int temp;
       while(n!=0){
           temp=n%10;
           rev=rev*10+temp;
           n/=10;
       }
        System.out.println(rev);
    }
        }
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A a=new A();
        System.out.println("Enter a number: ");
        int x= sc.nextInt();
        System.out.println("reversed number of "+x+" is: ");
        a.reverseNum(x);
    }
}
