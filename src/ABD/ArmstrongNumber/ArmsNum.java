package ABD.ArmstrongNumber;
import java.util.Scanner;
// Java program to determine whether the
// Number is Armstrong number or not
public class ArmsNum {
    // Function to calculate x raised to the
    // power y
    int power(int x, long y) {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
    // Function to calculate order of the number
    int order(int x) {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
    // Function to check whether the given number is
    // Armstrong number or not
    boolean isArmstrong(int x) {
        // Calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }
        // If satisfies Armstrong condition
        return (sum == x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArmsNum ob = new ArmsNum();
        int x;
       do {
            System.out.println("enter a number");
             x = sc.nextInt();
        System.out.println(x + " : " + ob.isArmstrong(x));
    }
       while(x!=-1);
    }
}