package ABD.Area;
class A{
    static int e=10;
   void rectangle(int a,int b){
       int c=a*b;
       System.out.println("area of rectangle is: "+c);
   }
   void triangle(int base,int height){
       float c=0.5f*base*height;
       System.out.println("area of triangle is; "+c);
   }
   void circle(int radius){
       float c=3.14f*radius*radius;
       System.out.println("area of circle is: "+c);
   }
   void sphere(int radius){
       float c=(4f/3f)*3.14f*(radius*radius*radius);
       System.out.println("area of sphere is: "+c);
   }
}
public class area {
    public static void main(String[] args) {
        A d=new A();
        d.rectangle(4,6);
        d.triangle(3,4);
        d.circle(5);
        d.sphere(6);
    }
}
