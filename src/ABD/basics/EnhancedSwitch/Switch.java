package ABD.basics.EnhancedSwitch;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        int day;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("enter a day: ");
            day = sc.nextInt();
            switch (day) {
                case 1 -> System.out.println("monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid day");
            }
        }while (day!=0);
    }
}
