package ABD.Learnovate.Encapsulation2;

class Student {
    private String name;
    private int rollNumber;
    private int marks;
    void setName(String name) {
        this.name=name;
    }
    void setroll(int rollNumber) {
        this.rollNumber=rollNumber;
    }
    void setMarks(int marks) {
        this.marks=marks;
    }
    String getName() {
        return name;
    }
    int getRollNumber() {
        return rollNumber;
    }
    int getMarks() {
        return marks;
    }


}
