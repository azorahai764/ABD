package ABD.Learnovate.class4;
class shape1{
    void area(){
        System.out.println("Display area:");
    }
}
class triangle extends shape1{
    void area(int b, int h){
        float c=0.5f*b*h;
        System.out.println("Area of triangle: "+c);
    }
}
class equilateral_triangle extends triangle{
    void area(int side){
        System.out.println("Area of equilateral triangle is: "+((1.73f/4)*(side*side)));
    }
}
public class shape {
    public static void main(String[] args) {
        equilateral_triangle e=new equilateral_triangle();
        e.area();
        e.area(4,5);
        e.area(3);
    }
}

