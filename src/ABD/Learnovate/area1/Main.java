package ABD.Learnovate.area1;
import java.util.Scanner;

class ShapeArea {

    void area(int a) {
        System.out.println("Area of square: "+(a*a));
    }

    void area(int l,int b) {
        System.out.println("Area of rectangle: "+(l*b));
    }

    void area(float radius) {
        System.out.println("Area of circle: "+(3.14*radius*radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ShapeArea s=new ShapeArea();
        System.out.println("Enter side: ");
        int x=sc.nextInt();
        s.area(x);
        System.out.println("Enter length:");
        int y= sc.nextInt();
        System.out.println("Enter breadth: ");
        int z=sc.nextInt();
        s.area(y,z);
        System.out.println("Enter radius: ");
        float w=sc.nextFloat();
        s.area(w);
    }
}