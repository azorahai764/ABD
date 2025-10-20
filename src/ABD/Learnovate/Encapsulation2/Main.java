package ABD.Learnovate.Encapsulation2;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Vaibhav");
        s.setroll(56);
        s.setMarks(100);
        System.out.println(s.getName());
        System.out.println(s.getRollNumber());
        System.out.println(s.getMarks());
    }
}
