package ABD.Learnovate.class3;
class Animal{
    void makesound(){
        System.out.println("Animal makes a sound.");
    }
}
class DOG1 extends Animal{
    void bark(){
        System.out.println("Dog barks..");
    }
}
public class Dog {
    public static void main(String[] args) {
        DOG1 a=new DOG1();
        a.makesound();
        a.bark();
    }
}
