package ABD.Learnovate.class2;
class S{
    String colour;
    int price;
    float speed;
    String model;

    void run(){
        System.out.println("Car is running.");
    }
    void brake(){
        speed--;
        System.out.println(speed);
    }
}
class A extends S{

}
public class Car {
    public static void main(String[] args) {
        S s=new S();
        s.colour="RED";
        s.price=200000;
        s.speed=250;
        s.brake();
    }
}
