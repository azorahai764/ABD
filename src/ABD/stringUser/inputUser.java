package ABD.stringUser;
import java.util.Scanner;
public class inputUser {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter first name:");
//        String F=sc.next();
//        System.out.println("enter last name: ");
//        String L=sc.next();
//        System.out.println("enter city");
//        String C=sc.next();
//        System.out.println("Hello "+F+" "+L+", welcome to "+C);
        String s="I am learning       about      strings   in java";
        int count=0;
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }}
            if(s.charAt(0)==' '){
                System.out.println(count);
            }
            else{
                System.out.println(count+1);
            }

    }
}
