package ABD.Learnovate.class7;
class Animal {
    void legs(){
        int leg=4;
        System.out.println(leg);
    }
}
class Dog extends Animal{

}
public class legs {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.legs();
    }
}
