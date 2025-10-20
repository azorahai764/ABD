package ABD.compare;

public class S implements Comparable<S>{
    int roll;
    float marks;
    S(int roll,float marks) {
        this.roll=roll;
        this.marks=marks;
    }
    public int compareTo(S o) {
        int diff=(int)(this.marks-o.marks);
    return diff;
    }
}