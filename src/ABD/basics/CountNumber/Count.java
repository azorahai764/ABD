package ABD.basics.CountNumber;
import java.util.Scanner;
class A{
    void count(int n){
        int count=0;
        int temp;
        while(n!=0){
            temp=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A a=new A();
        System.out.println("Enter a number: ");
        int x= sc.nextInt();
        System.out.println("total digits in "+x+" are: ");
        a.count(x);

    }
}
