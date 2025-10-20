package ABD.Learnovate.class5;
class Vehicle1{
    void displayType(){
        System.out.println("This is a vehicle.");
    }
}
class bike extends Vehicle1{
    void displayType(String bikename){
        System.out.println("This is a bike: "+bikename);
    }
}
public class vehicle {
    public static void main(String[] args) {
        bike b=new bike();
        b.displayType();
        b.displayType("Harley");
    }
}
