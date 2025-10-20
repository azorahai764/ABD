package ABD.Learnovate.class6;
class Person{
    void person(String name) {
        System.out.println("Name of student: "+name);
    }
}
class Student extends Person {
void study(){
    System.out.println("Student is studying.");
}
}
public class Student1 {
    public static void main(String[] args) {
        Student b = new Student();
        b.person("Vaibhav");
        b.study();
    }
}