package ABD.Learnovate.timepass;

class Super1 {
void hi(){
    System.out.println("hola");
}
}
class A extends Super1{
    void hi(){
        super.hi();
        System.out.println("hello");
    }
}
