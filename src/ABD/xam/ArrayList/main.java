package ABD.xam.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("A");
        list.add("B");
        list.set(1,"C");
        System.out.println(list);
    }
}
