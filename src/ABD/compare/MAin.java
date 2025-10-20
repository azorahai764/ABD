package ABD.compare;
public class MAin {
    public static void main(String[] args) {
        S s=new S(1,97.0f);
        S d=new S(2,89.0f);

        if (s.compareTo(d)>0) {
        System.out.println(s.compareTo(d));
        System.out.println("h");
    }}
}
