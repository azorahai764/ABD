package ABD.Palindrome;
import java.util.Scanner;
class A{
    int n;
    A(int n){
        this.n=n;
    }
    public void Palindrome(){
        int temp=n;
        int reversed_n=0;
        int remainder;
        while(n!=0){
            remainder=n%10;
            reversed_n=(reversed_n*10)+remainder;
            n/=10;
       }
        if(reversed_n==temp){
            System.out.println("Number "+reversed_n+" is a palindrome");
        }
        else{
            System.out.println("Number "+reversed_n+" is not a palindrome");
        }
    }
}
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x=sc.nextInt();
        A a=new A(x);
        a.Palindrome();
    }
}
